import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class UF2179_caneteRuz_Moises_ej1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtOrigen;
	private JTextField txtDestino;
	private JComboBox comboEnvio;
	private JTextField txtPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UF2179_caneteRuz_Moises_ej1 frame = new UF2179_caneteRuz_Moises_ej1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UF2179_caneteRuz_Moises_ej1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][19.00,grow][54.00,grow][54.00,grow][13.00,grow][grow][]", "[][][][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Calculadora de Envíos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel, "cell 0 0 9 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad Origen:");
		contentPane.add(lblNewLabel_1, "cell 2 2,alignx trailing");
		
		txtOrigen = new JTextField();
		contentPane.add(txtOrigen, "cell 3 2 4 1,growx");
		txtOrigen.setColumns(10);
		
		JRadioButton rdbNacional = new JRadioButton("Nacional");
		rdbNacional.setSelected(true);
		contentPane.add(rdbNacional, "cell 3 3 2 1,growx");
		
		JRadioButton rdbExtranjero = new JRadioButton("Extranjero");
		contentPane.add(rdbExtranjero, "cell 5 3");
		
		JLabel lblNewLabel_2 = new JLabel("Ciudad Destino:");
		contentPane.add(lblNewLabel_2, "cell 2 4,alignx trailing");
		
		txtDestino = new JTextField();
		contentPane.add(txtDestino, "cell 3 4 4 1,growx");
		txtDestino.setColumns(10);
		
		JRadioButton rdbNacionalD = new JRadioButton("Nacional");
		rdbNacionalD.setSelected(true);
		contentPane.add(rdbNacionalD, "cell 3 5 2 1");
		
		JRadioButton rdbExtranjeroD = new JRadioButton("Extranjero");
		contentPane.add(rdbExtranjeroD, "cell 5 5");
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de envío:");
		contentPane.add(lblNewLabel_3, "cell 2 6,alignx left");
		
		comboEnvio = new JComboBox();
		comboEnvio.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10 h", "Paq 14 -Antes de las 14 h", "Paq 24 - Al día siguiente"}));
		comboEnvio.setToolTipText("");
		contentPane.add(comboEnvio, "cell 3 6 4 1,growx");
		
		JLabel lblNewLabel_4 = new JLabel("Peso:");
		contentPane.add(lblNewLabel_4, "cell 2 7,alignx left");
		
		txtPeso = new JTextField();
		contentPane.add(txtPeso, "cell 3 7,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Kg");
		contentPane.add(lblNewLabel_5, "cell 4 7");
		
		JButton btnPrecio = new JButton("Calcular Precio");
		btnPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnPrecio, "cell 3 8 5 1");
		
		btnPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String origen=txtOrigen.getText();
				String destino=txtDestino.getText();
				
				if(origen==null || origen.isBlank() || destino==null || destino.isBlank()) {
				JOptionPane.showMessageDialog(null, 
						"Debes Introducir direcciones",
						"Introduce direcciones", JOptionPane.ERROR_MESSAGE);
				return;
				}
				
				double importe=0;
				
				
				if(rdbNacional.isSelected() && rdbNacionalD.isSelected()) {
					importe=4;
				}else {
					importe=7;
				}
			}
		});
	}

}
