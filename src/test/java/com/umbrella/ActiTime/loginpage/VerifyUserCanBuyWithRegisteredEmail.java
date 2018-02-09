package com.umbrella.ActiTime.loginpage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.umbrella.ActiTime.generics.LoggerHelper;
import com.umbrella.ActiTime.testCore.TestBase;

public class VerifyUserCanBuyWithRegisteredEmail extends TestBase {

	private final Logger log = LoggerHelper.getLogger(VerifyUserCanBuyWithRegisteredEmail.class);

	@Test(priority = 1)
	public void testusercanloginwithvalidcredentials() throws Exception {
		System.out.println(" **********I am starting Test of Demo site**********");
		log.info(VerifyUserCanBuyWithRegisteredEmail.class + " started");
		System.out.println("I am Just instantiating signinpage driver");
		System.out.println("I am Just instantiating signinpage driver");

	}

}
