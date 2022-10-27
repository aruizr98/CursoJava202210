package curso.java.POO;

public class MainClases {
	public static void main(String[] args) {
		String nombre="Eva";
		ClaseA ca=new ClaseA("Alex");
		ca.funcion1();
		ClaseA ca2=new ClaseA("Emilio", new ClaseB("Buenos días!", 10));
		System.out.println(ca2.getClaseb().getNumero3());
	}
}
