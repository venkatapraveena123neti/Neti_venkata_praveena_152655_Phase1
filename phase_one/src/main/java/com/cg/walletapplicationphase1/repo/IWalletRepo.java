package com.cg.walletapplicationphase1.repo;

import java.util.TreeMap;

import com.cg.walletapplicationphaseone.bean.Customer;



public interface IWalletRepo {
	/*******************************************************************************************************
	 - Interface Name	:	<IWalletRepo>
	 - Input Parameters	:	<null>
	 - Return Type		:	<null>
	 - Throws			:  	<null>
	 - Author			:	<Neti_Venkata_Praveena>
	 - Creation Date	:	31/07/2018
	 - Description		:	methods declaration
	 ********************************************************************************************************/ 
	
	public TreeMap<String, Customer> getDetails();

	public String  addCustomer(Customer customer);

}
