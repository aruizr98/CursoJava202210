package curso.java.ejercicios.poo.tienda.pojos;

public class Pantalon {
	private String color;
	private String talla;
	private double precio;
	private Boton boton;
	public Pantalon(String color, String talla, double precio, Boton boton) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}
	public Pantalon() {
		String[] colores= {"rojo", "azul", "amarillo", "verde"};
		String[] tallas= {"XS","S","L", "XL"};
		this.color=colores[(int)(Math.random()*((colores.length-1)+0)-0)];
		this.talla=tallas[(int)(Math.random()*((tallas.length-1)+0)-0)];
		this.precio=Math.random()*(60-1)+1;
		this.boton=new Boton();
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
	public Boton getBoton() {
		return boton;
	}
	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
	
}
