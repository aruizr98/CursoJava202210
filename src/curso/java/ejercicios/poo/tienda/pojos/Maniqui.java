package curso.java.ejercicios.poo.tienda.pojos;

import curso.java.funciones.Utils;

public class Maniqui {
	private static int numeroId = 1;
	private int id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;

	public Maniqui() {
		this.id = numeroId++;
		this.camisa = null;
		this.pantalon = null;
		this.vestido = null;
	}

	public Maniqui(Camisa camisa, Pantalon pantalon) {
		super();
		this.id = numeroId++;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	public Maniqui(Vestido vestido) {
		super();
		this.id = numeroId++;
		this.vestido = vestido;
	}

	public void vestir(Camisa camisa, Pantalon pantalon) {
			desvestir();
			this.camisa = camisa;
			this.pantalon = pantalon;
			System.out.println("Maniquí vestido con camisa y pantalón.");
	}

	public void vestir(Vestido vestido) {
			desvestir();
			this.vestido = vestido;
			System.out.println("Maniquí vestido con vestido.");
	}

	public void desvestir() {
		if (this.camisa != null) {
			this.camisa = null;
		}
		if (this.pantalon != null) {
			this.pantalon = null;
		}
		if (this.vestido != null) {
			this.vestido = null;
		}
		System.out.println("Maniquí desvestido.");
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
