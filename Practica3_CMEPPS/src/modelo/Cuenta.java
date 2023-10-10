package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> mMovimientos;

	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.setNumero(numeroCuenta);
		this.setTitular(titular);
		this.mMovimientos = new ArrayList<Movimiento>();
	}

	public void ingresar(double monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	public void retirar(double monto) {
		if (this.getSaldo() >= -500) {
			this.setSaldo(this.getSaldo() - monto);
		} 
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}
}