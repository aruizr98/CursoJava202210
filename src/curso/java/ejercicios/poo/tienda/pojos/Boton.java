package curso.java.ejercicios.poo.tienda.pojos;

public class Boton {
	private String color;
	private String forma;
	
	
	public Boton(String color, String forma) {
		super();
		this.color = color;
		this.forma = forma;
	}
	public Boton() {
		String[] colores= {"rojo", "azul", "amarillo", "verde"};
		String[] formas= {"circular", "cuadrado"};
		this.color=colores[(int)(Math.random()*((colores.length-1)+0)-0)];
		this.forma=formas[(int)(Math.random()*((formas.length-1)+0)-0)];
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
}	
