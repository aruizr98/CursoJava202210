package curso.java.ejercicios.poo.banda;

public class Guitarra extends Instrumento {
	private int numeroCuerdas;
	private String material;
	public Guitarra(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}
	public Guitarra(String nombre, String tipo, double precio, String marca, int numeroCuerdas, String material) {
		super(nombre, tipo, precio, marca);
		this.numeroCuerdas = numeroCuerdas;
		this.material = material;
	}
	
	@Override
	public void tocar() {
		if(this.isAfinado()) {
			System.out.println("La guitarra "+this.getNombre()+" se está tocando correctamente.");
		}else {
			System.out.println("La guitarra "+this.getNombre()+" no se está tocando correctamente.");
		}
	}
	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}
	public String getMaterial() {
		return material;
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
	System.out.println("INSERT INTO TABLE TB_GUITARRA");	
	}
	
	

	
	
}
