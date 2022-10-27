package curso.java.ejercicios.poo.interfaces;

public interface IUpdatable extends IInsertable {
	
	/**
	 * Método para actualizar el registro en la BBDD.
	 */
	void update(long id);
}
