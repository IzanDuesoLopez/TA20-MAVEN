package TA20MAVEN.TA20MAVEN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio9 extends JFrame implements ActionListener{

	// Variables de clase
	private JPanel contentPane;
	private int contador = 0;
	private Color colorUno = Color.RED, colorDos = Color.BLACK;
	private JToggleButton botonUno,botonDos,botonTres,botonCuatro, botonCinco,botonSeis,botonSiete,botonOcho, botonNueve,botonDiez,botonOnce,botonDoce;
	private JToggleButton botonTrece,botonCatorce,botonQuince,botonDiceiseis;
	private JToggleButton[][] tableroBotones = new JToggleButton[4][4];
	// Matriz con colores para el tablero
	Color[][] colores = { { Color.RED, Color.RED, Color.GREEN, Color.GREEN },
							{ Color.BLUE, Color.BLUE, Color.BLACK, Color.BLACK },
							{ Color.PINK, Color.PINK, Color.ORANGE, Color.ORANGE },
							{ Color.MAGENTA, Color.MAGENTA, Color.CYAN, Color.CYAN } };

	/**
	 * Método principal
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 frame = new Ejercicio9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creamos el frame principal de la aplicación
	 */
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Botones del tablero
		botonUno = new JToggleButton("");
		botonUno.setForeground(Color.RED);
		botonUno.setBounds(0, 0, 100, 100);
		contentPane.add(botonUno);
		
		botonDos = new JToggleButton("");
		botonDos.setForeground(Color.ORANGE);
		botonDos.setBounds(110, 0, 100, 100);
		contentPane.add(botonDos);
		
		botonTres = new JToggleButton("");
		botonTres.setBounds(220, 0, 100, 100);
		contentPane.add(botonTres);
		
		botonCuatro = new JToggleButton("");
		botonCuatro.setBounds(330, 0, 100, 100);
		contentPane.add(botonCuatro);
		
		botonCinco = new JToggleButton("");
		botonCinco.setBounds(0, 111, 100, 100);
		contentPane.add(botonCinco);
		
		botonSeis = new JToggleButton("");
		botonSeis.setBounds(110, 111, 100, 100);
		contentPane.add(botonSeis);
		
		botonSiete = new JToggleButton("");
		botonSiete.setBounds(220, 111, 100, 100);
		contentPane.add(botonSiete);
		
		botonOcho = new JToggleButton("");
		botonOcho.setBounds(330, 111, 100, 100);
		contentPane.add(botonOcho);
		
		botonNueve = new JToggleButton("");
		botonNueve.setBounds(0, 222, 100, 100);
		contentPane.add(botonNueve);
		
		botonDiez = new JToggleButton("");
		botonDiez.setBounds(110, 222, 100, 100);
		contentPane.add(botonDiez);
		
		botonOnce = new JToggleButton("");
		botonOnce.setBounds(220, 222, 100, 100);
		contentPane.add(botonOnce);
		
		botonDoce = new JToggleButton("");
		botonDoce.setBounds(330, 222, 100, 100);
		contentPane.add(botonDoce);
		
		botonTrece = new JToggleButton("");
		botonTrece.setBounds(0, 333, 100, 100);
		contentPane.add(botonTrece);
		
		botonCatorce = new JToggleButton("");
		botonCatorce.setBounds(110, 333, 100, 100);
		contentPane.add(botonCatorce);
		
		botonQuince = new JToggleButton("");
		botonQuince.setBounds(220, 333, 100, 100);
		contentPane.add(botonQuince);
		
		botonDiceiseis = new JToggleButton("");
		botonDiceiseis.setBounds(330, 333, 100, 100);
		contentPane.add(botonDiceiseis);
		
		// Matriz con los botones que forman el tablero
		JToggleButton[][] tableroBotonesAux = {{botonUno,botonDos,botonTres,botonCuatro},
											{botonCinco,botonSeis,botonSiete,botonOcho},
											{botonNueve,botonDiez,botonOnce,botonDoce},
											{botonTrece,botonCatorce,botonQuince,botonDiceiseis}};
		
		for (int fil = 0; fil < tableroBotonesAux.length; fil++) {
			for (int col = 0; col < tableroBotonesAux[fil].length; col++) {
				tableroBotones[fil][col] = tableroBotonesAux[fil][col];
			}
		}
		
		// Asignamos los colores al tablero
		for (int fil = 0; fil < tableroBotones.length; fil++) {
			for (int col = 0; col < tableroBotones[fil].length; col++) {
				tableroBotones[fil][col].setBackground(colores[fil][col]);
				tableroBotones[fil][col].setSelected(true);
				tableroBotones[fil][col].addActionListener(this);
			}
		}
	}

	@Override
	/**
	 *  Método para accionar la funcionalidad cada vez que presionamos un elemento del juego Memory
	 */
	public void actionPerformed(ActionEvent e) {
		int contadorAux = 0, filUno = 0, colUno = 0, filDos = 0, colDos = 0;
		contador++;
		System.out.println(contador);
		if(contador == 2) { // Si hay 2 cuadros pulsados
			for (int fil = 0; fil < tableroBotones.length; fil++) {
				for (int col = 0; col < tableroBotones[fil].length; col++) {
					tableroBotones[fil][col].setEnabled(false);
					if(!tableroBotones[fil][col].isSelected()) {
						if(contadorAux == 0) {
							colorUno = tableroBotones[fil][col].getBackground();
							filUno = fil;
							colUno = col;
							contadorAux++;
						} else if(contadorAux == 1){
							colorDos = tableroBotones[fil][col].getBackground();
							filDos = fil;
							colDos = col;
							contadorAux = 0;
						}
					}
				}
			}
			if(colorUno == colorDos) { //Si los 2 colores son visibles se vuelven invisibles y se inhabilitan
				tableroBotones[filUno][colUno].setVisible(false);
				tableroBotones[filUno][colUno].invalidate();
				tableroBotones[filDos][colDos].setVisible(false);
				tableroBotones[filDos][colDos].invalidate();
				for (int fil = 0; fil < tableroBotones.length; fil++) {
					for (int col = 0; col < tableroBotones[fil].length; col++) {
						tableroBotones[fil][col].setEnabled(true);
						tableroBotones[fil][col].setSelected(true);
					}
				}
			} else if(colorUno != colorDos) { //Si los 2 colores son diferentes se vuelven visibles de nuevo
				for (int fil = 0; fil < tableroBotones.length; fil++) {
					for (int col = 0; col < tableroBotones[fil].length; col++) {
						tableroBotones[fil][col].setEnabled(true);
						tableroBotones[fil][col].setSelected(true);
					}
				}
			}
			contador = 0;
		}
	}
}
