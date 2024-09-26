package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CanInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnFare(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare=cabInvoiceGenerator.calculateFare(distance,time);
        assertEquals(25,fare);

    }
    @Test
    public void givenMinimumDistanceAndTime_ShouldReturnMinimumFare(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance =0.1;
        int time=1;
        double fare=cabInvoiceGenerator.calculateFare(distance,time);
        assertEquals(5.0,fare);
    }

}