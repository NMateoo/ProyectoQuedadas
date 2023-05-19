package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;

import clases.Persona;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PantallaRegistro extends JPanel{
	private Ventana ventana;
	private JTextField campoNombre;
	private JTextField campoCorreo;
	private JPasswordField campoContraseña;
	private JTextField campoTelefono;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public PantallaRegistro(Ventana v) {
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{31, 0, 0, 0, 0, 0, 0, 34, 35, 0};
		gridBagLayout.rowHeights = new int[]{75, 0, 0, 64, 96, 0, 0, 0, 0, 51, 0, 31, 0, 0, 197, 197, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel textRegistro = new JLabel("Registrarse");
		textRegistro.setFont(new Font("Tahoma", Font.BOLD, 39));
		GridBagConstraints gbc_textRegistro = new GridBagConstraints();
		gbc_textRegistro.gridwidth = 3;
		gbc_textRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_textRegistro.gridx = 3;
		gbc_textRegistro.gridy = 4;
		add(textRegistro, gbc_textRegistro);
		
		JLabel textNombre = new JLabel("Nombre:");
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.anchor = GridBagConstraints.EAST;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.gridx = 1;
		gbc_textNombre.gridy = 5;
		add(textNombre, gbc_textNombre);
		
		campoNombre = new JTextField();
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.gridwidth = 4;
		gbc_campoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombre.gridx = 3;
		gbc_campoNombre.gridy = 5;
		add(campoNombre, gbc_campoNombre);
		campoNombre.setColumns(10);
		
		JLabel textCorreo = new JLabel("Correo electronico:");
		textCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textCorreo = new GridBagConstraints();
		gbc_textCorreo.gridwidth = 3;
		gbc_textCorreo.anchor = GridBagConstraints.EAST;
		gbc_textCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_textCorreo.gridx = 0;
		gbc_textCorreo.gridy = 6;
		add(textCorreo, gbc_textCorreo);
		
		campoCorreo = new JTextField();
		GridBagConstraints gbc_campoCorreo = new GridBagConstraints();
		gbc_campoCorreo.gridwidth = 4;
		gbc_campoCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_campoCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoCorreo.gridx = 3;
		gbc_campoCorreo.gridy = 6;
		add(campoCorreo, gbc_campoCorreo);
		campoCorreo.setColumns(10);
		
		JLabel textTelefono = new JLabel("Telefono:");
		textTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.gridwidth = 2;
		gbc_textTelefono.anchor = GridBagConstraints.EAST;
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.gridx = 1;
		gbc_textTelefono.gridy = 7;
		add(textTelefono, gbc_textTelefono);
		
		campoTelefono = new JTextField();
		GridBagConstraints gbc_campoTelefono = new GridBagConstraints();
		gbc_campoTelefono.gridwidth = 4;
		gbc_campoTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_campoTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoTelefono.gridx = 3;
		gbc_campoTelefono.gridy = 7;
		add(campoTelefono, gbc_campoTelefono);
		campoTelefono.setColumns(10);
		
		JLabel textContraseña = new JLabel("Contraseña:");
		textContraseña.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.gridwidth = 2;
		gbc_textContraseña.anchor = GridBagConstraints.EAST;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.gridx = 1;
		gbc_textContraseña.gridy = 8;
		add(textContraseña, gbc_textContraseña);
		
		campoContraseña = new JPasswordField();
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.gridwidth = 4;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.gridx = 3;
		gbc_campoContraseña.gridy = 8;
		add(campoContraseña, gbc_campoContraseña);
		
		final JRadioButton radioHombre = new JRadioButton("Hombre");
		buttonGroup.add(radioHombre);
		GridBagConstraints gbc_radioHombre = new GridBagConstraints();
		gbc_radioHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioHombre.gridx = 3;
		gbc_radioHombre.gridy = 10;
		add(radioHombre, gbc_radioHombre);
		
		final JRadioButton radioMujer = new JRadioButton("Mujer");
		buttonGroup.add(radioMujer);
		GridBagConstraints gbc_radioMujer = new GridBagConstraints();
		gbc_radioMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioMujer.gridx = 4;
		gbc_radioMujer.gridy = 10;
		add(radioMujer, gbc_radioMujer);
		
		JRadioButton radioSinG = new JRadioButton("Prefiero no decirlo");
		buttonGroup.add(radioSinG);
		GridBagConstraints gbc_radioSinG = new GridBagConstraints();
		gbc_radioSinG.insets = new Insets(0, 0, 5, 5);
		gbc_radioSinG.gridx = 5;
		gbc_radioSinG.gridy = 10;
		add(radioSinG, gbc_radioSinG);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaLogin.class);
			}
		});
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String nombre = campoNombre.getText().toString();
					String contraseña = new String(campoContraseña.getPassword());
					int telefono = Integer.parseInt(campoTelefono.getText());
					String email = campoCorreo.getText();
					char genero;
					
					if(radioMujer.isSelected()) {
						genero='h';
					}
					if(radioHombre.isSelected()) {
						genero='m';
					} else {
						genero='n';
					}
					new Persona(nombre,email,genero,telefono,contraseña);
					ventana.cambiarPantalla(PantallaLogin.class);
					JOptionPane.showMessageDialog(ventana, "Registrado correctamente", "Exito",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLIntegrityConstraintViolationException e3) {
					JOptionPane.showMessageDialog(ventana, "Este email ya esta en uso", "No se pudo registrar",
							JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "No se puede conectar a la BD",
							JOptionPane.ERROR_MESSAGE);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(ventana, "Telefono no valido", "Telefono erroneo",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrarse.gridx = 4;
		gbc_btnRegistrarse.gridy = 12;
		add(btnRegistrarse, gbc_btnRegistrarse);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 13;
		add(btnNewButton, gbc_btnNewButton);
		
	}
}
