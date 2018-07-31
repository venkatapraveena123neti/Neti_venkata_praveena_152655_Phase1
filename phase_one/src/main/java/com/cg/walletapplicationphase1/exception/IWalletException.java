package com.cg.walletapplicationphase1.exception;

public interface IWalletException {
	/*******************************************************************************************************
	 - Interface Name	:	<IWalletException>
	 - Input Parameters	:	<null>
	 - Return Type		:	<null>
	 - Throws			:  	<null>
	 - Author			:	<Neti_Venkata_Praveena>
	 - Creation Date	:	31/07/2018
	 - Description		:	error messages description
	 ********************************************************************************************************/ 
	
	
	
	
	String  invalidNameError ="Enter valid name ";
	String invalidMobileNumError = "Enter Valid Mobile Number ";
	String invalidpasswordError ="Enter Valid Password";
	String emailIdError = " enter valid email id";
	String invalidDetails = "Entered details are not matching ";
	String insufficientFunds = "Insufficicnet account balance";
	String accountExistError = "Account already exists with the given mobile number";
	String inputMismatch = "Enter Valid Details";
	String invalidAmountError = "Enter valid amount";
}
