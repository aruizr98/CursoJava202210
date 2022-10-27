package curso.java.ejercicios.poo.caballos;

import java.util.Arrays;
import java.util.Iterator;

import curso.java.funciones.Utils;

public class Carrera {
	private String nombreCarrera;
	private int distancia;
	private Caballo[] caballos;
	
	public Carrera(String nombreCarrera, int distancia, Caballo[] caballos) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.distancia = distancia;
		this.caballos = caballos;
	}
	
	public Caballo iniciarCarrera() {
		Caballo caballoGanador=null;
		int[] distanciaRecorrida=new int[caballos.length];
		System.out.println(distancia+" metros.");
		for (int i = 0; i < caballos.length; i++) {
			do {
				caballos[i].setDistanciaRecorrida(caballos[i].getDistanciaRecorrida()+caballos[i].correr());
				//System.out.println("El caballo "+caballos[i].getNombre()+" lleva recorridos "+caballos[i].getDistanciaRecorrida()+" metros.");
				
			}while(caballos[i].getDistanciaRecorrida()<= distancia);
			System.out.println("El caballo "+caballos[i].getNombre()+" ha recorrido "+caballos[i].getDistanciaRecorrida()+" metros.");
			distanciaRecorrida[i]=caballos[i].getDistanciaRecorrida();
		}
		
		Arrays.sort(distanciaRecorrida);
		int max=distanciaRecorrida[distanciaRecorrida.length-1];
		System.out.println("Max: "+max);
		for (int i = 0; i < caballos.length; i++) {
			if(caballos[i].getDistanciaRecorrida() == max) {
				caballoGanador=caballos[i];
			}
		}
		System.out.println("Ha ganado el caballo "+caballoGanador.getNombre()+" cuya dorsal es "+caballoGanador.getDorsal()+" habiendo recorrido "+caballoGanador.getDistanciaRecorrida()+" metros.");
		return caballoGanador;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public Caballo[] getCaballos() {
		return caballos;
	}
	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}
	
	
}
