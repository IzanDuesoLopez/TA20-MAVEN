package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		JTextArea textArea = new JTextArea(); // Text area principal en el que añadiremos el texto de los diferentes eventos
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) { // En el caso de que la ventana cambie de posición
				textArea.append("Posición de la ventana modificada\n");
			}
			@Override
			public void componentResized(ComponentEvent e) { // En el caso de que modifiquemos la resolución
				textArea.append("Resolución de ventana modificada\n");
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) { // Cuando abramos la ventana
				textArea.append("Aplicación ejecutada\n");
			}
			@Override
			public void windowActivated(WindowEvent e) { // Cuando se ejecute la aplicación
				textArea.append("Ventana abierta\n");
			}
			@Override
			public void windowClosed(WindowEvent e) { // Cuando cerramos la ventana
				textArea.append("Ventana cerrada");
			}
			@Override
			public void windowClosing(WindowEvent e) { // Cuando se esta cerrando la ventana
				textArea.append("Cerrando ventana");
			}
			@Override
			public void windowDeactivated(WindowEvent e) { // Cuando minimizamos la ventana
				textArea.append("Ventana minimizada\n");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textArea.setBounds(10, 25, 553, 307);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Eventos"); // Label en la que definimos que estamos mostrando los diferentes eventos
		lblNewLabel.setBounds(258, 0, 85, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Limpiar consola"); // Botón para limpiar el texto que aparece por consola
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(227, 343, 126, 23);
		contentPane.add(btnNewButton);
	}
}
