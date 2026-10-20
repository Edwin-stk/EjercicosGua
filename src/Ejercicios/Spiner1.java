package Ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;
public class Spiner1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spiner1 frame = new Spiner1();
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
	public Spiner1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("Spinner");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 233, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(25, 72, 110, 34);
		contentPane.add(etiValor);
		JSpinner spiValor = new JSpinner();
		spiValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor:"+spiValor.getValue().toString());
			}
		});
		spiValor.setBounds(25, 22, 93, 34);
		contentPane.add(spiValor);
		
		SpinnerNumberModel nm=new SpinnerNumberModel();
		nm.setMaximum(10);
		nm.setMinimum(0);
		nm.setStepSize(2);
		nm.setStepSize(2);
		nm.setValue(4);	
		spiValor.setModel(nm);
	}
}
