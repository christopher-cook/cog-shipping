package com.example.shipment.service;

import com.example.shipment.model.Shipment;

public interface ShipmentService {
    public Shipment getShipment(long trackingNumber);

    Shipment createShipment(Shipment shipment);

    Shipment updateShipment(Shipment shipment);

    void deleteShipment(Long trackingNumber);
}
