package curso.java.ejercicios.poo.banda;

public class Piano extends Instrumento {
	private int numeroOctavas;
	private int numeroPedales;
	public Piano(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}
	public Piano(String nombre, String tipo, double precio, String marca, int numeroOctavas, int numeroPedales) {
		super(nombre, tipo, precio, marca);
		this.numeroOctavas = numeroOctavas;
		this.numeroPedales = numeroPedales;
	}
	
	public int getNumeroOctavas() {
		return numeroOctavas;
	}
	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}
	public int getNumeroPedales() {
		return numeroPedales;
	}
	public void setNumeroPedales(int numeroPedales) {
		this.numeroPedales = numeroPedales;
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_PIANO");
	}	
	
	
	
}
