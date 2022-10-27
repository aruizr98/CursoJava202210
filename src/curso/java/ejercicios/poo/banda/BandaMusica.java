package curso.java.ejercicios.poo.banda;

public class BandaMusica {
	private Instrumento[] instrumentos;

	public BandaMusica() {
		Guitarra guitarra= new Guitarra("Guitarra 1", "acústica",200.50, "Gibson", 6, "madera" );
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra 2", "eléctrica",500.50, "Fender", 6, "acero", 5 );
		Bateria bateria= new Bateria("Batería 1", "acústica", 600.40, "Premier", 10, 3);
		Piano piano= new Piano("Piano 1", "electrónico", 500.50, "Korg", 6, 3 );
		Instrumento[] aux= {guitarra, guitarraElectrica, bateria, piano};
		this.instrumentos= aux;
	}
	public void iniciarConcierto() {
		afinarInstrumentos();
		System.out.println();
		tocarInstrumentos();
		
	}
	private void afinarInstrumentos() {
		for (int i = 0; i < instrumentos.length; i++) {
			instrumentos[i].afinar();
		}
		System.out.println("Todos los instrumentos afinados.");
	}
	private void tocarInstrumentos() {
		for (int i = 0; i < instrumentos.length; i++) {
			if(instrumentos[i] instanceof Bateria) { //Mejor usar instanceof en lugar de getClass() y getSimpleName()
				((Bateria) instrumentos[i]).aporrear();
			}else {
				instrumentos[i].tocar();
			}
		}
	}
	
	public static void main(String[] args) {
		BandaMusica b = new BandaMusica();
		b.iniciarConcierto();
	}
}
