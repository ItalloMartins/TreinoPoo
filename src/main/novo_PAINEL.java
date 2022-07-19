package main;

import java.awt.Graphics;

import javax.swing.JPanel;

import tecla.telcado;

public class novo_PAINEL extends JPanel{
	
	public novo_PAINEL() {
		addKeyListener(new telcado());
	}
}
