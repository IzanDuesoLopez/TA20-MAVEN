package TA20MAVEN.TA20MAVEN;

import java.awt.event.MouseEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio5 extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Si clicas sobre el textArea se muestra el siguiente texto
				textArea.setText(textArea.getText() + "Has clicado sobre el textArea.\n");
			}
			@Override
			public void mouseEntered(MouseEvent e) { //Si entras con el ratón en el textArea se muestra el siguiente texto
				textArea.setText(textArea.getText() + "Has entrado en el textArea.\n");
			}
			@Override
			public void mouseExited(MouseEvent e) {//Si sales con el ratón en el textArea se muestra el siguiente texto
				textArea.setText(textArea.getText() + "Has salido del textArea.\n");
			}
			@Override
			public void mousePressed(MouseEvent e) { //Si presionas con el ratón en el textArea se muestra el siguiente texto
				textArea.setText(textArea.getText() + "Has presionado sobre el textArea.\n");
			}
			@Override
			public void mouseReleased(MouseEvent e) { //Si dejas de clicar con el ratón en el textArea se muestra el siguiente texto
				textArea.setText(textArea.getText() + "Has dejado de clicar sobre el textArea.\n");
			}
		});
		textArea.setBounds(10, 50, 416, 202);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Cuando pulsas el botón se borra todo el texto del textArea
				textArea.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(167, 16, 89, 23);
		contentPane.add(btnNewButton);
	
	}
}
