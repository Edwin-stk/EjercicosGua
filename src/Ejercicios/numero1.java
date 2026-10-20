package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class numero1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					numero1 frame = new numero1();
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
	public numero1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("CUADROS DE VERIFICACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 474, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chkPerro = new JCheckBox("Perro");
		chkPerro.setBounds(19, 21, 97, 23);
		contentPane.add(chkPerro);
		
	
		
		JCheckBox chkGato = new JCheckBox("Gato");
		chkGato.setBounds(19, 56, 97, 23);
		contentPane.add(chkGato);
		
		JCheckBox chkRaton = new JCheckBox("Ratón");
		chkRaton.setBounds(19, 93, 97, 23);
		contentPane.add(chkRaton);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(31, 198, 342, 14);
		contentPane.add(etiResultado);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Animales elegidos: ";
				if(chkPerro.isSelected()) {
					mensaje=mensaje+"Perro ";
				}
			
				if(chkGato.isSelected()) {
					mensaje=mensaje+"Gato ";
				}
				if(chkRaton.isSelected()) {
					mensaje=mensaje+"Raton ";
				}
				etiResultado.setText(mensaje);
			}
		});
		btnAceptar.setBounds(19, 149, 89, 23);
		contentPane.add(btnAceptar);

	}
}
