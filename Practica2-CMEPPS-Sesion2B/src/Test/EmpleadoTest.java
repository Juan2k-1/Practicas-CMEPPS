package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Empleado.Empleado;
import Empleado.Empleado.tipoEmpleado;

class EmpleadoTest {

	private final Empleado empleado1 = new Empleado(tipoEmpleado.Vendedor);
	private final Empleado empleado2 = new Empleado(tipoEmpleado.Encargado);

	private int horasExtraEmpleado1 = 0;
	private int ventaMesEmpleado1 = 0;
	private float nominaBrutaEmpleado1 = 2000;

	private int horasExtraEmpleado2 = 0;
	private int ventaMesEmpleado2 = 0;
	private float nominaBrutaEmpleado2 = 2500;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		empleado1.setHorasExtra(horasExtraEmpleado1);
		empleado1.setVentasMes(ventaMesEmpleado1);
		empleado1.setNominaBruta(nominaBrutaEmpleado1);

		empleado2.setHorasExtra(horasExtraEmpleado2);
		empleado2.setVentasMes(ventaMesEmpleado2);
		empleado2.setNominaBruta(nominaBrutaEmpleado2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTipoEmpleado() {
		if (empleado1.getTipo().equals(tipoEmpleado.Vendedor)) {
			assertEquals(tipoEmpleado.Vendedor, empleado1.getTipo());
		}
		if (empleado2.getTipo().equals(tipoEmpleado.Encargado)) {
			assertEquals(tipoEmpleado.Encargado, empleado2.getTipo());
		}
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		float resultado = this.empleado2.calculoNominaBruta(empleado2.getTipo(), ventaMesEmpleado2,
				horasExtraEmpleado2);
		assertEquals(nominaBrutaEmpleado2, resultado);
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		float resultado = this.empleado1.calculoNominaBruta(empleado1.getTipo(), ventaMesEmpleado1,
				horasExtraEmpleado1);
		assertEquals(nominaBrutaEmpleado1, resultado);
	}

	@Test
	void testCalculoNominaBrutaOtro() {
		float resultado = this.empleado2.calculoNominaBruta(empleado2.getTipo(), ventaMesEmpleado2,
				horasExtraEmpleado2);
		assertEquals(2500, resultado);
	}

	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		ventaMesEmpleado1 = -5;
		float resultado = this.empleado1.calculoNominaBruta(empleado1.getTipo(), ventaMesEmpleado1,
				horasExtraEmpleado1);
		assertEquals(nominaBrutaEmpleado1, resultado);
	}

	@Test
	void testCalculoNominaBrutaVentasEntre1000y1500() {
		ventaMesEmpleado1 = 1200;
		float resultado = this.empleado1.calculoNominaBruta(empleado1.getTipo(), ventaMesEmpleado1,
				horasExtraEmpleado1);
		assertEquals(2100, resultado);
	}

	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		ventaMesEmpleado1 = 1700;
		float resultado = this.empleado1.calculoNominaBruta(empleado1.getTipo(), ventaMesEmpleado1,
				horasExtraEmpleado1);
		assertEquals(2200, resultado);
	}

	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		horasExtraEmpleado1 = -5;
		float resultado = this.empleado1.calculoNominaBruta(empleado1.getTipo(), ventaMesEmpleado1,
				horasExtraEmpleado1);
		assertEquals(2000, resultado);
	}

	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		horasExtraEmpleado1 = 1;
		float resultado = this.empleado1.calculoNominaBruta(empleado1.getTipo(), ventaMesEmpleado1,
				horasExtraEmpleado1);
		assertEquals(2030, resultado);
	}
}
