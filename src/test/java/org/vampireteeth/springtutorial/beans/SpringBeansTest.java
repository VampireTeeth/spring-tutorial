package org.vampireteeth.springtutorial.beans;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeansTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"org/vampireteeth/springtutorial/beans/beans.xml");

		try {
			Person person = (Person) context.getBean("person");
			System.out.println(person);
			Person person1 = (Person) context.getBean("person");
			System.out.println(person1);
			
			
			Address addr1 = (Address)context.getBean("address");
			Address addr2 = (Address)context.getBean("address");
			System.out.println(addr1);
			System.out.println(addr2);
		} finally {
			context.close();
		}
	}

}
