package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

	@Before("NetBanking")
	public void netBankingSetup() {
		System.out.println("******************");
		System.out.println("setup entries in netBanking database");
	}
	
	@Before("Mortgage")
	public void mortageSetup() {
		System.out.println("setup entries in Mortage database");
	}
	
	@After
	public void tearDown() {
		System.out.println("clear the entries");
	}
	

}
