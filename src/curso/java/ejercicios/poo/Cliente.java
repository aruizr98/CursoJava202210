package curso.java.ejercicios.poo;

public class Cliente {
	//Variables de clase
	static String saludo;
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompra;
	private static int numeroCliente=1;
	
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.importeCompra = 0;
	}
	
	
	
	public Cliente() {
		super();
		this.nombre="Cliente "+numeroCliente++;
		this.apellidos="Apellidos "+nombre;
		this.dni=(int)(Math.random()*(99999999-00000001)+00000001)+"P";
		this.importeCompra=0;
	}



	public void comprar(double importe) {
		this.importeCompra=(this.getImporteCompra()+importe);
		System.out.println(this.getNombre()+" ha realizado una compra con un valor de "+importe+"€.");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public double getImporteCompra() {
		return importeCompra;
	}
	
	
}
