package org.vampireteeth.springtutorial.service;

import org.springframework.stereotype.Service;
import org.vampireteeth.springtutorial.beans.Account;

@Service
public class AccountService {

	public void transfer(Account acct1, Account acct2) {
		acct1.transfer(acct2);
	}
	
}
