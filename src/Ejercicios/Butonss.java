package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Butonss extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecioBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Butonss frame = new Butonss();
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
	public Butonss() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("ToggleButtons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio Base");
		lblNewLabel.setBounds(27, 11, 92, 27);
		contentPane.add(lblNewLabel);
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setBounds(27, 38, 86, 20);
		contentPane.add(txtPrecioBase);
		txtPrecioBase.setColumns(10);
		
		JToggleButton tbtnInstalacion = new JToggleButton("Instalacion");
		tbtnInstalacion.setBounds(22, 79, 121, 23);
		contentPane.add(tbtnInstalacion);
		
		JToggleButton tbtnFormacion = new JToggleButton("Formación");
		tbtnFormacion.setBounds(27, 113, 121, 23);
		contentPane.add(tbtnFormacion);
		
		JToggleButton tbtnAlimentacionBD = new JToggleButton("Alimentacion BD");
		tbtnAlimentacionBD.setBounds(27, 147, 121, 23);
		contentPane.add(tbtnAlimentacionBD);
		
		JLabel etiPrecioInstalacion = new JLabel("40");
		etiPrecioInstalacion.setBounds(142, 83, 46, 14);
		contentPane.add(etiPrecioInstalacion);
		
		JLabel etiPrecioFornacion = new JLabel("200");
		etiPrecioFornacion.setBounds(152, 117, 46, 14);
		contentPane.add(etiPrecioFornacion);
		
		JLabel etiPrecioAlimenttacionBD = new JLabel("200");
		etiPrecioAlimenttacionBD.setBounds(158, 151, 46, 14);
		contentPane.add(etiPrecioAlimenttacionBD);
		
		
	
		JLabel etiTotal = new JLabel("");
		etiTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiTotal.setBounds(47, 219, 199, 31);
		contentPane.add(etiTotal);
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio_base;
				double precio_instal;
				double precio_for;
				double precio_ali;
				precio_base= Double.parseDouble(txtPrecioBase.getText());
				precio_instal= Double.parseDouble(etiPrecioInstalacion.getText());
				precio_for= Double.parseDouble(etiPrecioFornacion.getText());
				precio_ali= Double.parseDouble(etiPrecioAlimenttacionBD.getText());
				double precio_total;
				 precio_total=precio_base;
				if( tbtnInstalacion.isSelected()) {
					 precio_total=precio_total+precio_instal;
				}
				 if(tbtnFormacion.isSelected()) {
					 precio_total=precio_total+precio_for;
				 }
				 if(tbtnAlimentacionBD.isSelected()) {
					 precio_total=precio_total+precio_ali;
				 }
					etiTotal.setText(precio_total+"$");

			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.setBounds(37, 181, 89, 23);
		contentPane.add(btnCalcular);
		
		tbtnInstalacion.setSelected(true);

	}
}
