package main;

import javax.swing.JFrame;

public class MainClass {
public static void main(String[] args) {
	JFrame jframe;
		novo_PAINEL painel;
painel = new novo_PAINEL();

	jframe = new JFrame();
		
jframe.setSize(400, 400);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jframe.add(painel);
jframe.setLocationRelativeTo(null);
jframe.setVisible(true);
	painel.setFocusable(true);
	
	painel.requestFocus();
}


}
