package org.vampireteeth.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.vampireteeth.springtutorial.beans.Account;
import org.vampireteeth.springtutorial.beans.Address;
import org.vampireteeth.springtutorial.beans.Person;

@Configuration
@EnableAspectJAutoProxy	 
@ComponentScan
public class AppConfig {	 

	@Bean
	public Address stevenAddress() {
		Address address = new Address();
		address.setNumber(6);
		address.setStreet("Winter Street");
		address.setPostcode(2117);
		return address;
	}
	
	@Bean
	public Person steven() {
		Person person = new Person();
		person.setName("Steven Liu");
		person.setAge(32);
		person.setTaxId("12345678");
		person.setAddress(stevenAddress());
		return person;
	}
	
	@Bean
	public Account stevenAccount() {
		Account account = new Account();
		account.setAccountNumber("738574839305856859");
		account.setPerson(steven());
		return account;
	}
	
}
