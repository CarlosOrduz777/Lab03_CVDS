package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
 

public class TarifaTest {	
	@Test
    public void validarSinCambiosTarifa() { 
    	try {
    		long tarifa = (long) CalculadorDescuentos.calculoTarifa(500000,15,40);
    		assertEquals(tarifa, 500000);
    	}
    	catch (Exception e) {
    		
		}
    }
	
	@Test
    public void validarDescuentoCincoPorciento() { 
    	try {
    		long tarifa = (long)CalculadorDescuentos.calculoTarifa(650000,15,15);
    		long tarifaEsperada = (long) (650000*0.95);
    		assertEquals(tarifa, tarifaEsperada);
    	}
    	catch (Exception e) {
    		
		}
    }
	@Test
    public void validarDescuentoOchoPorciento() { 
    	try {
    		long tarifa = (long)CalculadorDescuentos.calculoTarifa(6320000,14,66);
    		long tarifaEsperada = (long) (6320000*0.92);
    		assertEquals(tarifa, tarifaEsperada);
    	}
    	catch (Exception e) {
    		
		}
    }
	
	@Test
    public void validarDescuentoQuincePorciento() { 
    	try {
    		long tarifa = (long)CalculadorDescuentos.calculoTarifa(730400,21,45);
    		long tarifaEsperada = (long) (730400*0.85);
    		assertEquals(tarifa, tarifaEsperada);
    	}
    	catch (Exception e) {
    		
		}
    }
	
	@Test
    public void validarDescuentoVeintePorciento() { 
    	try {
    		long tarifa = (long)CalculadorDescuentos.calculoTarifa(837410,22,14);
    		long tarifaEsperada = (long) (837410*0.80);
    		assertEquals(tarifa, tarifaEsperada);
    	}
    	catch (Exception e) {
    		
		}
    }
	
	@Test
    public void validarDescuentoVeintitresPorciento() { 
    	try {
    		long tarifa = (long)CalculadorDescuentos.calculoTarifa(897450,25,67);
    		long tarifaEsperada = (long) (897450*0.77);
    		assertEquals(tarifa, tarifaEsperada);
    	}
    	catch (Exception e) {
    		
		}
    }
}