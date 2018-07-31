package com.cg.walletapplication.phase_one;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.TreeMap;

import org.junit.Test;

import com.cg.walletapplicationphase1.exception.WalletException;
import com.cg.walletapplicationphase1.service.IWalletService;
import com.cg.walletapplicationphase1.service.WalletServiceImpl;
import com.cg.walletapplicationphaseone.bean.Customer;
import com.cg.walletapplicationphaseone.bean.Wallet;

public class WalletServiceImplTest {
	/*******************************************************************************************************
	 - Class Name	    :	<WalletServiceImplTest>
	 - Input Parameters	:	<null>
	 - Return Type		:	<test results>
	 - Throws			:  	<null>
	 - Author			:	<Neti_Venkata_Praveena>
	 - Creation Date	:	31/07/2018
	 - Description		:	testing methods
	 ********************************************************************************************************/ 
	public static IWalletService iWalletService=new WalletServiceImpl();
    @Test
	public void addCustomerTestTrue() throws WalletException
	{ 
		Customer customer1 = new Customer("9494242544","Veena","Veena@123","veena569@gmail.com",new Wallet(),new TreeMap<LocalDateTime, String>());
		assertEquals("9494242544",iWalletService.addCustomer(customer1));
			
	}
    @Test(expected = WalletException.class)
  	public void addCustomerTestFalse() throws WalletException
  	{

  		Customer customer2 = new Customer("9494242544","Veena","Veena@875","veena569@gmail.com",new Wallet(),new TreeMap<LocalDateTime, String>());
  		assertNotEquals("5696862891",iWalletService.addCustomer(customer2));
  		
  	}
	

	@Test
	public void initBalanceTest() throws WalletException
	{
		Customer customer1 = new Customer("9854712536","Pavan","Pavan@123","pavan089@gmail.com",new Wallet(),new TreeMap<LocalDateTime, String>());
		iWalletService.addCustomer(customer1);
		assertEquals(BigDecimal.valueOf(0.0),customer1.getWallet().getBalance());
		
	}
	
	@Test
	public void depositMoneyTest() throws WalletException
	{
		Customer customer2 = new Customer("8574236522","Lakshmi","Lakshmi@895","lakshmi987@gmail.com",new Wallet(),new TreeMap<LocalDateTime, String>());
		iWalletService.addCustomer(customer2);
		iWalletService.deposit(customer2, BigDecimal.valueOf(7590.00));
		Customer result = iWalletService.showBalance("9494242544", "Veena@123");
		assertEquals(BigDecimal.valueOf(0.0),result.getWallet().getBalance());
	}
	@Test
	public void withdrawMoneyTestTrue() throws WalletException
	{
		Customer customer2 = new Customer("8545658547","Prasad","Prasad@123","Prasad123@gmail.com",new Wallet(),new TreeMap<LocalDateTime, String>());
		iWalletService.addCustomer(customer2);
		iWalletService.deposit(customer2, BigDecimal.valueOf(7590.00));
		assertTrue(iWalletService.withDraw(customer2, BigDecimal.valueOf(3000.00)));
	}

	
	@Test(expected = WalletException.class)
	public void withdrawMoneyTestFalse() throws WalletException
	{
		Customer customer2 = new Customer("9494242544","Veena","Veena@123","veena569@gmail.com",new Wallet(),new TreeMap<LocalDateTime, String>());
		iWalletService.addCustomer(customer2);
		iWalletService.deposit(customer2, BigDecimal.valueOf(7590.00));
		assertFalse(iWalletService.withDraw(customer2, BigDecimal.valueOf(8000.00)));
	}

}
