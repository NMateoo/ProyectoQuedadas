package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import clases.Gato;
import clases.Mascota;
import clases.Perro;
import clases.Persona;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import enums.Categoria;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import enums.RazaGato;
import enums.RazaPerro;

public class PantallaAñadirMascota extends JPanel{
	Ventana ventana;
	private JTextField campoNombre;
	Persona dueño;
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
		
		campoNombre = new JTextField();
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombre.gridx = 3;
		gbc_campoNombre.gridy = 1;
		panel_1.add(campoNombre, gbc_campoNombre);
		campoNombre.setColumns(10);
		
		JLabel textAnimal = new JLabel("Mascota:");
		textAnimal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textAnimal = new GridBagConstraints();
		gbc_textAnimal.anchor = GridBagConstraints.EAST;
		gbc_textAnimal.insets = new Insets(0, 0, 5, 5);
		gbc_textAnimal.gridx = 2;
		gbc_textAnimal.gridy = 2;
		panel_1.add(textAnimal, gbc_textAnimal);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perro", "Gato"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 2;
		panel_1.add(comboBox, gbc_comboBox);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(RazaPerro.values()));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 3;
		panel_1.add(comboBox_1, gbc_comboBox_1);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(RazaGato.values()));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 4;
		panel_1.add(comboBox_2, gbc_comboBox_2);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre=campoNombre.getText();
				String animal=comboBox.getSelectedItem().toString();
				RazaPerro razaPerro=(RazaPerro) comboBox_1.getSelectedItem();
				RazaGato razaGato=(RazaGato) comboBox_2.getSelectedItem();
				dueño=ventana.personaLogada;
				
				//En desarrollo
				/*if(animal.equals("Perro")) {
					Mascota mascota;
					try {
						mascota = new Mascota(nombre,animal,dueño);
						Perro perro=new Perro(nombre,mascota.getNombre(),ventana.personaLogada,razaPerro);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(animal.equals("Gato")) {
					Mascota mascota;
					try {
						mascota = new Mascota(nombre,animal,dueño);
						Gato gato=new Gato(nombre,mascota.getNombre(),ventana.personaLogada,razaGato);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}*/
				try {
					Mascota mascota=new Mascota(nombre,animal,dueño);
					JOptionPane.showMessageDialog(ventana, "Mascota "+mascota.getNombre()+" añadida con exito",
							"Mascota creada con exito",JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JLabel textRaza = new JLabel("Raza:");
		textRaza.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textRaza = new GridBagConstraints();
		gbc_textRaza.anchor = GridBagConstraints.EAST;
		gbc_textRaza.insets = new Insets(0, 0, 5, 5);
		gbc_textRaza.gridx = 2;
		gbc_textRaza.gridy = 3;
		panel_1.add(textRaza, gbc_textRaza);
		
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
