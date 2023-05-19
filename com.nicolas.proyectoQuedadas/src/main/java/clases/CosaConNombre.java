package clases;

import java.sql.SQLException;

public class CosaConNombre {
	protected String nombre;

	public CosaConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws SQLException {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CosaConNombre [nombre=" + nombre + "]";
	}
	
	
}
