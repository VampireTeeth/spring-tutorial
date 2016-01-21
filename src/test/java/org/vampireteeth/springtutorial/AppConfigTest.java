package org.vampireteeth.springtutorial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vampireteeth.springtutorial.beans.Account;
import org.vampireteeth.springtutorial.service.AccountService;

public class AppConfigTest {

	@Test
	public void testTransferAspect() throws Exception {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {

			ctx.register(AppConfig.class);
			ctx.refresh();
			Account stevenAcct = (Account) ctx.getBean("stevenAccount");
			stevenAcct.transfer(stevenAcct);
			
			AccountService acctService = (AccountService) ctx.getBean("accountService");
			acctService.transfer(stevenAcct, stevenAcct);
		}
	}
}
