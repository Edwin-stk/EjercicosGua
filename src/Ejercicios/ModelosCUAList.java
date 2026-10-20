package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ModelosCUAList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModelosCUAList frame = new ModelosCUAList();
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
	public ModelosCUAList() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Modelos de Cuadro de Lista");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(35, 178, 274, 23);
		contentPane.add(etiResultado);
		
		JComboBox cboNumeros = new JComboBox();
		cboNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiResultado.setText(cboNumeros.getSelectedItem().toString());
			}
		});
		cboNumeros.setBorder(new LineBorder(new Color(0, 0, 0)));
		cboNumeros.setBounds(22, 25, 107, 22);
		contentPane.add(cboNumeros);
		
		JButton btnPares = new JButton("Pares");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo=new DefaultComboBoxModel();
				for( i=0;i<10;i+=2) {
					modelo.addElement("N° "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnPares.setBounds(179, 25, 89, 23);
		contentPane.add(btnPares);
		
		JButton btnImpares = new JButton("Impares");
		btnImpares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo=new DefaultComboBoxModel();
				for( i=1;i<10;i+=2) {
					modelo.addElement("N° "+i);
				}
				cboNumeros.setModel(modelo);
			}
			
		});
		btnImpares.setBounds(290, 25, 89, 23);
		contentPane.add(btnImpares);
		
	
		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel modelo=new DefaultComboBoxModel();
				cboNumeros.setModel(modelo);
				etiResultado.setText("");
			}
		});
		btnVaciar.setBounds(179, 59, 89, 23);
		contentPane.add(btnVaciar);

	}

}
