package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JTextField inputDinero;
	private JTextField outputDinero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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
	public Ejercicio7() {
		String resultado;
		double resultadoDecimal;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 107);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:"); // Label que muestra cantidad a convertir
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 145, 14);
		contentPane.add(lblNewLabel);
		
		inputDinero = new JTextField(); // Textfield con el input del dinero
		inputDinero.setBounds(162, 9, 86, 20);
		contentPane.add(inputDinero);
		inputDinero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado: "); // Label que muestra resultado
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(258, 12, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		outputDinero = new JTextField(); // Textfield con el output de la conversión de la divisa
		outputDinero.setEditable(false);
		outputDinero.setBounds(340, 9, 131, 20);
		contentPane.add(outputDinero);
		outputDinero.setColumns(10);
		
		JButton eurosAPesetas = new JButton("Euros a pesetas");
		eurosAPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Cuando clicamos al botón realizamos la transformación de euros a ptas
				try {
					String resultado = inputDinero.getText(); // Guardamos en la string el contenido del input
					double resultadoDecimal = Double.parseDouble(resultado); // Pasamos la string a double para poder operar
					resultadoDecimal *= 166.386; // Realizamos la conversión
					resultado = String.format("%.2f", resultadoDecimal); // Realizamos un formato de string para acortar los decimales
					outputDinero.setText(resultado + " ptas"); // Mostramos el output en su casilla correspondiente
				} catch (Exception e2) { // En el caso de que introduzca caracteres no validos
					System.out.println("No se ha podido realizar el calculo");
				}
			}
		});
		eurosAPesetas.setFont(new Font("Tahoma", Font.BOLD, 11));
		eurosAPesetas.setBounds(123, 36, 125, 23);
		contentPane.add(eurosAPesetas);
		
		JButton pesetasAEuros = new JButton("Pesetas a Euros");
		pesetasAEuros.setVisible(false);
		pesetasAEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Cuando clicamos al botón realizamos la transformación de ptas a euros
				try { // Realizaremos el mismo proceso que de euros a Pesetas
					String resultado = inputDinero.getText();
					double resultadoDecimal = Double.parseDouble(resultado);
					resultadoDecimal /= 166.386; // En este caso en vez de multiplicar dividimos
					resultado = String.format("%.2f", resultadoDecimal);
					outputDinero.setText(resultado + " €");
				} catch (Exception e2) {
					System.out.println("No se ha podido realizar el calculo");
				}
			}
		});
		pesetasAEuros.setFont(new Font("Tahoma", Font.BOLD, 11));
		pesetasAEuros.setBounds(123, 36, 125, 23);
		contentPane.add(pesetasAEuros);
		
		JButton cambiarDivisa = new JButton("Cambiar");
		cambiarDivisa.addActionListener(new ActionListener() { // Si clicamos al botón cambiar
			public void actionPerformed(ActionEvent e) {
				if(eurosAPesetas.isVisible()) { // Vamos sustituyendo el botón visible
					eurosAPesetas.setVisible(false);
					pesetasAEuros.setVisible(true);
				} else {
					eurosAPesetas.setVisible(true);
					pesetasAEuros.setVisible(false);
				}
			}
		});
		cambiarDivisa.setFont(new Font("Tahoma", Font.BOLD, 11));
		cambiarDivisa.setBounds(258, 37, 89, 23);
		contentPane.add(cambiarDivisa);
		
		
	}

}
