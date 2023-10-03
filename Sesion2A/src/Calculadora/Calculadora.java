package Calculadora;

public class Calculadora {

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int multiplica(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			return -1;
		}
	}
}
