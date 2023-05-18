package clases;

import enums.RazaGato;

public class Gato extends Mascota{
	private RazaGato raza;

	public Gato(String nombre, String animal, Persona dueño, RazaGato raza) {
		super(nombre, animal, dueño);
		this.raza = raza;
	}

	public RazaGato getRaza() {
		return raza;
	}

	public void setRaza(RazaGato raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [raza=" + raza + "]";
	}
	
	
}
