package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportationOnVacationTest {
    @Test
    public void under3Tests() {
        assertEquals(40, TransportationOnVacation.rentalCarCost(1));
        assertEquals(80, TransportationOnVacation.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, TransportationOnVacation.rentalCarCost(3));
        assertEquals(140, TransportationOnVacation.rentalCarCost(4));
        assertEquals(180, TransportationOnVacation.rentalCarCost(5));
        assertEquals(220, TransportationOnVacation.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, TransportationOnVacation.rentalCarCost(7));
        assertEquals(270, TransportationOnVacation.rentalCarCost(8));
        assertEquals(310, TransportationOnVacation.rentalCarCost(9));
        assertEquals(350, TransportationOnVacation.rentalCarCost(10));
    }
}