package curso.java.ejercicios.poo.banda;

import curso.java.ejercicios.poo.interfaces.IInsertable;

public abstract class Instrumento implements IInsertable {
	private String nombre;
	private String tipo;
	private double precio;
	private String marca;
	private boolean afinado;
	public Instrumento(String nombre, String tipo, double precio, String marca) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.marca = marca;
		this.afinado=false;
	}
	
	public void afinar() {
		if((Math.random()*(10-1)+1) > 8) {
			System.out.println(this.nombre+" no está bien afinado.");
			this.afinado=false;
		}else {
			System.out.println(this.nombre+" afinado correctamente.");
			this.afinado=true;
		}
	}
	public void tocar() {
		if(this.afinado) {
			System.out.println(this.nombre+" tocando bien.");
		}else {
			System.out.println(this.nombre+" tocando mal.");
		}
	}

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
