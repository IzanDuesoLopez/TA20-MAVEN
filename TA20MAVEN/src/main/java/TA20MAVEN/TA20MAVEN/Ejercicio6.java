package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 61, 96, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso (kg)");
		lblNewLabel_1.setBounds(241, 61, 65, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(135, 58, 76, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 58, 76, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(241, 109, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double valor1 = Double.parseDouble(textField.getText());
				System.out.println(valor1);
				double valor2 = Double.parseDouble(textField_1.getText());
				System.out.println(valor2);
				double valor3 = valor2 / Math.pow(valor1, 2);
				valor3 = Math.round(valor3 * 100) / 100d;
				String valor_final = "" + valor3;
				System.out.println(valor3);
				textField_2.setText(valor_final);
			}
		});
		btnNewButton.setBounds(95, 108, 116, 21);
		contentPane.add(btnNewButton);
	}
}
