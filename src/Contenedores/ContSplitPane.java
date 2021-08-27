
package Contenedores;

import javax.swing.*;


public class ContSplitPane extends JDialog{

    JSplitPane splitPanel;
    JTextArea campoTexto;
    JLabel lblTitulo;
    
    public ContSplitPane() {
        // Configuracion ventana JDialog
        setTitle("JSplitPane");
        setSize(600,300);
        setLocationRelativeTo(null);
        
        splitPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        
        lblTitulo = new JLabel();
        lblTitulo.setText("Contendor JSplitPane");
        
        String texto = "Lorem \t\tIpsum             is simply \bdummy \n"
                + "text of the printing and typesetting \n"
                + "industry. Lorem \"Ipsum\" has been the \n"
                + "industry's standard dummy text ever \n"
                + "since the 1500s, when an unknown \n"
                + "printer took a galley of type and \n"
                + "scrambled it to make a type specimen book.";
        
        campoTexto = new JTextArea();
        campoTexto.setText(texto);
        
        splitPanel.add(lblTitulo);
        splitPanel.add(campoTexto);
        
        add(splitPanel);
        
    }

    
}
