package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class desplaz2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					desplaz2 frame = new desplaz2();
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
	public desplaz2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Panel de Datos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ejemplo 2 de JScrollPane");
		lblNewLabel.setBounds(10, 11, 153, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scpDatos = new JScrollPane();
		scpDatos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scpDatos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scpDatos.setBounds(10, 33, 414, 217);
		contentPane.add(scpDatos);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setPreferredSize(new Dimension(450, 500));
		panelDatos.setBackground(new Color(0, 255, 0));
		scpDatos.setViewportView(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PANEL DE DATOS");
		lblNewLabel_1.setBounds(10, 11, 132, 14);
		panelDatos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lunes");
		lblNewLabel_2.setBounds(20, 36, 46, 14);
		panelDatos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Martes");
		lblNewLabel_3.setBounds(20, 61, 46, 14);
		panelDatos.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Miercoles");
		lblNewLabel_4.setBounds(20, 86, 46, 14);
		panelDatos.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Jueves");
		lblNewLabel_5.setBounds(20, 111, 46, 14);
		panelDatos.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Viernes");
		lblNewLabel_6.setBounds(20, 136, 46, 14);
		panelDatos.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sabado");
		lblNewLabel_7.setBounds(20, 155, 46, 14);
		panelDatos.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Domingo");
		lblNewLabel_8.setBounds(20, 180, 46, 14);
		panelDatos.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(106, 33, 160, 20);
		panelDatos.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 58, 160, 20);
		panelDatos.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 83, 160, 20);
		panelDatos.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 108, 160, 20);
		panelDatos.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 133, 160, 20);
		panelDatos.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 177, 160, 20);
		panelDatos.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(106, 155, 160, 20);
		panelDatos.add(textField_6);
		textField_6.setColumns(10);

	}
}
