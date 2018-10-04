package at.co.feineweine.model;

import java.time.LocalDate;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private LocalDate date;

    public Customer(String name, String surname, String email, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
