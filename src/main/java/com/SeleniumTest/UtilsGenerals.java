package com.SeleniumTest;

import java.text.Normalizer;

public class UtilsGenerals {
	
	public String LimpiaEspaciosCadena(String cadena) {
		return cadena.replaceAll(" +", "");
	}
	
	public String LimpiarTildes(String cadena) {
		return Normalizer.normalize(cadena, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
		 
	}
}
