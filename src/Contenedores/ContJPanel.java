package Contenedores;

import java.awt.Color;
import javax.swing.*;

public class ContJPanel extends JDialog{

    JLabel lblTitulo;
    JLabel lblPanel;
    JPanel panelPrincipal;
    JPanel panel;
    
    public ContJPanel() {
        // Configuracion de la ventana
        setTitle("JPanel");
        setSize(550,350);
        setLocationRelativeTo(null);
        
        
        // Panel lienzo
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        
        lblTitulo = new JLabel();
        lblTitulo.setText("Contenedor de JPanel");
        lblTitulo.setBounds(200, 20, 180, 23);
        
        // Crear mi segundo panel
        panel = new JPanel();
        panel.setBounds(50, 50, 180, 180);
        panel.setBackground(Color.yellow);
        
        lblPanel = new JLabel();
        lblPanel.setText("Titulo JPanel");
        lblPanel.setBounds(40, 20, 80, 23);
        
         panel.add(lblPanel);
         
         panelPrincipal.add(lblTitulo);
         panelPrincipal.add(panel);
         add(panelPrincipal);
        
        
    }

    
}
