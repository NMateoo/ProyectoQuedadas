package clases;

public class Persona extends CosaConNombre{
	private int telefono;
	private char genero;
	private String contraseña;
	private Mascota mascota;
	
	public Persona(String nombre, int telefono, char genero, String contraseña, Mascota mascota) {
		super(nombre);
		this.telefono = telefono;
		this.genero = genero;
		this.contraseña = contraseña;
		this.mascota = mascota;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	@Override
	public String toString() {
		return "Persona [telefono=" + telefono + ", genero=" + genero + ", contraseña=" + contraseña + ", mascota="
				+ mascota + "]";
	}
}
