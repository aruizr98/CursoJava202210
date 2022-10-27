package curso.java.excepciones.bar;

import curso.java.excepciones.bar.excepciones.TooColdTemperatureException;
import curso.java.excepciones.bar.excepciones.TooHotTemperatureException;

public class Cliente {
	private String nombre;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void beberCafe(CoffeeCup c) throws TooHotTemperatureException, TooColdTemperatureException {
		if(c.getTemperatura() > 80) {
			throw new TooHotTemperatureException("El cliente se ha quemado");
		}else if(c.getTemperatura() < 20) {
			throw new TooColdTemperatureException("El cliente ha dejado el café");
		}else {
			System.out.println("El cliente ha tomado el café.");
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
