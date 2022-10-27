package curso.java.excepciones;

public class ExcepcionesMain {
	public static void main(String[] args) {
		System.out.println("Inicio");
		ErrorA c=new ErrorA();
		
		try {
			c.metodo1();
			String texto=null;
			texto.toUpperCase();
			String[] colores= {"Rojo", "verde", "Azul"};
			System.out.println(colores[10]);
			int num = 7 / 0;
		} catch (ArithmeticException e) {
			System.out.println("División incorrecta.");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ha habido un error en el array.");
		}catch(NullPointerException e) {
			System.out.println("Excepción nullPointer.");
		}catch(MiExcepcion e) {
			System.out.println("Mi excepcion. Mensaje: "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Se ha producido un error.");
		}
		finally {
			System.out.println("Continúa");//Esto se va a ejecutar siempre. Sirve para cerrar conexiones a la BBDD o para cerrar ficheros.
		}
		System.out.println("Fin");
	}
}