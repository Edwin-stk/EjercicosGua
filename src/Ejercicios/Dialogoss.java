package Ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Dialogoss extends JFrame {
	double iva;
	double descuento;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUnidades;
	private JTextField txtPrecio;
	private final JDialog dialogoConfiguracion = new JDialog();
	private JTextField txtIva;
	private JTextField txtDescuento;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dialogoss frame = new Dialogoss();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Dialogoss() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("DIÁLOGOS");
		// --- ESTO ES TU DIALOGO TAL CUAL LA GUIA ---
		dialogoConfiguracion.setBounds(new Rectangle(100, 100, 320, 200));
		dialogoConfiguracion.setTitle("Configuracion de iva y descuento");
		dialogoConfiguracion.getContentPane().setLayout(null);
		
		JLabel lblIva = new JLabel("IVA %:");
		lblIva.setBounds(20, 20, 80, 20);
		dialogoConfiguracion.getContentPane().add(lblIva);
		
		txtIva = new JTextField();
		txtIva.setText("0");
		txtIva.setBounds(130, 20, 80, 20);
		dialogoConfiguracion.getContentPane().add(txtIva);
		txtIva.setColumns(10);
		
		JLabel lblDescuento = new JLabel("DESCUENTO %:");
		lblDescuento.setBounds(20, 50, 110, 20);
		dialogoConfiguracion.getContentPane().add(lblDescuento);
		
		txtDescuento = new JTextField();
		txtDescuento.setText("0");
		txtDescuento.setBounds(130, 50, 80, 20);
		dialogoConfiguracion.getContentPane().add(txtDescuento);
		txtDescuento.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ESTO ES LO QUE DICE LA GUIA - GUARDAR
				iva = Double.parseDouble(txtIva.getText());
				descuento = Double.parseDouble(txtDescuento.getText());
				dialogoConfiguracion.setVisible(false);
			}
		});
		btnAceptar.setBounds(30, 100, 90, 25);
		dialogoConfiguracion.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ESTO ES LO QUE DICE LA GUIA - CERRAR
				dialogoConfiguracion.setVisible(false);
			}
		});
		btnCancelar.setBounds(150, 100, 90, 25);
		dialogoConfiguracion.getContentPane().add(btnCancelar);
		
		iva=0;
		descuento=0;
		
		// --- VENTANA PRINCIPAL ---
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unidades:");
		lblNewLabel.setBounds(32, 30, 63, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio:");
		lblNewLabel_1.setBounds(32, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL:");
		lblNewLabel_2.setBounds(32, 115, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(145, 31, 125, 20);
		contentPane.add(txtUnidades);
		txtUnidades.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(145, 68, 125, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel etiTotal = new JLabel("");
		etiTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiTotal.setBounds(145, 115, 125, 14);
		contentPane.add(etiTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double unidades;
				double precio;
				double total;
				double cantiva;
				double cantdes;
				double totalsiniva;
				
				unidades=Double.parseDouble(txtUnidades.getText());
				precio=Double.parseDouble(txtPrecio.getText());
				
				totalsiniva=precio*unidades;
				cantiva=totalsiniva*iva/100;
				cantdes=totalsiniva*descuento/100;
				
				total=totalsiniva+cantiva-cantdes;
				
				etiTotal.setText(""+total);
			}
		});
		btnCalcular.setBounds(32, 204, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ESTO ES LO QUE DICE LA GUIA - ABRIR DIALOGO
				txtIva.setText(""+iva);
				txtDescuento.setText(""+descuento);
				dialogoConfiguracion.setVisible(true);
			}
		});
		btnConfiguracion.setBounds(181, 204, 119, 23);
		contentPane.add(btnConfiguracion);
	}
}