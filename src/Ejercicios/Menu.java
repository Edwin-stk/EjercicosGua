package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Menu {

	public JFrame frmMenupracticas;
	numero1 e1= new numero1();
		elegidos el=new elegidos();
		ListadeC lista =new ListadeC();
		CudrosCom CC= new CudrosCom();
		ModelosdeCuadro ModC=new ModelosdeCuadro();
		ModelosCUAList ModelosC=new ModelosCUAList();
		Butonss Buts= new Butonss();
		Spiner1 spin=new Spiner1();
		slinders1 slid=new slinders1();
		Bars barras=new Bars();
		Menus1 menuss=new Menus1();
		Herrmients Herramientas=new Herrmients();
		Emergentes Emer=new Emergentes();
		chossr Choser=new chossr();
		Dezplazaminto DEZ=new Dezplazaminto();
		desplaz2 DEZ2=new desplaz2();
		parking parki=new parking();
		VentanaCalculos venc= new VentanaCalculos();
		Laysta lay1= new Laysta();
		lays lay2=new lays();
		Dialogoss Dialog=new Dialogoss();
		VENTANAPRINCIPAL VENT=new VENTANAPRINCIPAL();
;	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenupracticas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmMenupracticas = new JFrame();
		frmMenupracticas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Caja.png"));
		frmMenupracticas.setTitle("MENU-PRACTICAS");
		frmMenupracticas.setBounds(100, 100, 360, 615);
		frmMenupracticas.setLocationRelativeTo(null);
		frmMenupracticas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMenupracticas.getContentPane().setLayout(null);
		
		JButton btnPractica01 = new JButton("Practica 1");
		btnPractica01.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\est.png"));
		btnPractica01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e1.setVisible(true);
			}
		});
		btnPractica01.setBounds(10, 23, 143, 35);
		frmMenupracticas.getContentPane().add(btnPractica01);
		
		JButton btnPractica02 = new JButton("Practica 2");
		btnPractica02.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Cofre.png"));
		btnPractica02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				el.setVisible(true);

			}
		});
		btnPractica02.setBounds(10, 69, 143, 35);
		frmMenupracticas.getContentPane().add(btnPractica02);
		
		JButton btnPractica03 = new JButton("Practica 3");
		btnPractica03.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\cup.png"));
		btnPractica03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista.setVisible(true);
			}
		});
		btnPractica03.setBounds(10, 115, 143, 35);
		frmMenupracticas.getContentPane().add(btnPractica03);
		
		JButton btnPractica04 = new JButton("Practica 4");
		btnPractica04.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Pocion.png"));
		btnPractica04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CC.setVisible(true);
			}
		});
		btnPractica04.setBounds(10, 161, 143, 35);
		frmMenupracticas.getContentPane().add(btnPractica04);
		
		JButton btnPractica05 = new JButton("Practica 5");
		btnPractica05.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\logo.png"));
		btnPractica05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModC.setVisible(true);
			}
		});
		btnPractica05.setBounds(10, 202, 143, 35);
		frmMenupracticas.getContentPane().add(btnPractica05);
		
		JButton btnNewButton = new JButton("Practica 6");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\est.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelosC.setVisible(true);
				
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(10, 248, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Practica 7");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Cofre.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buts.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(10, 289, 143, 35);
		frmMenupracticas.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Practica 8");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\cup.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spin.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 331, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("prs 9");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Pocion.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spin.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(10, 372, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Practica 10");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\logo.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				barras.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(10, 406, 148, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Practica 11");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Espada.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuss.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(10, 442, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Practica 12");
		btnNewButton_5_1.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Cofre.png"));
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Herramientas.setVisible(true);
			}
		});
		btnNewButton_5_1.setBounds(10, 483, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("Practica 13");
		btnNewButton_5_2.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\cup.png"));
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emer.setVisible(true);
			}
		});
		btnNewButton_5_2.setBounds(10, 525, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("Practica 14");
		btnNewButton_5_3.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Pocion.png"));
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choser.setVisible(true);
			}
		});
		btnNewButton_5_3.setBounds(163, 25, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("Practica 15.1");
		btnNewButton_5_4.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\logo.png"));
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DEZ.setVisible(true);
			}
		});
		btnNewButton_5_4.setBounds(163, 71, 148, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_4);
		JButton btnNewButton_5_4_1 = new JButton("Practica 15.2");
		btnNewButton_5_4_1.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\logo.png"));
		
		btnNewButton_5_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DEZ2.setVisible(true);
			}
		});
		btnNewButton_5_4_1.setBounds(163, 115, 148, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_4_1);
		
		JButton btnNewButton_5_5 = new JButton("Practica 16");
		btnNewButton_5_5.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Espada.png"));
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parki.setVisible(true);
			}
		});
		btnNewButton_5_5.setBounds(163, 163, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("Practica 17");
		btnNewButton_5_6.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Cofre.png"));
		btnNewButton_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venc.setVisible(true);
			}
		});
		btnNewButton_5_6.setBounds(163, 204, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("Practica 18");
		btnNewButton_5_7.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Copa.png"));
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lay1.setVisible(true);
			}
		});
		btnNewButton_5_7.setBounds(163, 248, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("Practica 19");
		btnNewButton_5_8.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Pocion.png"));
		btnNewButton_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lay2.setVisible(true);
			}
		});
		btnNewButton_5_8.setBounds(163, 291, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_8);
		
		JButton btnNewButton_5_9 = new JButton("Practica 20");
		btnNewButton_5_9.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\logo.png"));
		btnNewButton_5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog.setVisible(true);
			}
		});
		btnNewButton_5_9.setBounds(163, 331, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_9);
		
		JButton btnNewButton_5_10 = new JButton("Practica 21");
		btnNewButton_5_10.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Espada.png"));
		btnNewButton_5_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VENT.setVisible(true);
			}
		});
		btnNewButton_5_10.setBounds(163, 372, 143, 30);
		frmMenupracticas.getContentPane().add(btnNewButton_5_10);
		
	}
}
