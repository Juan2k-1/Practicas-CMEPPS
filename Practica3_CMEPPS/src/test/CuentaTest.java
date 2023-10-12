package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Cuenta;
import modelo.Movimiento;
import modelo.Movimiento.Signo;

class CuentaTest {

	static Cuenta cuenta;
	static Cuenta cuenta2;

	static Movimiento movimiento1;
	static Movimiento movimiento2;
	static Movimiento movimiento3;
	static Movimiento movimiento4;
	static Movimiento movimiento5;
	static Movimiento movimiento6;
	static Movimiento movimiento7;
	static Movimiento movimiento8;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("12345", "Manuel", 50);
		cuenta2 = new Cuenta("67890", "Juan", 0);

		movimiento1 = new Movimiento(350, "Retirada", Signo.D);
		movimiento2 = new Movimiento(200, "Retirada", Signo.D);
		movimiento3 = new Movimiento(150, "Retirada", Signo.D);
		movimiento4 = new Movimiento(50, "Ingreso", Signo.H);
		movimiento5 = new Movimiento(100, "Retirada", Signo.D);
		movimiento6 = new Movimiento(200, "Retirada", Signo.D);
		movimiento7 = new Movimiento(100, "Ingreso", Signo.H);
		movimiento8 = new Movimiento(200, "Retirada", Signo.D);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(50);
		cuenta2.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {

		// assertEquals(1000, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {

		// assertEquals(-1000, cuenta.getSaldo());
	}

	@Test
	void test0014() {
		double saldoActual = cuenta.getSaldo();
		System.out.println("Saldo inicial cuenta 1: " + saldoActual);

		cuenta.retirar(movimiento6.getImporte());
		cuenta.ingresar(movimiento7.getImporte());
		cuenta.retirar(movimiento8.getImporte());

		System.out.println("Saldo final cuenta 1: " + cuenta.getSaldo() + "€");
		assertEquals(-250, cuenta.getSaldo());

		// --------------------------------------------------------------

		double saldoActual2 = cuenta2.getSaldo();
		System.out.println("Saldo inicial cuenta 2: " + saldoActual2);

		cuenta2.retirar(movimiento1.getImporte());
		cuenta2.retirar(movimiento2.getImporte());
		cuenta2.retirar(movimiento3.getImporte());
		cuenta2.ingresar(movimiento4.getImporte());
		cuenta2.retirar(movimiento5.getImporte());

		System.out.println("Saldo final cuenta 2: " + cuenta2.getSaldo() + "€");
	}
}