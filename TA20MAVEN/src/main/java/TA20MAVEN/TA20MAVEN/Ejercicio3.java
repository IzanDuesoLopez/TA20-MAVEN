package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private int boton1 = 0;
	private int boton2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Botón 1: " + boton1 + " veces");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(51, 41, 133, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Botón 2: " + boton2 + " veces");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(251, 41, 125, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Se guarda en una variable cada vez que se hace click 
				boton1++;
				lblNewLabel.setText("Botón 1: " + boton1 + " veces"); //Muestra en el label el total de veces que se ha clicado
			}
		});
		btnNewButton.setBounds(73, 113, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//Se guarda en una variable cada vez que se hace click 
				boton2++;
				lblNewLabel_1.setText("Botón 2: " + boton2 + " veces"); //Muestra en el label el total de veces que se ha clicado
			}
		});
		btnNewButton_1.setBounds(273, 113, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
