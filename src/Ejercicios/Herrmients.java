package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Herrmients extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Herrmients frame = new Herrmients();
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
	public Herrmients() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Barra de Herramientas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JToolBar barraHerramientas = new JToolBar();
		barraHerramientas.setBounds(0, 22, 434, 22);
		contentPane.add(barraHerramientas);
		
		JButton btnUno = new JButton("Uno");
		btnUno.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\vrs.png"));
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Activaste el Boton UNO");
			}
		});
		barraHerramientas.add(btnUno);
		
		JButton btnDos = new JButton("Dos");
		btnDos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\cup.png"));
		barraHerramientas.add(btnDos);
		
		JButton btnTres = new JButton("Tres");
		btnTres.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\est.png"));
		barraHerramientas.add(btnTres);
		
		JButton btnCuatro = new JButton("Cuatro");
		btnCuatro.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Pocion.png"));
		barraHerramientas.add(btnCuatro);

	}
}
