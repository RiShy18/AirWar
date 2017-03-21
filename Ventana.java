import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
	
															
	public Ventana(){										/*Clase para hacer ventana*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     /*Es para cerrar la ventana*/ 
		add (new drawing());
		setTitle("Moviendo imagen");                        /*Nombre de la ventana*/
		setSize(1500,1000);									/*Tamaño de la Ventana*/
		setVisible(true);									/*Permite ver la ventana*/
		setLocationRelativeTo(null); 						/*Abre la ventana en el centro de la pantalla*/
		setResizable(false);								/*No deja cambiar el tamaño de la ventana*/
		
	}
	
	public static void main(String[] args){					/*Constructor */
		new Ventana();
	}
	}
