package tecla;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class telcado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			System.out.println("ddddddd");
			break;
		case KeyEvent.VK_A:
			System.out.println("A");
			break;
		case KeyEvent.VK_S:
			System.out.println("S");
			break;
		case KeyEvent.VK_D:
			System.out.println("D");
			break;
		}
	}
}
