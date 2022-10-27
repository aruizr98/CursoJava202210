package curso.java.ejercicios.poo;

public class Supermercado {
	private String nombre;
	
	
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
	}
	public static void main(String[] args) {
		Supermercado s = new Supermercado("Supermercado 1");
		Cliente[] clientes = s.crearClientes();
		s.importeTotal(clientes);
	}
	private Cliente[] crearClientes() {
		Cliente[] clientes = new Cliente[4];
		for (int i = 0; i < clientes.length; i++) {
			clientes[i]=new Cliente();
			clientes[i].comprar(Math.random()*(500-1)+1);
		}
		return clientes;
	
	}
	private void importeTotal(Cliente[] clientes) {
		double importeTotal=0;
		for (int i = 0; i < clientes.length; i++) {
			System.out.println("Importe de la compra de "+clientes[i].getNombre()+": "+clientes[i].getImporteCompra()+" €");
			importeTotal+=clientes[i].getImporteCompra();
		}
		System.out.println("Importe total de todos los clientes de "+this.nombre+": "+importeTotal+"€");
	}
}
