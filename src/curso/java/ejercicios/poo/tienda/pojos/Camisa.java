package curso.java.ejercicios.poo.tienda.pojos;

public class Camisa {
	private String color;
	private String talla;
	private double precio;
	private Boton[] botones;
	public Camisa(String color, String talla, double precio, Boton[] botones) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
	}
	public Camisa(String color, String talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	public Camisa() {
		String[] colores= {"roja", "azul", "amarilla", "verde"};
		String[] tallas= {"XS","S","L", "XL"};
		this.color=colores[(int)(Math.random()*((colores.length-1)+0)-0)];
		this.talla=tallas[(int)(Math.random()*((tallas.length-1)+0)-0)];
		this.precio=Math.random()*(60-1)+1;
		Boton[] botones= new Boton[5];
		for (int i = 0; i < botones.length; i++) {
			botones[i]=new Boton();
		}
		this.botones=botones;
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
	public Boton[] getBotones() {
		return botones;
	}
	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	
	
}
