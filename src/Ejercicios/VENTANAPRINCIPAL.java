package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class VENTANAPRINCIPAL extends JFrame {

    JLabel etiNum1;
    JLabel etiNum2;
    JTextField txtNum1;
    JTextField txtNum2;
    JButton btnSumar;
    JButton btnRestar;

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VENTANAPRINCIPAL frame = new VENTANAPRINCIPAL();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VENTANAPRINCIPAL() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\yosh.png"));
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setTitle("Programa Operaciones");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        etiNum1 = new JLabel();
        etiNum1.setText("Numero 1:");
        etiNum1.setBounds(10, 10, 100, 20);
        this.getContentPane().add(etiNum1);

        etiNum2 = new JLabel();
        etiNum2.setText("Numero 2:");
        etiNum2.setBounds(10, 60, 100, 20);
        this.getContentPane().add(etiNum2);

        txtNum1 = new JTextField();
        txtNum1.setText("0");
        txtNum1.setBounds(110, 10, 100, 20);
        this.getContentPane().add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setText("0");
        txtNum2.setBounds(110, 60, 100, 20);
        this.getContentPane().add(txtNum2);

        // BOTONES
        btnSumar = new JButton();
        btnSumar.setText("Sumar");
        btnSumar.setBounds(10, 120, 100, 20);
        this.getContentPane().add(btnSumar);

        btnRestar = new JButton();
        btnRestar.setText("Restar");
        btnRestar.setBounds(150, 120, 100, 20);
        this.getContentPane().add(btnRestar);

        // EVENTOS - ESTO VA AL FINAL DEL CreacionVentana
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
    }

    // ESTOS METODOS VAN FUERA DE CreacionVentana
    public void btnSumarActionPerformed(ActionEvent evt) {
        double a, b, s;
        a = Double.parseDouble(txtNum1.getText());
        b = Double.parseDouble(txtNum2.getText());
        s = a + b;
        JOptionPane.showMessageDialog(null, "La suma es " + s);
    }

    public void btnRestarActionPerformed(ActionEvent evt) {
        double a, b, r;
        a = Double.parseDouble(txtNum1.getText());
        b = Double.parseDouble(txtNum2.getText());
        r = a - b;
        JOptionPane.showMessageDialog(null, "La resta es " + r);
    }
}