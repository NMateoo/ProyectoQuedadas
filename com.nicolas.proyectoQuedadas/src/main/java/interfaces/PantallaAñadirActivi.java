package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import enums.Categoria;

public class PantallaAñadirActivi extends JPanel{
	Ventana ventana;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField campoLugar;
	private JPasswordField campoContraseña;
	public PantallaAñadirActivi(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel textTitulo = new JLabel("Crear actividad");
		textTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel.add(textTitulo);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{104, 73, 0, 87, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 23, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel textLugar = new JLabel("Lugar:");
		textLugar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textLugar = new GridBagConstraints();
		gbc_textLugar.anchor = GridBagConstraints.EAST;
		gbc_textLugar.insets = new Insets(0, 0, 5, 5);
		gbc_textLugar.gridx = 1;
		gbc_textLugar.gridy = 0;
		panel_2.add(textLugar, gbc_textLugar);
		
		campoLugar = new JTextField();
		GridBagConstraints gbc_campoLugar = new GridBagConstraints();
		gbc_campoLugar.insets = new Insets(0, 0, 5, 5);
		gbc_campoLugar.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoLugar.gridx = 2;
		gbc_campoLugar.gridy = 0;
		panel_2.add(campoLugar, gbc_campoLugar);
		campoLugar.setColumns(10);
		
		JLabel textPrecio = new JLabel("Precio:");
		textPrecio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.anchor = GridBagConstraints.EAST;
		gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecio.gridx = 1;
		gbc_textPrecio.gridy = 1;
		panel_2.add(textPrecio, gbc_textPrecio);
		
		JSpinner spinnerPrecio = new JSpinner();
		spinnerPrecio.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		GridBagConstraints gbc_spinnerPrecio = new GridBagConstraints();
		gbc_spinnerPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerPrecio.gridx = 2;
		gbc_spinnerPrecio.gridy = 1;
		panel_2.add(spinnerPrecio, gbc_spinnerPrecio);
		
		JLabel textHora = new JLabel("Hora:");
		textHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textHora = new GridBagConstraints();
		gbc_textHora.anchor = GridBagConstraints.EAST;
		gbc_textHora.insets = new Insets(0, 0, 5, 5);
		gbc_textHora.gridx = 1;
		gbc_textHora.gridy = 2;
		panel_2.add(textHora, gbc_textHora);
		
		JLabel textContraseña = new JLabel("Contraseña:");
		textContraseña.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.anchor = GridBagConstraints.EAST;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.gridx = 1;
		gbc_textContraseña.gridy = 3;
		panel_2.add(textContraseña, gbc_textContraseña);
		
		campoContraseña = new JPasswordField();
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.gridx = 2;
		gbc_campoContraseña.gridy = 3;
		panel_2.add(campoContraseña, gbc_campoContraseña);
		
		JLabel textCategoria = new JLabel("Categoria:");
		textCategoria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textCategoria = new GridBagConstraints();
		gbc_textCategoria.anchor = GridBagConstraints.EAST;
		gbc_textCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_textCategoria.gridx = 1;
		gbc_textCategoria.gridy = 4;
		panel_2.add(textCategoria, gbc_textCategoria);
		
		JComboBox comboCategoria = new JComboBox();
		comboCategoria.setModel(new DefaultComboBoxModel(Categoria.values()));
		GridBagConstraints gbc_comboCategoria = new GridBagConstraints();
		gbc_comboCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_comboCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboCategoria.gridx = 2;
		gbc_comboCategoria.gridy = 4;
		panel_2.add(comboCategoria, gbc_comboCategoria);
		
		JLabel textMin = new JLabel("Part.Min: ");
		GridBagConstraints gbc_textMin = new GridBagConstraints();
		gbc_textMin.anchor = GridBagConstraints.EAST;
		gbc_textMin.insets = new Insets(0, 0, 5, 5);
		gbc_textMin.gridx = 1;
		gbc_textMin.gridy = 5;
		panel_2.add(textMin, gbc_textMin);
		
		JSpinner spinnerMin = new JSpinner();
		spinnerMin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		GridBagConstraints gbc_spinnerMin = new GridBagConstraints();
		gbc_spinnerMin.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerMin.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerMin.gridx = 2;
		gbc_spinnerMin.gridy = 5;
		panel_2.add(spinnerMin, gbc_spinnerMin);
		
		JLabel textMax = new JLabel("Part.Max:");
		GridBagConstraints gbc_textMax = new GridBagConstraints();
		gbc_textMax.anchor = GridBagConstraints.EAST;
		gbc_textMax.insets = new Insets(0, 0, 5, 5);
		gbc_textMax.gridx = 1;
		gbc_textMax.gridy = 6;
		panel_2.add(textMax, gbc_textMax);
		
		JSpinner spinnerMax = new JSpinner();
		spinnerMax.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		GridBagConstraints gbc_spinnerMax = new GridBagConstraints();
		gbc_spinnerMax.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerMax.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerMax.gridx = 2;
		gbc_spinnerMax.gridy = 6;
		panel_2.add(spinnerMax, gbc_spinnerMax);
		
		final JRadioButton radioEquipo = new JRadioButton("En equipo");
		buttonGroup.add(radioEquipo);
		GridBagConstraints gbc_radioEquipo = new GridBagConstraints();
		gbc_radioEquipo.anchor = GridBagConstraints.NORTH;
		gbc_radioEquipo.insets = new Insets(0, 0, 0, 5);
		gbc_radioEquipo.gridx = 1;
		gbc_radioEquipo.gridy = 7;
		panel_2.add(radioEquipo, gbc_radioEquipo);
		
		final JRadioButton radioMascota = new JRadioButton("Con mascota");
		buttonGroup.add(radioMascota);
		GridBagConstraints gbc_radioMascota = new GridBagConstraints();
		gbc_radioMascota.insets = new Insets(0, 0, 0, 5);
		gbc_radioMascota.anchor = GridBagConstraints.NORTH;
		gbc_radioMascota.gridx = 2;
		gbc_radioMascota.gridy = 7;
		panel_2.add(radioMascota, gbc_radioMascota);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(radioEquipo.isSelected()) {
					ventana.cambiarPantalla(PantallaAñadirActiviEquipo.class);
				}
				if(radioMascota.isSelected()) {
					ventana.cambiarPantalla(PantallaAñadirActiviMascota.class);
				}
			}
		});
		panel_1.add(btnSiguiente);
		
		JButton btnSalir = new JButton("Volver");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaPrincipal.class);
			}
		});
		panel_1.add(btnSalir);
	}

}
