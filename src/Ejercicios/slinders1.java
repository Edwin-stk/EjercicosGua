package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class slinders1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					slinders1 frame = new slinders1();
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
	public slinders1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Sliders");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(22, 178, 387, 26);
		contentPane.add(etiValor);
		
		JSlider slDeslizador = new JSlider();
		slDeslizador.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+slDeslizador.getValue());
			}
		});
		slDeslizador.setPaintLabels(true);
		slDeslizador.setPaintTicks(true);
		slDeslizador.setMajorTickSpacing(50);
		slDeslizador.setMaximum(500);
		slDeslizador.setMinimum(100);
		slDeslizador.setValue(400);
		slDeslizador.setBounds(26, 37, 383, 42);
		contentPane.add(slDeslizador);

	}
}
