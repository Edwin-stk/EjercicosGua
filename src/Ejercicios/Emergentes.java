package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Emergentes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emergentes frame = new Emergentes();
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
	public Emergentes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Menus Emergentes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		JPopupMenu menuEmergente = new JPopupMenu();
		menuEmergente.setBounds(53, 63, 65, 16);
		addPopup(contentPane, menuEmergente);
		
		JMenuItem menuRojo = new JMenuItem("Rojo");
		menuRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emergentes.this.getContentPane().setBackground(Color.RED);
			}
		});
		menuEmergente.add(menuRojo);
		
		JMenuItem menuVerde = new JMenuItem("Verde");
		menuVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emergentes.this.getContentPane().setBackground(Color.GREEN);

			}
		});
		menuEmergente.add(menuVerde);
		
		JMenuItem menuAzul = new JMenuItem("Azul");
		menuAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emergentes.this.getContentPane().setBackground(Color.BLUE);

			}
		});
		menuEmergente.add(menuAzul);
	
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				menuEmergente.show(contentPane,evt.getX(),evt.getY());
				//if(evt.getButton()==1) {
				//	JOptionPane.showMessageDialog(null,"Pulso el Izquierdo");
				//	}else if(evt.getButton()==2) {
					//	JOptionPane.showMessageDialog(null,"Pulso el Central");
					//}else if(evt.getButton()==3) {
						//JOptionPane.showMessageDialog(null,"Pulso el Derecho");

					//}
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
				
			}
			
		});
		
	}
}
