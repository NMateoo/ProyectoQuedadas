package interfaces;

import javax.swing.JFrame;

import clases.Persona;

public class Ventana extends JFrame{
	protected Persona personaLogada;
	
	public Ventana() {
		this.setSize(600,500);
		this.setResizable(false);
		this.setTitle("Login");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //siempre sale centrado la pantalla
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true);
	}
}
