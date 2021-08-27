
package graficosui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ComponentesPequeños extends JFrame implements ActionListener{

    public Container contenedor;
    // Etiqueta
    JLabel labelTitulo;
    JLabel etiqueta;
    // Botones
    JButton botonUno;
    JButton botonDos;
    JCheckBox checkBox;
    ButtonGroup grupoBotones;
    JRadioButton radioUno;
    JRadioButton radioDos;
    ActionListener aListener =  ae -> System.out.println(ae.getSource());
    
    
    public ComponentesPequeños() {
        // Configuracion ventana
        setTitle("Componentes pequeños");
        setLocationRelativeTo(null);
        setSize(700,450);
        setResizable(false);
        
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        // Inicializar la etiqueta o JLabel
        labelTitulo = new JLabel();
        labelTitulo.setText("Pequeños componentes");
        // Fuente
        labelTitulo.setFont(new java.awt.Font("Verdana", Font.ITALIC, 20));
        // posicion x, posicion en y, Ancho, Alto
        labelTitulo.setBounds(280, 10, 380, 40);
                
        
        etiqueta = new JLabel();
        etiqueta.setText("soy una etiqueta");
        etiqueta.setBounds(20, 50, 280, 23);
        
        botonUno = new JButton();
        botonUno.setText("Boton Uno");
        botonUno.setName("btn-uno");
        botonUno.setBounds(80,80,120,23);
        botonUno.addActionListener(this);
        
        botonDos = new JButton();
        botonDos.setText("Boton Dos");
        botonDos.setName("btn-dos");
        botonDos.setBounds(80,110,120,23);
        // ActionPermormed
        botonDos.addActionListener(this);
        // Funcion Lambda
        // botonDos.addActionListener((ActionEvent ae)->System.out.println(ae.getSource()));
        /*
        botonDos.addActionListener((ActionEvent ae)->{
            JButton btn = (JButton) ae.getSource();
            System.out.println(btn.getText());
            System.out.println(btn.getName());
        });
        */
        
        checkBox = new JCheckBox();
        checkBox.setText("Check Uno");
        checkBox.setBounds(80,140,80,23);
        checkBox.addActionListener((ActionEvent ae)->{
            JCheckBox ck = (JCheckBox) ae.getSource();
            System.out.println(ck.getText());
        });
        
        grupoBotones = new ButtonGroup();
        radioUno = new JRadioButton();
        radioUno.setText("Radio1");
        radioUno.setBounds(80,170,80,23);
        radioUno.addActionListener(aListener);
        
        radioDos = new JRadioButton();
        radioDos.setText("Radio2");
        radioDos.setBounds(180,170,80,23);
        grupoBotones.add(radioUno);
        grupoBotones.add(radioDos);
        
        
        contenedor.add(labelTitulo);
        contenedor.add(etiqueta);
        contenedor.add(botonUno);
        contenedor.add(botonDos);
        contenedor.add(checkBox);
        contenedor.add(radioUno);
        contenedor.add(radioDos);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //System.out.println(ae.getSource());
        // error
        //Object btn =  ae.getSource();
        //btn.
        
        JButton btn = (JButton) ae.getSource();
        String id = btn.getName();
        if(id.equals("btn-dos")){
            System.out.println("Click boton dos");
            System.out.println("Texto del boton: "+ btn.getText());
            System.out.println("El ID es: "+ btn.getName());
        }else{
            System.out.println("Click en el boton uno");
        }
        //System.out.println(btn.getText());
        //System.out.println(btn.getName());
    }
    

}
