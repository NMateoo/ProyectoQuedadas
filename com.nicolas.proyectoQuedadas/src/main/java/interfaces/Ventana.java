package interfaces;

import javax.swing.JFrame;

import clases.Persona;

public class Ventana extends JFrame{
	protected Persona personaLogada;
	
	public Ventana() {
		this.setSize(600,500);
		this.setResizable(false);
		this.setTitle("Programa de quedadas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //siempre sale centrado la pantalla
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true);
	}
	
	public void cambiarPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		
		if(clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if(clase.equals(PantallaPrincipal.class)) {
			this.setContentPane(new PantallaPrincipal(this));
		}
		if(clase.equals(PantallaMascotas.class)) {
			this.setContentPane(new PantallaMascotas(this));
		}
		if(clase.equals(PantallaAñadirMascota.class)) {
			this.setContentPane(new PantallaAñadirMascota(this));
		}
		if(clase.equals(PantallaAñadirActivi.class)) {
			this.setContentPane(new PantallaAñadirActivi(this));
		}
		if(clase.equals(PantallaAñadirActiviMascota.class)) {
			this.setContentPane(new PantallaAñadirActiviMascota(this));
		}
		if(clase.equals(PantallaAñadirActiviEquipo.class)) {
			this.setContentPane(new PantallaAñadirActiviEquipo(this));
		}
		if(clase.equals(PantallaActividades.class)) {
			this.setContentPane(new PantallaActividades(this));
		}
		this.getContentPane().setVisible(true);
	}
}
