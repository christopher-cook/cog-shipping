package com.example.shipment.service;

import com.example.shipment.model.Shipment;
import com.example.shipment.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService {
    @Autowired
    ShipmentRepository shipmentRepository;

    @Override
    public Shipment getShipment(long trackingNumber) {
        return shipmentRepository.findByTrackingNumber(trackingNumber);
    }

    @Override
    public Shipment createShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @Override
    public Shipment updateShipment(Shipment shipment) {
//        shipment.setName(name);
        return shipmentRepository.save(shipment);
    }

    @Override
    public void deleteShipment(Long trackingNumber) {
        shipmentRepository.deleteById(trackingNumber);
    }
}
