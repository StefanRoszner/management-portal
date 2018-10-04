package at.co.feineweine.model;

import java.util.UUID;

public class Coupons {

    private Double value;
    private Customer customer;

    public Coupons(Double value, Customer customer) {
        this.value = value;
        this.customer = customer;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
