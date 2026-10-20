package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CudrosCom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CudrosCom frame = new CudrosCom();
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
	
	public CudrosCom() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Cuadros Combinados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(30, 122, 217, 27);
		contentPane.add(etiResultado);
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="El color elegido es: ";
				mensaje+=comboBox.getSelectedItem().toString();
				etiResultado.setText(mensaje);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Verde", "Azul"}));
		comboBox.setBounds(22, 31, 109, 22);
		contentPane.add(comboBox);

	}

}
