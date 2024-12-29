package com.ashu.it.spring_boot_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.it.spring_boot_di.beans.Address;
import com.ashu.it.spring_boot_di.beans.Customer;

@SpringBootApplication
public class SpringBootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootDiApplication.class, args);
		Address addressOne = (Address) context.getBean("address");
		System.out.println(addressOne);
		System.out.println(addressOne.getCity());
		//Address addressTwo =  context.getBean(Address.class);//works when there is only one bean object
		// Address addressTwo = (Address) context.getBean("address2");
		// System.out.println(addressTwo);
		// System.out.println(addressTwo.getCity());

		System.out.println("**************************************");
		Customer customer1 = context.getBean(Customer.class);
		System.out.println(customer1);	
		System.out.println(customer1.getAddress());
		context.close();
	}

}
