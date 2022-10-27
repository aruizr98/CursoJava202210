package curso.java.ejercicios.poo.banda;

public class Bateria extends Instrumento {
	private int numeroTimbales;
	private int numeroPlatos;
	public Bateria(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}
	public Bateria(String nombre, String tipo, double precio, String marca, int numeroTimbales, int numeroPlatos) {
		super(nombre, tipo, precio, marca);
		this.numeroTimbales = numeroTimbales;
		this.numeroPlatos = numeroPlatos;
	}
	public void aporrear() {
		System.out.println("Batería aporreada.");
	}
	public int getNumeroTimbales() {
		return numeroTimbales;
	}
	public void setNumeroTimbales(int numeroTimbales) {
		this.numeroTimbales = numeroTimbales;
	}
	public int getNumeroPlatos() {
		return numeroPlatos;
	}
	public void setNumeroPlatos(int numeroPlatos) {
		this.numeroPlatos = numeroPlatos;
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_BATERIA");
	}
	
	

}
