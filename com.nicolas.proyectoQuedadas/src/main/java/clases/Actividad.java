package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Actividad {
	private String lugar;
	private boolean privada;
	private byte precio;
	private LocalDateTime momento;
	private String contraseña;
	private ArrayList<String> materiales;
	private byte minParticipantes;
	private byte maxParticipantes;
	public Actividad(String lugar, boolean privada, byte precio, LocalDateTime momento, String contraseña,
			ArrayList<String> materiales, byte minParticipantes, byte maxParticipantes) {
		super();
		this.lugar = lugar;
		this.privada = privada;
		this.precio = precio;
		this.momento = momento;
		this.contraseña = contraseña;
		this.materiales = materiales;
		this.minParticipantes = minParticipantes;
		this.maxParticipantes = maxParticipantes;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public boolean isPrivada() {
		return privada;
	}
	public void setPrivada(boolean privada) {
		this.privada = privada;
	}
	public byte getPrecio() {
		return precio;
	}
	public void setPrecio(byte precio) {
		this.precio = precio;
	}
	public LocalDateTime getMomento() {
		return momento;
	}
	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public ArrayList<String> getMateriales() {
		return materiales;
	}
	public void setMateriales(ArrayList<String> materiales) {
		this.materiales = materiales;
	}
	public byte getMinParticipantes() {
		return minParticipantes;
	}
	public void setMinParticipantes(byte minParticipantes) {
		this.minParticipantes = minParticipantes;
	}
	public byte getMaxParticipantes() {
		return maxParticipantes;
	}
	public void setMaxParticipantes(byte maxParticipantes) {
		this.maxParticipantes = maxParticipantes;
	}
	@Override
	public String toString() {
		return "Actividad [lugar=" + lugar + ", privada=" + privada + ", precio=" + precio + ", momento=" + momento
				+ ", contraseña=" + contraseña + ", materiales=" + materiales + ", minParticipantes=" + minParticipantes
				+ ", maxParticipantes=" + maxParticipantes + "]";
	}
}
