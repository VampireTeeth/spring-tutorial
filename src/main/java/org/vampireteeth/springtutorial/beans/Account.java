package org.vampireteeth.springtutorial.beans;

public class Account {

	private Person person;
	private String accountNumber;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void transfer(Account another) {
		System.out.println("Account.transfer()");
	}
	
	
}
