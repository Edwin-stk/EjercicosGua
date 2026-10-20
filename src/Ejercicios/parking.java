package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class parking extends JFrame {
int coches;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parking frame = new parking();
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
	public parking() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("VARIABLES GLOBALES");
		coches=0;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel etiCoches = new JLabel("");
		etiCoches.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiCoches.setBounds(194, 180, 73, 23);
		contentPane.add(etiCoches);
		
		JButton btnEntro = new JButton("Entro un coche");
		btnEntro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coches=coches+1;
				etiCoches.setText(""+coches);
			}
		});
		btnEntro.setBounds(23, 23, 104, 23);
		contentPane.add(btnEntro);
		
		JButton btnSalio = new JButton("Salio un coche");
		btnSalio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(coches>0) {
					coches=coches-1;
					etiCoches.setText(""+coches);
				}
			}
		});
		btnSalio.setBounds(23, 72, 104, 23);
		contentPane.add(btnSalio);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coches=0;
				etiCoches.setText("0");
			}
		});
		btnReiniciar.setBounds(27, 132, 89, 23);
		contentPane.add(btnReiniciar);
		
		JLabel lblNewLabel = new JLabel("Coches en el Parking:");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(20, 180, 131, 23);
		contentPane.add(lblNewLabel);
		
		

	}

}
