package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class PantallaActividades extends JPanel{
	Ventana ventana;
	public PantallaActividades(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnSalir = new JButton("Volver");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPrincipal.class);
			}
		});
		panel.add(btnSalir);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);
		
		JLabel textTitulo = new JLabel("Mis actividades");
		textTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel_1.add(textTitulo);
		
		JTextArea lista = new JTextArea();
		add(lista, BorderLayout.CENTER);
	}

}
