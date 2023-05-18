package clases;

import java.util.ArrayList;

public class Equipo {
	private ArrayList<Persona> miembros;
	private byte tamañoMaximo;
	public Equipo(ArrayList<Persona> miembros, byte tamañoMaximo) {
		super();
		this.miembros = miembros;
		this.tamañoMaximo = tamañoMaximo;
	}
	public ArrayList<Persona> getMiembros() {
		return miembros;
	}
	public void setMiembros(ArrayList<Persona> miembros) {
		this.miembros = miembros;
	}
	public byte getTamañoMaximo() {
		return tamañoMaximo;
	}
	public void setTamañoMaximo(byte tamañoMaximo) {
		this.tamañoMaximo = tamañoMaximo;
	}
	@Override
	public String toString() {
		return "Equipo [miembros=" + miembros + ", tamañoMaximo=" + tamañoMaximo + "]";
	}
}
