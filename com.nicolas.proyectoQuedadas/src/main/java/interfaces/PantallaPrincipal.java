package interfaces;

import javax.swing.JPanel;

import clases.Persona;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaPrincipal extends JPanel{
	Ventana ventana;
	
	public PantallaPrincipal(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JLabel textBienvenido = new JLabel("Bienvenid@: "+ventana.personaLogada.getNombre());
		textBienvenido.setFont(new Font("Tahoma", Font.BOLD, 27));
		add(textBienvenido, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnMisMascotas = new JButton("Mis mascotas");
		btnMisMascotas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaMascotas.class);
			}
		});
		btnMisMascotas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(btnMisMascotas);
		
		JButton btnMisActividades = new JButton("Mis actividades");
		btnMisActividades.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(btnMisActividades);
		
		JButton btnAñadirAct = new JButton("Añadir actividad");
		btnAñadirAct.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(btnAñadirAct);
		
		JScrollPane lista = new JScrollPane();
		add(lista, BorderLayout.CENTER);
		
		JPanel contenedorActividades = new JPanel();
		lista.setViewportView(contenedorActividades);
		contenedorActividades.setLayout(new BoxLayout(contenedorActividades, BoxLayout.Y_AXIS));
		
		for(byte i=0;i<100;i++) {
			contenedorActividades.add(new ListaActividades(ventana));
		}
	}
}
