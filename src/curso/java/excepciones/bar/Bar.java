package curso.java.excepciones.bar;

import curso.java.excepciones.bar.excepciones.TooColdTemperatureException;
import curso.java.excepciones.bar.excepciones.TooHotTemperatureException;

public class Bar {
	private CoffeeCup cafe;
	private Cliente cliente;
	
	public Bar(CoffeeCup cafe, Cliente cliente) {
		super();
		this.cafe = cafe;
		this.cliente = cliente;
	}
	public Bar() {
		this.cafe=new CoffeeCup();
		this.cliente=new Cliente("Alex");
	}
	public CoffeeCup getCafe() {
		return cafe;
	}
	public void setCafe(CoffeeCup cafe) {
		this.cafe = cafe;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public static void main(String[] args) {
		Bar b = new Bar();
		try {
			b.getCliente().beberCafe(b.getCafe());
		} catch (TooHotTemperatureException e) {
			System.out.println(e.getMessage());
		} catch (TooColdTemperatureException e) {
			System.out.println(e.getMessage());
		}
		
	}
}	
