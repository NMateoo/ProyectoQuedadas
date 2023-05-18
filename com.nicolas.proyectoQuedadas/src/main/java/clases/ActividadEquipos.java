package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ActividadEquipos extends Actividad{
	private ArrayList<Equipo> equipos;

	public ActividadEquipos(String lugar, boolean privada, byte precio, LocalDateTime momento, String contraseña,
			ArrayList<String> materiales, byte minParticipantes, byte maxParticipantes, ArrayList<Equipo> equipos) {
		super(lugar, privada, precio, momento, contraseña, materiales, minParticipantes, maxParticipantes);
		this.equipos = equipos;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "ActividadEquipos [equipos=" + equipos + "]";
	}
	
	
}
