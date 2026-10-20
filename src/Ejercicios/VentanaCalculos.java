package Ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaCalculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JLabel etiResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculos frame = new VentanaCalculos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaCalculos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Centralizar Código");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu menuCalcular = new JMenu("Calcular");
		menuBar.add(menuCalcular);
		
		JMenuItem menuSumar = new JMenuItem("Sumar");
		menuSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		menuCalcular.add(menuSumar);
		
		JMenuItem menuRestar = new JMenuItem("Restar");
		menuRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar();
			}
		});
		menuCalcular.add(menuRestar);
		
		JMenuItem menuBorrar = new JMenuItem("Borrar");
		menuBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		menuCalcular.add(menuBorrar);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(20, 78, 81, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(20, 111, 81, 22);
		contentPane.add(lblNewLabel_1);
		
		txtNumero1 = new JTextField();
		txtNumero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		txtNumero1.setBounds(123, 79, 136, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		txtNumero2.setBounds(123, 112, 136, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(20, 149, 239, 22);
		contentPane.add(etiResultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		btnSumar.setBounds(20, 186, 89, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar();
			}
		});
		btnRestar.setBounds(20, 220, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		btnBorrar.setBounds(123, 186, 89, 23);
		contentPane.add(btnBorrar);
	}

	void Sumar() {
		String cad1, cad2;
		int a, b, s;
		cad1 = txtNumero1.getText();
		cad2 = txtNumero2.getText();
		a = Integer.parseInt(cad1);
		b = Integer.parseInt(cad2);
		s = a + b;
		etiResultado.setText("" + s);
	}

	void Restar() {
		String cad1, cad2;
		int a, b, r;
		cad1 = txtNumero1.getText();
		cad2 = txtNumero2.getText();
		a = Integer.parseInt(cad1);
		b = Integer.parseInt(cad2);
		r = a - b;
		etiResultado.setText("" + r);
	}

	void Borrar() {
		txtNumero1.setText("");
		txtNumero2.setText("");
	}
}
