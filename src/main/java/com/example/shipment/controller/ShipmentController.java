package com.example.shipment.controller;

import com.example.shipment.model.Shipment;
import com.example.shipment.service.ShipmentService;
import com.example.shipment.service.ShipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @GetMapping("/{trackingNumber}")
    public Shipment getShipment(@PathVariable long trackingNumber) {
        return shipmentService.getShipment(trackingNumber);
    }

    @PostMapping("/addshipment")
    public Shipment createShipment(@RequestBody Shipment shipment) {
        return shipmentService.createShipment(shipment);
    }


    @DeleteMapping("/{trackingNumber}")
    public void deleteShipment(@PathVariable long trackingNumber){
        shipmentService.deleteShipment(trackingNumber);
    }

}
