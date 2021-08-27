
package Contenedores;

import java.awt.Color;
import javax.swing.*;


public class ContTabbedPane extends JDialog{

    JTabbedPane pestanas;
    JPanel panelUno;
    JPanel panelDos;
    JPanel panelTres;
    JLabel lblTituloUno;
    JLabel lblTituloDos;
    JLabel lblTituloTres;
    
    
    public ContTabbedPane() {
        // Configuracion de la ventana
        setTitle("JTabbedPane");
        setSize(550,350);
        setLocationRelativeTo(null);
        
        pestanas = new JTabbedPane();
        
        // Panel Uno
        panelUno = new JPanel();
        lblTituloUno = new JLabel();
        lblTituloUno.setText("Contenedor JTabbedPane");
        lblTituloUno.setBounds(120,20,180,23);
        
        panelUno.add(lblTituloUno);
        
        // Panel Dos
        panelDos = new JPanel();
        panelDos.setBackground(Color.RED);
        panelDos.setBounds(50,50,200,150);
        
        lblTituloDos = new JLabel();
        lblTituloDos.setText("Panel Dos");
        lblTituloDos.setBounds(40,20,90,23);
        
        panelDos.add(lblTituloDos);
        
        // Panel Tres
        panelTres = new JPanel();
        panelTres.setBounds(280,50,200,150);
        panelTres.setBackground(Color.GREEN);
        
        lblTituloTres = new JLabel();
        lblTituloTres.setText("Panel Tres");
        lblTituloTres.setBounds(40,20,90,23);
        
        panelTres.add(lblTituloTres);
        
        pestanas.addTab("Pesaña Uno", panelUno);
        pestanas.addTab("Pesaña Dos", panelDos);
        pestanas.addTab("Pesaña Tres", panelTres);
        
        add(pestanas);
        
    }
    

}
