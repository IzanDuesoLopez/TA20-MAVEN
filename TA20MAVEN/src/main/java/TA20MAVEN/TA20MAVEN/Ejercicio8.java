package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio8 extends JFrame {

	private JPanel contentPane;
	private JTextField inputDinero;
	private JTextField outputDinero;

	public static void main(String[] args) { // Método principal en el que crearemos la instancia del frame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8 frame = new Ejercicio8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio8() {
		String resultado; // String con el resultado
		double resultadoDecimal; // Double con el resultado decimal
		
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
		eurosAPesetas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { // Si presionamos la tecla ENTER estando enfocados en el botón
					try {
						String resultado = inputDinero.getText(); // Guardamos en la string el contenido del input
						double resultadoDecimal = Double.parseDouble(resultado); // Pasamos la string a double para poder operar
						resultadoDecimal *= 166.386; // Realizamos la conversión
						resultado = String.format("%.2f", resultadoDecimal); // Realizamos un formato de string para acortar los decimales
						outputDinero.setText(resultado + " ptas"); // Mostramos el output en su casilla correspondiente
					} catch (Exception e2) { // En el caso de que introduzca caracteres no validos
						JOptionPane.showMessageDialog(eurosAPesetas, "No se ha podido realizar el calculo");
					}
				}
			}
		});
		eurosAPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Cuando clicamos al botón realizamos la transformación de euros a ptas
				try {
					String resultado = inputDinero.getText(); // Guardamos en la string el contenido del input
					double resultadoDecimal = Double.parseDouble(resultado); // Pasamos la string a double para poder operar
					resultadoDecimal *= 166.386; // Realizamos la conversión
					resultado = String.format("%.2f", resultadoDecimal); // Realizamos un formato de string para acortar los decimales
					outputDinero.setText(resultado + " ptas"); // Mostramos el output en su casilla correspondiente
				} catch (Exception e2) { // En el caso de que introduzca caracteres no validos
					JOptionPane.showMessageDialog(eurosAPesetas, "No se ha podido realizar el calculo");
				}
			}
		});
		eurosAPesetas.setFont(new Font("Tahoma", Font.BOLD, 11));
		eurosAPesetas.setBounds(49, 36, 125, 23);
		contentPane.add(eurosAPesetas);
		
		JButton pesetasAEuros = new JButton("Pesetas a Euros");
		pesetasAEuros.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {// Si presionamos la tecla ENTER estando enfocados en el botón
					try { // Realizaremos el mismo proceso que de euros a Pesetas
						String resultado = inputDinero.getText();
						double resultadoDecimal = Double.parseDouble(resultado);
						resultadoDecimal /= 166.386; // En este caso en vez de multiplicar dividimos
						resultado = String.format("%.2f", resultadoDecimal);
						outputDinero.setText(resultado + " €");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(pesetasAEuros, "No se ha podido realizar el calculo");
					}
				}
			}
		});
		pesetasAEuros.setVisible(false); // Inicializamos el botón en que no sea visible, para que únicamente podamos utilizar el de euros a ptas
		pesetasAEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Cuando clicamos al botón realizamos la transformación de ptas a euros
				try { // Realizaremos el mismo proceso que de euros a Pesetas
					String resultado = inputDinero.getText();
					double resultadoDecimal = Double.parseDouble(resultado);
					resultadoDecimal /= 166.386; // En este caso en vez de multiplicar dividimos
					resultado = String.format("%.2f", resultadoDecimal);
					outputDinero.setText(resultado + " €");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(pesetasAEuros, "No se ha podido realizar el calculo");
				}
			}
		});
		pesetasAEuros.setFont(new Font("Tahoma", Font.BOLD, 11));
		pesetasAEuros.setBounds(49, 36, 125, 23);
		contentPane.add(pesetasAEuros);
		
		JButton cambiarDivisa = new JButton("Cambiar");
		cambiarDivisa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {// Si presionamos la tecla ENTER estando enfocados en el botón
					if(eurosAPesetas.isVisible()) { // Vamos sustituyendo el botón visible
						eurosAPesetas.setVisible(false);
						pesetasAEuros.setVisible(true);
					} else {
						eurosAPesetas.setVisible(true);
						pesetasAEuros.setVisible(false);
					}
				}
			}
		});
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
		cambiarDivisa.setBounds(184, 36, 89, 23);
		contentPane.add(cambiarDivisa);
		
		JButton borrar = new JButton("Borrar");
		borrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {// Si presionamos la tecla ENTER estando enfocados en el botón
					inputDinero.setText("");
					outputDinero.setText("");
				}
			}
		});
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputDinero.setText("");
				outputDinero.setText("");
			}
		});
		borrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		borrar.setBounds(282, 37, 89, 23);
		contentPane.add(borrar);
	}
}
