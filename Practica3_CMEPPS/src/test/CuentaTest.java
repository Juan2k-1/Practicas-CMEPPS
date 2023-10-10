package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("12345", "Manuel", 50);
		cuenta2 = new Cuenta("67890", "Juan", 0);
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

		List<Movimiento> movimientos = cuenta.getmMovimientos();
		double saldoActual = cuenta.getSaldo();
		System.out.println("Saldo inicial cuenta 1: " + saldoActual);

		Movimiento movimiento6 = new Movimiento(200, "Retirada", Signo.D);
		Movimiento movimiento7 = new Movimiento(100, "Ingreso", Signo.H);
		Movimiento movimiento8 = new Movimiento(200, "Retirada", Signo.D);

		movimientos.add(movimiento6);
		movimientos.add(movimiento7);
		movimientos.add(movimiento8);

		for (int i = 0; i < cuenta.getmMovimientos().size(); i++) {
			Movimiento movimiento_aux = movimientos.get(i);
			if (movimiento_aux.getSigno() == Signo.D && saldoActual - movimiento_aux.getImporte() >= -500) {
				saldoActual -= movimiento_aux.getImporte();
				cuenta.retirar(movimiento_aux.getImporte());
				System.out.println("Retirada de " + movimientos.get(i).getImporte() + "€");
			} else if (movimiento_aux.getSigno() == Signo.H) {
				saldoActual += movimiento_aux.getImporte();
				cuenta.ingresar(movimiento_aux.getImporte());
				System.out.println("Ingreso de " + movimientos.get(i).getImporte() + "€");
			} else if (saldoActual - movimiento_aux.getImporte() < -500) {
				System.out.println("Fondos insuficientes " + "(" + saldoActual + "€" + ")" + " en la cuenta "
						+ cuenta.getNumero() + " para la retirada de " + movimientos.get(i).getImporte() + "€");
			}
		}
		System.out.println("Saldo final cuenta 1: " + cuenta.getSaldo() + "€");
		assertEquals(-250, cuenta.getSaldo());
		
		//--------------------------------------------------------------
		
		List<Movimiento> movimientos2 = cuenta2.getmMovimientos();
		double saldoActual2 = cuenta2.getSaldo();
		System.out.println("Saldo inicial cuenta 2: " + saldoActual2);

		Movimiento movimiento1 = new Movimiento(350, "Retirada", Signo.D);
		Movimiento movimiento2 = new Movimiento(200, "Retirada", Signo.D);
		Movimiento movimiento3 = new Movimiento(150, "Retirada", Signo.D);
		Movimiento movimiento4 = new Movimiento(50, "Ingreso", Signo.H);
		Movimiento movimiento5 = new Movimiento(100, "Retirada", Signo.D);
		movimientos2.add(movimiento1);
		movimientos2.add(movimiento2);
		movimientos2.add(movimiento3);
		movimientos2.add(movimiento4);
		movimientos2.add(movimiento5);

		for (int i = 0; i < cuenta2.getmMovimientos().size(); i++) {
			Movimiento movimiento_aux = movimientos2.get(i);
			if (movimiento_aux.getSigno() == Signo.D && saldoActual2 - movimiento_aux.getImporte() >= -500) {
				saldoActual2 -= movimiento_aux.getImporte();
				cuenta2.retirar(movimiento_aux.getImporte());
				System.out.println("Retirada de " + movimientos2.get(i).getImporte() + "€");
			} else if (movimiento_aux.getSigno() == Signo.H) {
				saldoActual2 += movimiento_aux.getImporte();
				cuenta2.ingresar(movimiento_aux.getImporte());
				System.out.println("Ingreso de " + movimientos2.get(i).getImporte() + "€");
			} else if (saldoActual2 - movimiento_aux.getImporte() < -500) {
				System.out.println("Fondos insuficientes " + "(" + saldoActual2 + "€" + ")" + " en la cuenta "
						+ cuenta2.getNumero() + " para la retirada de " + movimientos2.get(i).getImporte() + "€");
			}
		}
		System.out.println("Saldo final cuenta 2: " + cuenta2.getSaldo() + "€");
		assertEquals(saldoActual2, cuenta2.getSaldo());
	}
}