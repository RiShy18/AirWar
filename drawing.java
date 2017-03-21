import java.awt.Color;													/*Permite usar comandos de colores*/
import java.awt.Graphics;											
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;										/*Permite ver acciones con teclado*/
import java.awt.event.ActionListener;
										/*Adaptando el teclado para apretar o dejar de apretar*/
import javax.swing.JPanel;												/*Contenedores*/
import javax.swing.Timer;												/*Tiempo de ejecucion de alguna funcion*/

@SuppressWarnings("serial")

public class drawing extends JPanel implements ActionListener {			/*empezamos la clase donde se dibujan las cosas*/
	private Nave nave;													/*declaramos la variable para que se pueda usar a lo largo de la clase*/
	private Timer timer;        										/*Velocidad de la nave*/
	/*private static final long serialVersionUID = 1L; posible uso*/
	
	public drawing(){													/*se empieza a crear el contenedor*/
		
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(new Teclado());									/*A cual clase tiene que responder*/
		
		nave=new Nave();												/*Dibujo proviene de la clase Nave*/
		timer=new Timer(5,this);										/*Damos la velocidad e iniciamos su timer 5ms*/
		timer.start();
	}
	
	public void paint(Graphics dibujable){								/*Funcíon para dibujar*/
		super.paint(dibujable);
		
		Graphics2D g2=(Graphics2D) dibujable;
		g2.drawImage(nave.obtener_imagen(),nave.obtener_x(),nave.obtener_y(),null);
	}
	
	public void actionPerformed(ActionEvent teclas){    				/*Metodo necesario para que funcione*/
		nave.mover();
		repaint();
	}
}

