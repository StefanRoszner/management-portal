package at.co.feineweine.model;

import org.junit.Test;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void whenCreatingCustomer_ThenCorrectValuesAreSet() {
        Customer customer = new Customer("Stefan", "Roszner", "stefan.roszner@gmail.com", LocalDate.of(1995, 10, 3));
        assertEquals("Stefan", customer.getName());
        assertEquals("Roszner", customer.getSurname());
        assertEquals("stefan.roszner@gmail.com", customer.getEmail());
        assertEquals(LocalDate.of(1995, 10, 3), customer.getDate());
    }

}