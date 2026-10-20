package Ejercicios;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Menus1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menus1 frame = new Menus1();
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
	public Menus1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Barra de Menus");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar barraMenus = new JMenuBar();
		setJMenuBar(barraMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);
		
		JMenuItem menuItemAbrir = new JMenuItem("Abrir");
		menuArchivo.add(menuItemAbrir);
		
		JMenuItem menuItemGuardar = new JMenuItem("Guardar");
		menuArchivo.add(menuItemGuardar);
		
		JSeparator separador1 = new JSeparator();
		menuArchivo.add(separador1);
		
		JMenuItem menuItemSalir = new JMenuItem("Salir");
		menuArchivo.add(menuItemSalir);
		
		JMenu menuEdicion = new JMenu("Edicion");
		barraMenus.add(menuEdicion);
		
		JMenu menuColores = new JMenu("Colores");
		menuEdicion.add(menuColores);
		
		JMenuItem menuItemRojo = new JMenuItem("Rojo");
		menuItemRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menus1.this.getContentPane().setBackground(Color.RED);
			}
		});
		menuColores.add(menuItemRojo);

		
		
		JMenuItem menuItemVerde = new JMenuItem("Verde");
		menuItemVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menus1.this.getContentPane().setBackground(Color.GREEN);

			}
		});
		menuColores.add(menuItemVerde);
		
		JMenuItem menuItemAzul = new JMenuItem("Azul");
		menuItemAzul.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Menus1.this.getContentPane().setBackground(Color.BLUE);

			}
			
		});
		menuColores.add(menuItemAzul);
		
		JMenu menuInsertar = new JMenu("Insertar");
		barraMenus.add(menuInsertar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
}
