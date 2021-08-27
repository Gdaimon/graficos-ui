package graficosui;

import javax.swing.JFrame;

//public class PrimeraVentana extends JFrame{
public class PrimeraVentana{
    public JFrame frame;

    public PrimeraVentana(){
        
        // Forma No. 1
        /*
        // Definir un tamaño
        setSize(500, 500);
        // Titulo
        setTitle("Mi primer ventana");
        // Centrado
        setLocationRelativeTo(null);
        setVisible(true);
        */
        
        frame = new JFrame();
        // Asignar Tamaño
        //frame.setSize(500, 500);
        frame.setBounds(0, 0, 500, 500);
        frame.setTitle("Mi primer ventana");
        // Posicionar en el centro
        //frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
        
    }

    
    
}
