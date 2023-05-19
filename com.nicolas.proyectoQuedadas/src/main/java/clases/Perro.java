package clases;

import java.sql.SQLException;

import enums.RazaPerro;

public class Perro extends Mascota{
	private RazaPerro raza;

	public Perro(String nombre, String animal, Persona dueño, RazaPerro raza)  throws SQLException{
		super(nombre, animal, dueño);
		this.raza = raza;
	}

	public RazaPerro getRaza() {
		return raza;
	}

	public void setRaza(RazaPerro raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [raza=" + raza + "]";
	}
	
	
}