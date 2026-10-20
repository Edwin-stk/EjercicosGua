package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class ModelosdeCuadro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModelosdeCuadro frame = new ModelosdeCuadro();
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
	public ModelosdeCuadro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Módelos de Cuadros de Lista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(175, 22, 207, 23);
		contentPane.add(etiResultado);
		JList IstNombres = new JList();
		IstNombres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				etiResultado.setText(IstNombres.getSelectedValue().toString());

			}
		});
		IstNombres.setBounds(29, 21, 97, 128);
		contentPane.add(IstNombres);
		
		JButton btnCurso1 = new JButton("Curso 1");
		btnCurso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo=new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("Maria");
				modelo.addElement("Luis");
				IstNombres.setModel(modelo);
			}
			
		});
		btnCurso1.setBounds(25, 160, 89, 23);
		contentPane.add(btnCurso1);
		
		JButton btnCurso2 = new JButton("Curso 2");
		btnCurso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo=new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				IstNombres.setModel(modelo);
			}
		});
		btnCurso2.setBounds(29, 194, 89, 23);
		contentPane.add(btnCurso2);
		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo=new DefaultListModel();
				IstNombres.setModel(modelo);
				etiResultado.setText("");


			}
		});
		btnVaciar.setBounds(29, 227, 89, 23);
		contentPane.add(btnVaciar);

	}

}
