package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class chossr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-447,-32
	 */
	private final JFileChooser elegirFichero = new JFileChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chossr frame = new chossr();
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
	public chossr() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("FILECHOOSER");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar barraMenus = new JMenuBar();
		barraMenus.setBounds(0, 0, 101, 22);
		contentPane.add(barraMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);
		
		JMenuItem menuAbrir = new JMenuItem("Abrir");
		menuAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp=elegirFichero.showOpenDialog(null);
				if(resp==JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null,elegirFichero.getSelectedFile().toString());
				}else if(resp==JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null,"Se pulso la opcion Cancelar");
				}
			}
		});
		menuArchivo.add(menuAbrir);
		
		JSeparator separator = new JSeparator();
		menuArchivo.add(separator);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuArchivo.add(menuSalir);

	}
}
