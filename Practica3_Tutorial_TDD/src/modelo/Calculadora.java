package modelo;

public class Calculadora {

	public static Integer suma(int i, int j) {

		return i+j;
	}

	public static Integer resta(int i, int j) {

		return i-j;
	}

	public static Integer multiplica(int i, int j) {
		return i*j;
	}

	public static Integer divide(int i, int j) {
		if (j != 0) {
			return i / j;
		} else {
			return -1;
		}
	}

}