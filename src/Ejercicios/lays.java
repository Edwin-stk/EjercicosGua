package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class lays extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lays frame = new lays();
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
	public lays() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("LAYOUTS Y PANELES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setPreferredSize(new Dimension(0, 50));
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Ejercicios de distribucion de paneles  y Layout");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTitulo.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Por Edwin González");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTitulo.add(lblNewLabel);
		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panelDatos.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setBounds(10, 41, 67, 14);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panelDatos.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 39, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panelDatos.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Apellido");
		lblNewLabel_6.setBounds(10, 39, 67, 14);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		panelDatos.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 34, 86, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panelBotonera = new JPanel();
		panelBotonera.setPreferredSize(new Dimension(120, 200));
		contentPane.add(panelBotonera, BorderLayout.WEST);
		panelBotonera.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Button4");
		btnNewButton_2.setBounds(10, 133, 89, 23);
		panelBotonera.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Button3");
		btnNewButton_3.setBounds(10, 99, 89, 23);
		panelBotonera.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Button2");
		btnNewButton_4.setBounds(10, 59, 89, 23);
		panelBotonera.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Button1");
		btnNewButton_5.setBounds(10, 26, 89, 23);
		panelBotonera.add(btnNewButton_5);
		
		JPanel panelVerificacion = new JPanel();
		panelVerificacion.setPreferredSize(new Dimension(130, 200));
		contentPane.add(panelVerificacion, BorderLayout.EAST);
		panelVerificacion.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("jCheckBox1");
		chckbxNewCheckBox_1.setBounds(16, 34, 97, 23);
		panelVerificacion.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("jCheckBox2");
		chckbxNewCheckBox.setBounds(16, 60, 97, 23);
		panelVerificacion.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("jCheckBox3");
		chckbxNewCheckBox_3.setBounds(16, 101, 97, 23);
		panelVerificacion.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("jCheckBox4");
		chckbxNewCheckBox_2.setBounds(16, 132, 97, 23);
		panelVerificacion.add(chckbxNewCheckBox_2);
		
		JPanel panelEstado = new JPanel();
		panelEstado.setPreferredSize(new Dimension(0, 50));
		contentPane.add(panelEstado, BorderLayout.SOUTH);
		panelEstado.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(334, 15, 80, 21);
		panelEstado.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(255, 15, 69, 21);
		panelEstado.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(199, 18, 46, 14);
		panelEstado.add(lblNewLabel_4);

	}
}
