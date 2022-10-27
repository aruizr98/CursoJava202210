package curso.java.ejercicios.poo.caballos;

import curso.java.ejercicios.poo.interfaces.IUpdatable;

public class Caballo implements IUpdatable {
	private String nombre;
	private int dorsal;
	private int velocidad;
	private int experiencia;
	private int edad;
	private int distanciaRecorrida;
	private static int numeroCaballo=1;
	public Caballo(String nombre, int dorsal, int velocidad, int experiencia, int edad) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.edad = edad;
		this.distanciaRecorrida=0;
	}
	public Caballo() {
		this.nombre="Caballo "+numeroCaballo++;
		this.dorsal=numeroCaballo-1;
		this.velocidad=(int)(Math.random()*(10-1)+1);
		this.experiencia=(int)(Math.random()*(10-1)+1);
		this.edad=(int)(Math.random()*(10-1)+1);
		this.distanciaRecorrida=0;
	}
	
	public int correr() {
		int random=(int)(Math.random()*(10-5)+5);
//		System.out.println("Random: "+random);
//		System.out.println("Return: "+(velocidad+experiencia-edad+random));
		return velocidad+experiencia-edad+random;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	public void setDistanciaRecorrida(int distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("INSERT INTO TABLE TB_CABALLO");
	}
	@Override
	public void update(long id) {
		// TODO Auto-generated method stub
		System.out.println("UPDATE TABLE TB_CABALLO");
	}
	
}
