package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTest {
	private final Calculadora calculadora = new Calculadora();

	@Test
	void sumaTest() {
		int sumaTotal = 4;
		int suma = calculadora.suma(2, 2);
		assertEquals(sumaTotal, suma);
	}
	
	@Test
	void restaTest() {
		int restaTotal = 2;
		int resta = calculadora.resta(4, 2);
		assertEquals(restaTotal, resta);
	}
	
	@Test 
	void multiplicaTest() {
		int multiplicaTotal = 10;
		int multiplica = calculadora.multiplica(2, 5);
		assertEquals(multiplicaTotal, multiplica);
	}
	
	@Test
	void divideTest() {
		int divideTotal = 1;
		int divide = calculadora.divide(5, 3);
		assertEquals(divideTotal, divide);
	}
	
	@Test
	void dividePorCeroTest() {
		int divideTotal = -1;
		int divide = calculadora.divide(5, 0);
		assertEquals(divideTotal, divide);
	}	
}