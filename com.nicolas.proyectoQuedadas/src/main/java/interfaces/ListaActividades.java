package interfaces;

import javax.swing.JPanel;

import clases.Persona;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Font;

public class ListaActividades extends JPanel{
	Ventana ventana;
	
	public ListaActividades(Ventana v) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{28, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel textNombreActividad = new JLabel("Pepepito");
		textNombreActividad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textNombreActividad = new GridBagConstraints();
		gbc_textNombreActividad.insets = new Insets(0, 0, 0, 5);
		gbc_textNombreActividad.gridx = 0;
		gbc_textNombreActividad.gridy = 1;
		add(textNombreActividad, gbc_textNombreActividad);
		
		JButton btnUnirse = new JButton("Unirse");
		btnUnirse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnUnirse = new GridBagConstraints();
		gbc_btnUnirse.gridx = 2;
		gbc_btnUnirse.gridy = 1;
		add(btnUnirse, gbc_btnUnirse);
		ventana=v;
	}
	
}
