package clases;

public class Perro extends Mascota{
	private String animal;
	private Persona dueño;
	public Perro(String nombre, String animal, Persona dueño, String animal2, Persona dueño2) {
		super(nombre, animal, dueño);
		animal = animal2;
		dueño = dueño2;
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
		return "Perro [animal=" + animal + ", dueño=" + dueño + "]";
	}
}
