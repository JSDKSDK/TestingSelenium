package com.SeleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class LoginTest extends BaseTest  {
	
	private DashboardTest dashboardTest = new DashboardTest();
	
	@Before
	public void Before() {
		setup();
	}
	
	@Test
	public void loginTest() {
		logger.info("Inicio la prueba de Login");
		
		  WebElement UserInput = WaitUtils.waitForElement(driver, By.id(Constants.CAMPO_USUARIO), 10);
	      WebElement PassInput = WaitUtils.waitForElement(driver, By.id(Constants.CAMPO_PASSWORD), 10);
	      WebElement ButtonSubmit = WaitUtils.waitForElement(driver, By.className(Constants.BTN_LOGIN), 10);

		UserInput.clear();
		UserInput.sendKeys("1082456");
		PassInput.clear();
		PassInput.sendKeys("1082456");
		ButtonSubmit.click();
		ValidarSwal();
	    dashboardTest.ValidaDashboardTest();
		
	}
	
	public void ValidarSwal() {
		 WebElement ButtonSwal = WaitUtils.waitForElement(driver, By.cssSelector(Constants.BTN_SWAL), 10);
		 ButtonSwal.click();
	}
	@After
	public void tearDown() {

		
	}
	
}









