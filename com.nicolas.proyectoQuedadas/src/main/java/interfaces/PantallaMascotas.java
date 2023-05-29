package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import utils.DAO;

import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaMascotas extends JPanel{
	Ventana ventana;
	public PantallaMascotas(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JLabel textoTitulo = new JLabel("Mis mascotas");
		textoTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
		add(textoTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnAñadirMacota = new JButton("Añadir mascota");
		btnAñadirMacota.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaAñadirMascota.class);
			}
		});
		btnAñadirMacota.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(btnAñadirMacota);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPrincipal.class);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(btnAtras);
		
		JScrollPane lista = new JScrollPane();
		add(lista, BorderLayout.CENTER);
		
		JPanel listaMascotas = new JPanel();
		lista.setViewportView(listaMascotas);
		listaMascotas.setLayout(new BoxLayout(listaMascotas, BoxLayout.Y_AXIS));
		
	}

}
