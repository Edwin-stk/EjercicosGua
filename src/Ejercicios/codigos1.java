package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class codigos1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCuadroTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					codigos1 frame = new codigos1();
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
	public codigos1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Formularios desde Código");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiEtiqueta = new JLabel("Esto es una etiqueta");
		etiEtiqueta.setBounds(56, 73, 125, 14);
		contentPane.add(etiEtiqueta);
		
		txtCuadroTexto = new JTextField();
		txtCuadroTexto.setText("Y esto es un Cuadro de Texto");
		txtCuadroTexto.setBounds(49, 117, 159, 20);
		contentPane.add(txtCuadroTexto);
		txtCuadroTexto.setColumns(10);
		
		JButton bttnBoton = new JButton("Aceptar");
		bttnBoton.setBounds(46, 33, 89, 23);
		contentPane.add(bttnBoton);

	}
}
