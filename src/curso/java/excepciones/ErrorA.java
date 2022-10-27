package curso.java.excepciones;

public class ErrorA {
	public void metodo1() throws MiExcepcion{
		System.out.println("Llamando a método 1.");
		//int num = 9/0;
		MiExcepcion me=new MiExcepcion("Excepción propia.");
		throw me;
	}
}
