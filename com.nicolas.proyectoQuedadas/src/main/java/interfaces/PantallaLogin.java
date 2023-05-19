package interfaces;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;

import clases.Persona;
import exceptions.ContraseñaInvalidaException;
import exceptions.UsuarioNoExisteException;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class PantallaLogin extends JPanel{
	private Ventana ventana;
	private JTextField campoCorreo;
	private JPasswordField campoContraseña;
	
	public PantallaLogin(Ventana v) {
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{31, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel textLogin = new JLabel("Login");
		textLogin.setFont(new Font("Tahoma", Font.BOLD, 39));
		GridBagConstraints gbc_textLogin = new GridBagConstraints();
		gbc_textLogin.insets = new Insets(0, 0, 5, 5);
		gbc_textLogin.gridx = 1;
		gbc_textLogin.gridy = 1;
		add(textLogin, gbc_textLogin);
		
		JLabel textCorreo = new JLabel("Correo electronico:");
		textCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textCorreo = new GridBagConstraints();
		gbc_textCorreo.anchor = GridBagConstraints.EAST;
		gbc_textCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_textCorreo.gridx = 0;
		gbc_textCorreo.gridy = 3;
		add(textCorreo, gbc_textCorreo);
		
		campoCorreo = new JTextField();
		GridBagConstraints gbc_campoCorreo = new GridBagConstraints();
		gbc_campoCorreo.gridwidth = 2;
		gbc_campoCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_campoCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoCorreo.gridx = 1;
		gbc_campoCorreo.gridy = 3;
		add(campoCorreo, gbc_campoCorreo);
		campoCorreo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contraseña:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		campoContraseña = new JPasswordField();
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.gridwidth = 2;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.gridx = 1;
		gbc_campoContraseña.gridy = 4;
		add(campoContraseña, gbc_campoContraseña);
		
		JButton btnIniciar = new JButton("Iniciar sesion");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String email=campoCorreo.getText();
				String contraseña=new String(campoContraseña.getPassword());
				System.out.println("Usuario: "+email+"\nContraseña: "+contraseña);
				
				try {
					ventana.personaLogada=new Persona(email,contraseña);
					ventana.cambiarPantalla(PantallaPrincipal.class);
					JOptionPane.showMessageDialog(ventana, "Bienvend@ "+ventana.personaLogada.getNombre(),
							"Inicio de sesion exitoso",JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "No se puede conectar a la BD",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (UsuarioNoExisteException e1) {
					JOptionPane.showMessageDialog(ventana, "El correo no esta registrado",
							"Correo no registrado",JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (ContraseñaInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, "La contraseña no es correcta",
							"Contraseña no es correcta",JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
		gbc_btnIniciar.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciar.gridx = 1;
		gbc_btnIniciar.gridy = 6;
		add(btnIniciar, gbc_btnIniciar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRegistro.class);
			}
		});
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrarse.gridx = 1;
		gbc_btnRegistrarse.gridy = 7;
		add(btnRegistrarse, gbc_btnRegistrarse);
	}
}
