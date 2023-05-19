package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaAñadirActiviEquipo extends JPanel{
	Ventana ventana;
	public PantallaAñadirActiviEquipo(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel textTitulo = new JLabel("Crear actividad en equipo");
		textTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel.add(textTitulo);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCrear = new JButton("Crear actividad");
		panel_1.add(btnCrear);
		
		JButton btnSalir = new JButton("Volver");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaAñadirActivi.class);
			}
		});
		panel_1.add(btnSalir);
	}

}
