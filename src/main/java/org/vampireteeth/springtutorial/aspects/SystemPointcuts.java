package org.vampireteeth.springtutorial.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemPointcuts {

	@Pointcut("execution(* transfer(..))")
	public void anyTransfer() {
		//System.out.println("NotVeryUsefulAspect.anyTransfer()");
	}
	
	@Pointcut("within(org.vampireteeth.springtutorial.service..*)")
	public void inService() {}
	
	
}
