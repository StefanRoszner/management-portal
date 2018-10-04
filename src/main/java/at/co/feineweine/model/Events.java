package at.co.feineweine.model;

import java.text.SimpleDateFormat;
import java.util.UUID;

public class Events {

    private String name;
    private String description;
    private SimpleDateFormat date;
    private Double price;
    private Customer customer;

    public Events(String name, String description, SimpleDateFormat date, Double price, Customer customer) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
