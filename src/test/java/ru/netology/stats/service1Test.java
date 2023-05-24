package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class service1Test {
    @Test
    public void testSum() {
        service1 service = new service1();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAverage() {
        service1 service = new service1();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMaximumSale() {
        service1 service = new service1();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaximumSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthMinimumSale() {
        service1 service = new service1();
        long[] sales = {8, 15, 5, 15, 17, 20, 2, 20, 7, 14, 14, 18};

        long actual = service.monthMinimumSale(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthOverAverage() {
        service1 service = new service1();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthOverAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMinimumAverage() {
        service1 service = new service1();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinimumAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}