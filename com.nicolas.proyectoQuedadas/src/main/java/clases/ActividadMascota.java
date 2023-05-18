package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ActividadMascota extends Actividad{
	private ArrayList<Mascota> mascota;
	private boolean soloPerros;
	private boolean soloGatos;
	public ActividadMascota(String lugar, boolean privada, byte precio, LocalDateTime momento, String contraseña,
			ArrayList<String> materiales, byte minParticipantes, byte maxParticipantes, ArrayList<Mascota> mascota,
			boolean soloPerros, boolean soloGatos) {
		super(lugar, privada, precio, momento, contraseña, materiales, minParticipantes, maxParticipantes);
		this.mascota = mascota;
		this.soloPerros = soloPerros;
		this.soloGatos = soloGatos;
	}
	public ArrayList<Mascota> getMascota() {
		return mascota;
	}
	public void setMascota(ArrayList<Mascota> mascota) {
		this.mascota = mascota;
	}
	public boolean isSoloPerros() {
		return soloPerros;
	}
	public void setSoloPerros(boolean soloPerros) {
		this.soloPerros = soloPerros;
	}
	public boolean isSoloGatos() {
		return soloGatos;
	}
	public void setSoloGatos(boolean soloGatos) {
		this.soloGatos = soloGatos;
	}
	@Override
	public String toString() {
		return "ActividadMascota [mascota=" + mascota + ", soloPerros=" + soloPerros + ", soloGatos=" + soloGatos + "]";
	}
}
