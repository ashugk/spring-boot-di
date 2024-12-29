package com.ashu.it.spring_boot_di.beans;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {

    private int pincode;
    private String city;
    private String state;

    public Address() {
            super();
            System.out.println("Address.Address()");
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

   

}
