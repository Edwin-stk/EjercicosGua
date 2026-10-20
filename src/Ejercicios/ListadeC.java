package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class ListadeC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadeC frame = new ListadeC();
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
	public ListadeC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Cuadros de Lista");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList IstColores = new JList();
		IstColores.setModel(new AbstractListModel() {
			String[] values = new String[] {"Rojo", "Verde", "Azul"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		IstColores.setBounds(10, 25, 123, 115);
		contentPane.add(IstColores);
		
		
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(28, 213, 273, 23);
		contentPane.add(etiResultado);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				if(IstColores.getSelectedIndex()==-1) {
					mensaje="No hay un color Seleccionado.";
				}else {
					mensaje="El color seleccionado es: "+IstColores.getSelectedValue().toString();
				}
				etiResultado.setText(mensaje);
			}
		});
		btnAceptar.setBounds(10, 164, 89, 23);
		contentPane.add(btnAceptar);

	}
}
