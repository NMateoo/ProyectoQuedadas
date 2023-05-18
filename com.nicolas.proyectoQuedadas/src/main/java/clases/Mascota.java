package clases;

public class Mascota extends CosaConNombre{
	private String animal;
	private Persona dueño;
	public Mascota(String nombre, String animal, Persona dueño) {
		super(nombre);
		this.animal = animal;
		this.dueño = dueño;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public Persona getDueño() {
		return dueño;
	}
	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}
	@Override
	public String toString() {
		return "Mascota [animal=" + animal + "]";
	}
	
	
}
