package com.SeleniumTest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardTest extends BaseTest {
	
	UtilsWebElements utils = new UtilsWebElements();
	
	@Before
	public void Before() {
		setup();
	}
	
    @Test
    public void ValidaDashboardTest() {
    	logger.info("Inicio la prueba de dash");
      	driver = DriverManager.getDriver();
        List<WebElement> elementosSidebar = driver.findElements(By.cssSelector("li.sidebar-item"));

        // iterar sobre la lista de elementos y acceder a su contenido
        for (WebElement SideElement : elementosSidebar) {
        	// System.out.println(SideElement.getText());
        	 procesaElemento(SideElement);
        	 
		}
    }
    
    public void procesaElemento(WebElement Elemento) {
    	 String elementoText = utils.ObtieneGetText(Elemento);
    	 System.out.println(elementoText);
    	 Enums option = Enums.valueOf(elementoText.toUpperCase());
         switch (option) {
         case DASHBOARD:
        	// utils.ClickWebElement(Elemento);
             break;
         case SOLICITUDEXCLUSIONES:
        	 SolicitudExclusionesTest(Elemento);
        
             break;
         // Agrega más casos según sea necesario.
         default:
             // Procesa la opción predeterminada.
             break;
         }
    	
    }
    
    public void SolicitudExclusionesTest(WebElement Elemento) {
   	 	utils.ClickWebElement(Elemento);
    }

    
    
}
