package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import enums.Categoria;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaAñadirMascota extends JPanel{
	Ventana ventana;
	private JTextField CampoNombre;
	public PantallaAñadirMascota(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel textTitulo = new JLabel("Añadir Mascotas");
		textTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel.add(textTitulo);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{188, 0, 277, 277, 277, 44, 45, 0};
		gbl_panel_1.rowHeights = new int[]{34, 0, 0, 13, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel textNombre = new JLabel("Nombre: ");
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.anchor = GridBagConstraints.NORTHEAST;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 1;
		panel_1.add(textNombre, gbc_textNombre);
		
		CampoNombre = new JTextField();
		GridBagConstraints gbc_CampoNombre = new GridBagConstraints();
		gbc_CampoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_CampoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_CampoNombre.gridx = 3;
		gbc_CampoNombre.gridy = 1;
		panel_1.add(CampoNombre, gbc_CampoNombre);
		CampoNombre.setColumns(10);
		
		JLabel textRaza = new JLabel("Raza:");
		textRaza.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textRaza = new GridBagConstraints();
		gbc_textRaza.anchor = GridBagConstraints.EAST;
		gbc_textRaza.insets = new Insets(0, 0, 5, 5);
		gbc_textRaza.gridx = 2;
		gbc_textRaza.gridy = 2;
		panel_1.add(textRaza, gbc_textRaza);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perro", "Gato"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 2;
		panel_1.add(comboBox, gbc_comboBox);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.anchor = GridBagConstraints.EAST;
		gbc_btnAñadir.insets = new Insets(0, 0, 0, 5);
		gbc_btnAñadir.gridx = 2;
		gbc_btnAñadir.gridy = 7;
		panel_1.add(btnAñadir, gbc_btnAñadir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaMascotas.class);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 7;
		panel_1.add(btnCancelar, gbc_btnCancelar);
	}

}
