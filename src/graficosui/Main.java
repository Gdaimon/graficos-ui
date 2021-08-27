package graficosui;

public class Main {


    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Hola desde un Dialog");
        
        
        // String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        // JOptionPane.showMessageDialog(null, "Hola tu nombre es: "+nombre);
        
        // JFrame
        PrimeraVentana primeraVentana = new PrimeraVentana();
        // primeraVentana.frame.setVisible(true);
        
        // Comportamiento al cerra la ventana
        // Cerrar ventana
        //primeraVentana.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //primeraVentana.frame.setDefaultCloseOperation(3);
        
        // Ocultar la ventana
        //primeraVentana.frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //primeraVentana.frame.setDefaultCloseOperation(1);
        
        // Redimensionar
        primeraVentana.frame.setResizable(false);
        
        // JDialog
        Dialogo dialogo = new Dialogo();
        // dialogo.setVisible(true);
        
        // Clase de componentes pequeños
        ComponentesPequeños componentesPequeños = new ComponentesPequeños();
        componentesPequeños.setDefaultCloseOperation(3);
        componentesPequeños.setVisible(true);
        
        
    }
    
}
