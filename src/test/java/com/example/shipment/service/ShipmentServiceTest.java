package com.example.shipment.service;

import com.example.shipment.model.Shipment;
import com.example.shipment.repository.ShipmentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class ShipmentServiceTest {
    @InjectMocks
    private ShipmentServiceImpl shipmentService;

    @InjectMocks
    private Shipment shipment;

    @Mock
    private ShipmentRepository shipmentRepository;

    @Before
    public void initializeDummyShipment() {
        shipment.setName("name");
        shipment.setTrackingNumber(1L);
    }

    @Test
    public void getShipmentTest_Shipment_Success() {
        when(shipmentRepository.findByTrackingNumber(any())).thenReturn(shipment);
        Shipment result = shipmentService.getShipment(1L);
        result.getTrackingNumber();
        assertNotNull(result);
        assertEquals(result, shipment);
    }

    @Test
    public void createShipment_Shipment_Success() {
        
    }
}
