package curso.java.ejercicios.poo.tienda;

import curso.java.ejercicios.poo.tienda.pojos.Boton;
import curso.java.ejercicios.poo.tienda.pojos.Camisa;
import curso.java.ejercicios.poo.tienda.pojos.Maniqui;
import curso.java.ejercicios.poo.tienda.pojos.Pantalon;
import curso.java.ejercicios.poo.tienda.pojos.Vestido;
import curso.java.funciones.Utils;

public class Tienda {
	private String nombre;
	private Maniqui[] maniquis;

	public Tienda(String nombre, Maniqui[] maniquis) {
		super();
		this.nombre = nombre;
		this.maniquis = maniquis;
	}
	public Tienda(String nombre) {
		this.nombre=nombre;
	}

	public static Maniqui[] crearManiquis(int numero) {
		Maniqui[] maniquies = new Maniqui[numero];
		for (int i = 0; i < maniquies.length; i++) {
			maniquies[i] = new Maniqui();
		}
		return maniquies;
	}
	private Maniqui[] crearTienda() {
		Boton boton1 = new Boton("negro", "redondo");
		Boton boton2 = new Boton("blanco", "cuadrado");
		Boton boton3 = new Boton("azul", "cuadrado");
		Boton boton4 = new Boton("blanco", "redondo");
		Boton boton5 = new Boton("amarillo", "cuadrado");
		Boton boton6 = new Boton("amarillo", "redondo");
		
		Boton[] stockBotones= {boton1, boton2, boton3, boton4, boton5};
		Boton[] botonesCamisa1= {boton1, boton2};
		Boton[] botonesCamisa2= {boton3, boton4, boton5};
		Camisa camisa1=new Camisa("Roja", "XL", 40, botonesCamisa1);
		Camisa camisa2=new Camisa("Amarilla", "L", 30);
		camisa2.setBotones(botonesCamisa2);
		Pantalon pantalon=new Pantalon("Vaquero", "40", 50, boton6);
		Vestido vestido=new Vestido("Verde", "L", 60);
		
		Maniqui maniqui1=new Maniqui();
		maniqui1.vestir(camisa1, pantalon);
		Maniqui maniqui2=new Maniqui(vestido);
		
		Maniqui[] maniquis= {maniqui1, maniqui2};
		
		return maniquis;
	}
	public void calcularPrecioRopa() {
		double precio = 0;
		for (int i = 0; i < maniquis.length; i++) {
			if (maniquis[i].getCamisa() != null && maniquis[i].getPantalon() != null) {
				System.out.println("Maniquí con id " + maniquis[i].getId() + ":");
				System.out.println("Camisa " + maniquis[i].getCamisa().getColor() + " talla "
						+ maniquis[i].getCamisa().getTalla() + ": " + maniquis[i].getCamisa().getPrecio() + "€");
				System.out.println("Pantalón " + maniquis[i].getPantalon().getColor() + " talla "
						+ maniquis[i].getPantalon().getTalla() + ": " + maniquis[i].getPantalon().getPrecio() + "€");
				precio += maniquis[i].getCamisa().getPrecio() + maniquis[i].getPantalon().getPrecio();

			} else if (maniquis[i].getVestido() != null) {
				System.out.println("Maniquí con id " + maniquis[i].getId() + ":");
				System.out.println("Vestido " + maniquis[i].getVestido().getColor() + " talla "
						+ maniquis[i].getVestido().getTalla() + ": " + maniquis[i].getVestido().getPrecio() + "€");
				precio += maniquis[i].getVestido().getPrecio();
			}
			System.out.println();
		}
		System.out.println("El precio total de la ropa de todos los maniquís es " + precio + "€");
	}
	public void vestirManiquiesTienda(Maniqui[] maniquies) {
		for (int i = 0; i < maniquies.length; i++) {
			if (i % 2 == 0) {
				maniquies[i].vestir(new Camisa(), new Pantalon());
			} else {
				maniquies[i].vestir(new Vestido());
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Maniqui[] getManiquis() {
		return maniquis;
	}

	public void setManiquis(Maniqui[] maniquis) {
		this.maniquis = maniquis;
	}

	public static void main(String[] args) {
//		Tienda t= new Tienda("tienda 1", Tienda.crearManiquis(2));
//		t.vestirManiquiesTienda(t.getManiquis());
//		System.out.println();
//		t.calcularPrecioRopa();
		
//		String nombreTienda = Utils.pedirValor("Introduce el nombre de la tienda.");
//		int numeroManiquis = Integer.parseInt(Utils.pedirValor("Introduce el número de maniquís de la tienda."));
//		Tienda t = new Tienda(nombreTienda, Tienda.crearManiquis(numeroManiquis));
//		t.vestirManiquiesTienda(t.getManiquis());
//		System.out.println();
//		t.calcularPrecioRopa();

		Tienda t = new Tienda("Tienda 1");
		Maniqui[] maniquies=t.crearTienda();
		t.setManiquis(maniquies);
		t.calcularPrecioRopa();
		t.getManiquis()[0].getCamisa().getBotones()[0]=null;
	}

}
