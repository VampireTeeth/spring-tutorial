package org.vampireteeth.springtutorial.aspects;

public class DefaultUsageTracked implements UsageTracked{

	@Override
	public void incrementUsage() {
		System.out.println("DefaultUsageTracked.incrementUsage()");
	}

}
