package curso.java.ejercicios.poo.tienda.pojos;

public class Vestido {
	private String color;
	private String talla;
	private double precio;
	public Vestido(String color, String talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	public Vestido() {
		String[] colores= {"rojo", "azul", "amarillo", "verde"};
		String[] tallas= {"XS","S","L", "XL"};
		this.color=colores[(int)(Math.random()*((colores.length-1)+0)-0)];
		this.talla=tallas[(int)(Math.random()*((tallas.length-1)+0)-0)];
		this.precio=Math.random()*(60-1)+1;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	
	
}
