package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.Movimiento.Signo;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> mMovimientos;

	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.numero = numeroCuenta;
		this.titular = titular;
		this.mMovimientos = new ArrayList<Movimiento>();
	}

	public void ingresar(double monto) {
		this.saldo += monto;
		Movimiento movimiento = new Movimiento(monto, "Ingreso", Signo.H);
		mMovimientos.add(movimiento);
		System.out.println("Ingreso de " + monto + "€");
	}

	public void retirar(double monto) {
		if (saldo - monto >= -500) {
			saldo -= monto;
			Movimiento movimiento = new Movimiento(monto, "Retirada", Signo.D);
			mMovimientos.add(movimiento);
			System.out.println("Retirada de " + monto + "€");
		} else {
			System.out.println("Fondos insuficientes (" + saldo + "€) en la cuenta " + numero + " para la retirada de "
					+ monto + "€");
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Movimiento> getmMovimientos() {
		return this.mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}
}