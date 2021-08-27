
package Contenedores;

import javax.swing.*;


public class ContScrollPane extends JDialog{

    JPanel panel;
    JScrollPane scrollPanel;
    JTextArea campoTexto;
    public ContScrollPane() {
        // Configuracion ventana JDialog
        setTitle("JScrollPane");
        setSize(400,200);
        setLocationRelativeTo(null);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        scrollPanel = new JScrollPane();
        String texto = "Lorem \t\tIpsum             is simply \bdummy \n"
                + "text of the printing and typesetting \n"
                + "industry. Lorem \"Ipsum\" has been the \n"
                + "industry's standard dummy text ever \n"
                + "since the 1500s, when an unknown \n"
                + "printer took a galley of type and \n"
                + "scrambled it to make a type specimen book.";
        
        campoTexto = new JTextArea();
        campoTexto.setText(texto);
        campoTexto.setBounds(20, 50, 350, 100);
        
        panel.add(campoTexto);
        panel.setPreferredSize(new java.awt.Dimension(400,220));
        add(panel);
        
        // Configuracion Scroll
        scrollPanel.setAutoscrolls(true);
        scrollPanel.setViewportView(panel);
        add(scrollPanel);
        
    }

    
    
}
