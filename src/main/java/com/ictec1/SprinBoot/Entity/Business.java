package com.ictec1.SprinBoot.Entity;

import jakarta.persistence.*;

@Entity
public class Business {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;
    @OneToOne(cascade = {CascadeType.ALL})
    private Location location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
