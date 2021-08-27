
package Contenedores;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;


public class Main {
    public static void main(String[] args) {
        Principal ventana = new Principal();
        ventana.setVisible(true);
        
        // Datos de la pantalla
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        System.out.println("Alto pantalla: "+tamanoPantalla.height);
        System.out.println("Ancho pantalla: "+tamanoPantalla.width);
        
        // Tarea centrar la ventana ancho y alto de la pantalla
        
        
        // Full screen
        ventana.setExtendedState(Frame.MAXIMIZED_BOTH);
        //ventana.setExtendedState(3);
        
                
    }
}
