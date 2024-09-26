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

}