package com.cg.walletapplicationphase1.repo;

import java.util.TreeMap;

import com.cg.walletapplicationphaseone.bean.Customer;



public class WalletRepoImpl implements IWalletRepo{
	/*******************************************************************************************************
	 - Class Name	    :	<WalletRepoImpl>
	 - Input Parameters	:	<null>
	 - Return Type		:	<database details>
	 - Throws			:  	<null>
	 - Author			:	<Neti_Venkata_Praveena>
	 - Creation Date	:	31/07/2018
	 - Description		:	implement interface methods for getting details
	 ********************************************************************************************************/ 
public static TreeMap<String,Customer> customerDetails=null; 
static{
	customerDetails= new TreeMap<String, Customer>();
	
}
public TreeMap<String, Customer> getDetails() {
	
	return customerDetails;
}
public String addCustomer(Customer customer) {
	customerDetails.put(customer.getMobileNumber(), customer);
	return customer.getMobileNumber();
}
}
