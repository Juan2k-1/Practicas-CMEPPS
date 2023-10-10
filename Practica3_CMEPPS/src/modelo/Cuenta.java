package modelo;

public class Cuenta {

	private double saldo;

	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.saldo = saldo;
	}

	public void ingresar(double monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void retirar(double monto) {
		this.setSaldo(this.getSaldo() - monto);
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}