package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer1;

    @Before
    public void before(){
        customer1 = Customer
                .builder()
                .firstName("John")
                .lastName("Doe")
                .town("Edinburgh")
                .age(30)
                .build();
    }

    @Test
    public void getFirstName() {
        assertEquals("John",customer1.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Doe",customer1.getLastName());
    }

    @Test
    public void getTown() {
        assertEquals("Edinburgh", customer1.getTown());
    }

    @Test
    public void getAge() {
        assertEquals(30,customer1.getAge());
    }
}