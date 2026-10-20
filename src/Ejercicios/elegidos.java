package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;
public class elegidos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elegidos frame = new elegidos();
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
	public elegidos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Botones de Opción");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 20, 180, 130);
		panel_1.setBorder(new TitledBorder(null, "Colores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton optRojo = new JRadioButton("Rojo");
		optRojo.setBounds(23, 22, 109, 23);
		panel_1.add(optRojo);
		
		JRadioButton optVerde = new JRadioButton("Verde");
		optVerde.setBounds(23, 48, 109, 23);
		panel_1.add(optVerde);
		
		JRadioButton optAzul = new JRadioButton("Azul");
		optAzul.setBounds(23, 80, 109, 23);
		panel_1.add(optAzul);
		
		
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(20, 201, 250, 23);
		contentPane.add(etiResultado);
		ButtonGroup grupoColores=new ButtonGroup();
		grupoColores.add(optRojo);
		grupoColores.add(optVerde);
		grupoColores.add(optAzul);
		optRojo.setSelected(true);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(30, 160, 89, 23);
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String mensaje="Colores elegidos: ";
				if(optRojo.isSelected()) {
					mensaje=mensaje+"Rojo ";
				}else if(optVerde.isSelected()){
					mensaje=mensaje+"Verde ";
				} else if(optAzul.isSelected()) {
					mensaje=mensaje+"Azul ";
				}
				etiResultado.setText(mensaje);
				
			}
		});
		contentPane.add(btnAceptar);
	}
}
