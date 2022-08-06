package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(74, 160, 278, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Si clicas este botón saldrá en el label el siguiente mensaje
				lblNewLabel.setText("Has pulsado: Botón 1");
			}
		});
		btnNewButton.setBounds(44, 83, 118, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Si clicas este botón saldrá en el label el siguiente mensaje
				lblNewLabel.setText("Has pulsado: Botón 2");
			}
		});
		btnNewButton_1.setBounds(285, 83, 108, 40);
		contentPane.add(btnNewButton_1);
		
		
	}
}
