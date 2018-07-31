package com.cg.walletapplicationphase1.service;

import java.math.BigDecimal;

import com.cg.walletapplicationphase1.exception.WalletException;
import com.cg.walletapplicationphaseone.bean.Customer;


public interface IWalletService {
	/*******************************************************************************************************
	 - Interface Name	:	<IWalletService>
	 - Input Parameters	:	<null>
	 - Return Type		:	<null>
	 - Throws			:  	<null>
	 - Author			:	<Neti_Venkata_Praveena>
	 - Creation Date	:	31/07/2018
	 - Description		:	methods declaration
	 ********************************************************************************************************/ 
public String addCustomer(Customer customer) throws WalletException;

public Customer showBalance(String mobileNum, String password) throws WalletException;

public Customer  check(String mobileNum, String password) throws WalletException;

public void deposit(Customer customer, BigDecimal amount);

public boolean  withDraw(Customer customer, BigDecimal amount) throws WalletException;

public boolean isFound(String receiverMobile) throws WalletException;

public boolean transfer(String senderMobile, String receiverMobile, BigDecimal amount) throws InterruptedException, WalletException;

public boolean checkEnteredAmount(BigDecimal amount) throws WalletException;

public void checkName(String name) throws WalletException;

public void checkMobileNumber(String mobileNumber) throws WalletException;

public void checkPassword(String password) throws WalletException;

public void checkEmail(String emailId) throws WalletException;

}
