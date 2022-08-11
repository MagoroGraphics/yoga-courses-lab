package com.magorographics.courses;

import models.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking firstBooking;

    @Before
    public void before(){
        firstBooking = Booking
                .builder()
                .date("01-11-1988")
                .build();
    }

    @Test
    public void hasDate(){
        assertEquals("01-11-1988", firstBooking.getDate());
    }
}
