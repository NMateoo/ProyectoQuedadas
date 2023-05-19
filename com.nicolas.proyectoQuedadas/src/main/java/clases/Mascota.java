package clases;

import java.sql.SQLException;
import java.util.HashMap;

import utils.DAO;

public class Mascota extends CosaConNombre{
	private String animal;
	private Persona dueño;
	
	public Mascota(String nombre, String animal, Persona dueño)  throws SQLException{
		super(nombre);
		HashMap<String,Object>columnas=new HashMap<String,Object>();
        columnas.put("nombre", nombre);
        columnas.put("animal", animal);
        columnas.put("dueño", dueño.getNombre());
       
        DAO.insertar("mascota", columnas);
       
        this.nombre = nombre;
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