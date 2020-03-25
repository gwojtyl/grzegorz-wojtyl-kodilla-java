package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        BigDecimal calculatedCost = taxiOrder.getCost();

        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasixTaxiOrderGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        String description = taxiOrder.getDescription();

        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        BigDecimal cost = taxiOrder.getCost();

        assertEquals(new BigDecimal(40), cost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        String description = taxiOrder.getDescription();

        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        BigDecimal cost = taxiOrder.getCost();

        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        String description = taxiOrder.getDescription();

        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatsGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        BigDecimal cost = taxiOrder.getCost();

        assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void testUberWithTwoChildSeatsGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        String description = taxiOrder.getDescription();

        assertEquals("Drive a course by Uber Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());

        BigDecimal cost = taxiOrder.getCost();

        assertEquals(new BigDecimal(52), cost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getDescription());

        String description = taxiOrder.getDescription();

        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
