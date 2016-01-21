package org.vampireteeth.springtutorial.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;
import org.vampireteeth.springtutorial.beans.Account;

@Aspect
@Component
public class BeforeAspects {
	
	@DeclareParents(value="org.vampireteeth.springtutorial.service.*+", 
			defaultImpl=DefaultUsageTracked.class)
	public static UsageTracked usageTracked;

	@Before("SystemPointcuts.anyTransfer() && SystemPointcuts.inService() && args(acct1, acct2, ..)")
	public void validateAccount(JoinPoint joinPoint, Account acct1, Account acct2) {
		System.out.println("BeforeAspects.validateAccount()");
		System.out.println(acct1);
		System.out.println(acct2);
	}
	

	@Before("SystemPointcuts.inService() && this(usageTracked)")
	public void trackUsage(UsageTracked usageTracked) {
		usageTracked.incrementUsage();
		System.out.println(usageTracked);
	}
}
