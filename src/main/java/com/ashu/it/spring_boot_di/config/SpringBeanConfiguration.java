package com.ashu.it.spring_boot_di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashu.it.spring_boot_di.beans.Address;

@Configuration
public class SpringBeanConfiguration {

    @Bean("address2")
    public Address getaddressTwo() {
        System.out.println("SpringBeanConfiguration.getaddressTwo()");
        Address address = new Address();
        address.setCity("Bangalore");
        address.setPincode(560037);
        address.setState("Karnataka");
        return address;
    }
}
