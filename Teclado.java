import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Teclado extends KeyAdapter {
		 public void KeyRealeased(KeyEvent teclas){
			 nave.KeyRealeased(teclas);
		}
		public void KeyPressed(KeyEvent teclas){
			nave.KeyPressed(teclas);
		}
	}
