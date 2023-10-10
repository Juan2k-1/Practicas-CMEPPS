package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Cuenta;

class CuentaTest {

	static Cuenta cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("12345", "Manuel", 0);		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(1000);
		assertEquals(1000, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		cuenta.retirar(1000);
		assertEquals(0, cuenta.getSaldo());
	}
}