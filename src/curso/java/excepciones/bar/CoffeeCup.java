package curso.java.excepciones.bar;

public class CoffeeCup {
	private int temperatura;

	public CoffeeCup(int temperatura) {
		this.temperatura = temperatura;
	}
	public CoffeeCup() {
		this.temperatura=(int)(Math.random()*(100-1)+1);
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
}
