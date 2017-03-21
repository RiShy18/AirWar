import java.awt.Image;						/*Nos permite hacer uso de imagenes*/
import java.awt.event.KeyEvent;				/*Nos permite detectar el tocar teclas*/
import javax.swing.ImageIcon;				/*Nos permite extraer las imagenes*/


public class Nave {							/*Clase nave*/
	private String nave="Usuario.png"; 		/*variable=Imagen de la nave*/
	
											/*Variables de localización*/
	private int dx;							
	private int dy;
	
	private int x;
	private int y;
	
	private Image imagen;					/*Clase que contiene la nave*/
	
	public Nave(){
		x=40;   							/*Iniciamos las variables de la posición de la nave*/
		y=60;
		ImageIcon img=new ImageIcon(this.getClass().getResource(nave)); 	/*Nos permite llamar a la imagen*/
		imagen=img.getImage();  			/*Obtenemos la imagen*/
	}
	
	public void mover(){
		x+=dx;								/*Cambio de posición se le suma o se resta a la inicial dependiendo de la tecla*/
		y+=dy;
	}
											/*Metodos que nos permiten obtener las variables para dibujar*/
	public int obtener_x(){
		return x;
	}
	public int obtener_y(){
		return y;
	}
	public Image obtener_imagen(){
		return imagen;
	}
	
	public void KeyPressed(KeyEvent teclas){     /*Eventos que responden al teclado*/
		int key=teclas.getKeyCode();		/*Nos permite traer los valores del teclado*/
		
		if(key==KeyEvent.VK_RIGHT){			/*Si toca la flecha derecha*/
			dx=1;
		}
		if(key==KeyEvent.VK_UP){				/*Si toca la flecha arriba*/
			dy=1;
		}
		if(key==KeyEvent.VK_LEFT){			/*Si toca la flecha izquierda*/
			dx=-1;
		}
		if(key==KeyEvent.VK_DOWN){			/*Si toca la flecha abajo*/
			dy=-1;
		}
		}
		
	public void KeyReleased(KeyEvent teclas){     /*Al dejar de apretar la tecla del teclado*/
		int key=teclas.getKeyCode();		/*Nos permite traer los valores del teclado*/
			
		if(key==KeyEvent.VK_RIGHT){			/*Si deja de tocar la flecha derecha */
			dx=0;
		}
		if(key==KeyEvent.VK_UP){				/*Si deja de tocar la flecha arriba*/
			dy=0;			
		}
		if(key==KeyEvent.VK_LEFT){			/*Si deja de tocar la flecha izquierda*/
			dx=0;
		}
		if(key==KeyEvent.VK_DOWN){			/*Si deja de tocar la flecha abajo*/
			dy=0;
		}
	}
}

