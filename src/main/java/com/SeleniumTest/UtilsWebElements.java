package com.SeleniumTest;

import org.openqa.selenium.WebElement;

public class UtilsWebElements extends UtilsGenerals {

		public void ClickWebElement(WebElement Elemento) {
			Elemento.click();
		}
		
		public String ObtieneGetText(WebElement Elemento) {
			
			return LimpiarTildes(LimpiaEspaciosCadena(Elemento.getText()));
			
		}
		
		
}
