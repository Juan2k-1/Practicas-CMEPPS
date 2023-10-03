package Empleado;

public class Empleado {
	public enum tipoEmpleado {
		Vendedor, Encargado
	};


	public float calculoNominaBruta(tipoEmpleado tipo, float ventasMes, float horasExtra) {
		float nominaBruta = 0;
		if (tipo.equals("Vendedor")) {
			nominaBruta = 2000;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				nominaBruta = nominaBruta + 100;
			} else if (ventasMes >= 1500) {
				nominaBruta = nominaBruta + 200;
			}
		} else {
			nominaBruta = 2500;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				nominaBruta = nominaBruta + 100;
			} else if (ventasMes >= 1500) {
				nominaBruta = nominaBruta + 200;
			}
		}

		for (int i = 0; i < horasExtra; i++) {
			nominaBruta = nominaBruta + 30;
		}
		return nominaBruta;
	}

	public float calculoNominaNeta(float nominaBruta) {
		float nominaNeta = 0;
		if (nominaBruta >= 2100 && nominaBruta < 2500) {
			nominaNeta = (float) (nominaBruta * (1 - 0.15));
		} else if (nominaBruta >= 2500) {
			nominaNeta = (float) (nominaBruta * (1 - 0.18));
		}
		return nominaNeta;
	}
}