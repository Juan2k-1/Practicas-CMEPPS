package modelo;

public class Movimiento {
	
	public enum Signo {
		D, H
	}
	private double importe;
	private String detalle;
	private Signo signo;
	
	public Movimiento(double importe, String detalle, Signo signo) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Signo getSigno() {
		return signo;
	}

	public void setSigno(Signo signo) {
		this.signo = signo;
	}	
}
