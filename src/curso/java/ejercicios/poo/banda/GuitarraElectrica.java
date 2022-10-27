package curso.java.ejercicios.poo.banda;

public class GuitarraElectrica extends Guitarra {
	private int potencia;
	public GuitarraElectrica(String nombre, String tipo, double precio, String marca, int numeroCuerdas,
			String material) {
		super(nombre, tipo, precio, marca, numeroCuerdas, material);
		// TODO Auto-generated constructor stub
	}
	public GuitarraElectrica(String nombre, String tipo, double precio, String marca, int numeroCuerdas, String material, int potencia) {
		super(nombre, tipo, precio, marca, numeroCuerdas, material);
		this.potencia = potencia;
	}
	
	
	@Override
	public void tocar() {
		//super.tocar(); System.out.println("Potencia: "+this.potencia);
		if(this.isAfinado()) {
			System.out.println("La guitarra "+this.getNombre()+" se está tocando correctamente con una potencia de "+this.getPotencia());
		}else {
			System.out.println("La guitarra "+this.getNombre()+" no se está tocando correctamente con una potencia de "+this.getPotencia());
		}
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
