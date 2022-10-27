package curso.java.ejercicios.poo.caballos;

public class Apuesta {
	private int cantidad;
	private int dorsalCaballoApostado;
	public Apuesta(int cantidad, int dorsalCaballoApostado) {
		super();
		this.cantidad = cantidad;
		this.dorsalCaballoApostado = dorsalCaballoApostado;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCaballoApostado() {
		return dorsalCaballoApostado;
	}
	public void setCaballoApostado(int dorsalCaballoApostado) {
		this.dorsalCaballoApostado = dorsalCaballoApostado;
	}
}
