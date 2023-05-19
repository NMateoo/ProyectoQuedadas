package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;

public class ListaMascotas extends JPanel{
	Ventana ventana;
	public ListaMascotas(Ventana v) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel textMascota = new JLabel("Mascota");
		textMascota.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textMascota = new GridBagConstraints();
		gbc_textMascota.gridwidth = 3;
		gbc_textMascota.fill = GridBagConstraints.HORIZONTAL;
		gbc_textMascota.insets = new Insets(0, 0, 0, 5);
		gbc_textMascota.gridx = 1;
		gbc_textMascota.gridy = 0;
		add(textMascota, gbc_textMascota);
		ventana=v;
	}

}
