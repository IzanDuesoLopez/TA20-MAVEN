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

public class Ejercicio9 extends JFrame {

	private JPanel contentPane;
	private int contador = 0;
	private Color colorUno, colorDos;

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton botonUno = new JToggleButton("");
		botonUno.setSelected(true);
		botonUno.setForeground(Color.RED);
		botonUno.setBounds(0, 0, 100, 100);
		contentPane.add(botonUno);
		
		JToggleButton botonDos = new JToggleButton("");
		botonDos.setForeground(Color.ORANGE);
		botonDos.setBounds(110, 0, 100, 100);
		contentPane.add(botonDos);
		
		JToggleButton botonTres = new JToggleButton("");
		botonTres.setBounds(220, 0, 100, 100);
		contentPane.add(botonTres);
		
		JToggleButton botonCuatro = new JToggleButton("");
		botonCuatro.setBounds(330, 0, 100, 100);
		contentPane.add(botonCuatro);
		
		JToggleButton botonCinco = new JToggleButton("");
		botonCinco.setBounds(0, 111, 100, 100);
		contentPane.add(botonCinco);
		
		JToggleButton botonSeis = new JToggleButton("");
		botonSeis.setBounds(110, 111, 100, 100);
		contentPane.add(botonSeis);
		
		JToggleButton botonSiete = new JToggleButton("");
		botonSiete.setBounds(220, 111, 100, 100);
		contentPane.add(botonSiete);
		
		JToggleButton botonOcho = new JToggleButton("");
		botonOcho.setBounds(330, 111, 100, 100);
		contentPane.add(botonOcho);
		
		JToggleButton botonNueve = new JToggleButton("");
		botonNueve.setBounds(0, 222, 100, 100);
		contentPane.add(botonNueve);
		
		JToggleButton botonDiez = new JToggleButton("");
		botonDiez.setBounds(110, 222, 100, 100);
		contentPane.add(botonDiez);
		
		JToggleButton botonOnce = new JToggleButton("");
		botonOnce.setBounds(220, 222, 100, 100);
		contentPane.add(botonOnce);
		
		JToggleButton botonDoce = new JToggleButton("");
		botonDoce.setBounds(330, 222, 100, 100);
		contentPane.add(botonDoce);
		
		JToggleButton botonTrece = new JToggleButton("");
		botonTrece.setBounds(0, 333, 100, 100);
		contentPane.add(botonTrece);
		
		JToggleButton botonCatorce = new JToggleButton("");
		botonCatorce.setBounds(110, 333, 100, 100);
		contentPane.add(botonCatorce);
		
		JToggleButton botonQuince = new JToggleButton("");
		botonQuince.setBounds(220, 333, 100, 100);
		contentPane.add(botonQuince);
		
		JToggleButton botonDiceiseis = new JToggleButton("");
		botonDiceiseis.setBounds(330, 333, 100, 100);
		contentPane.add(botonDiceiseis);
		
		JToggleButton[][] tableroBotones = {{botonUno,botonDos,botonTres,botonCuatro},
											{botonCinco,botonSeis,botonSiete,botonOcho},
											{botonNueve,botonDiez,botonOnce,botonDoce},
											{botonTrece,botonCatorce,botonQuince,botonDiceiseis}};
		
		Color[][] colores = {{Color.RED, Color.RED, Color.GREEN, Color.GREEN},
							{Color.BLUE, Color.BLUE, Color.BLACK, Color.BLACK},
							{Color.PINK, Color.PINK, Color.ORANGE, Color.ORANGE},
							{Color.MAGENTA, Color.MAGENTA, Color.CYAN, Color.CYAN}};
					
		for (int fil = 0; fil < tableroBotones.length; fil++) {
			for (int col = 0; col < tableroBotones[fil].length; col++) {
				tableroBotones[fil][col].setBackground(colores[fil][col]);
				tableroBotones[fil][col].setSelected(true);
			}
			System.out.println();
		}
		
		for (int fil = 0; fil < tableroBotones.length; fil++) {
			for (int col = 0; col < tableroBotones[fil].length; col++) {
				if(!tableroBotones[fil][col].isSelected()) {
					colorUno = tableroBotones[fil][col].getBackground();
					contador++;
				}
			}
		}
		
		
	}
}