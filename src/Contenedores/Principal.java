
package Contenedores;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame{

    JPanel panel;
    JButton btnPanel;
    JButton btnScroll;
    JButton btnSplitPanel;
    JButton btnJTabbedPane;
    
    public Principal() {
        //Titulo
        setTitle("Jframe Principal");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        btnPanel = new JButton();
        btnPanel.setText("Ejemplo JPanel");
        btnPanel.addActionListener( e -> {
            ContJPanel jpanel = new ContJPanel();
            jpanel.setVisible(true);
        });
        
        btnScroll = new JButton();
        btnScroll.setText("Ejemplo JScrollPane");
        btnScroll.addActionListener( e -> {
            ContScrollPane jscroll = new ContScrollPane();
            jscroll.setVisible(true);
        });
        
        btnSplitPanel = new JButton();
        btnSplitPanel.setText("Ejemplo JSplitPanel");
        btnSplitPanel.addActionListener( e -> {
            ContSplitPane jSplitPane = new ContSplitPane();
            jSplitPane.setVisible(true);
        });
        
        btnJTabbedPane = new JButton();
        btnJTabbedPane.setText("Ejemplo JTabbedPane");
        btnJTabbedPane.addActionListener( e -> {
            ContTabbedPane tabbedPane = new ContTabbedPane();
            tabbedPane.setVisible(true);
        });
        
        
        // Layouts
        // FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        // panel.setLayout(flowLayout);
        
        /*
        BorderLayout borderLayout = new BorderLayout();
        panel.setLayout(borderLayout);
        
        panel.add(btnPanel, BorderLayout.SOUTH);
        panel.add(btnScroll , BorderLayout.NORTH);
        panel.add(btnSplitPanel, BorderLayout.EAST);
        panel.add(btnJTabbedPane, BorderLayout.WEST);
        */
        
        GridLayout gridLayout = new GridLayout(1, 2);
        panel.setLayout(gridLayout);
        
        panel.add(btnPanel);
        panel.add(btnScroll);
        panel.add(btnSplitPanel);
        panel.add(btnJTabbedPane);
        
        
        add(panel);
    }
    
    

}
