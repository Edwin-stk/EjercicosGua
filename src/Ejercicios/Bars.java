package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Toolkit;

public class Bars extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bars frame = new Bars();
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
	public Bars() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
		setTitle("SCROLLBARS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(25, 167, 284, 32);
		contentPane.add(etiValor);
		
		JScrollBar desValor = new JScrollBar();
		desValor.setMinimum(50);
		desValor.setMaximum(155);		
		desValor.setVisibleAmount(5);
		desValor.setUnitIncrement(2);
		desValor.setBlockIncrement(10);
		desValor.setValue(70);
		desValor.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				etiValor.setText("El valor es: "+desValor.getValue());
			}
		});
		desValor.setBackground(new Color(255, 255, 255));
		desValor.setOrientation(JScrollBar.HORIZONTAL);
		desValor.setBounds(30, 30, 350, 25);
		contentPane.add(desValor);

	}
}
