
package co.edu.unicolombo.pb.proula.gui.logica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class PruebaPaneles {
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Panel en Panel");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPadre = new JPanel();
        panelPadre.setLayout(new BorderLayout());
        panelPadre.setName("panelPadre");
        String nombrePanelPadre = panelPadre.getName();

        JPanel panelHijo = new JPanel();
        panelHijo.setLayout(new FlowLayout());
        panelHijo.setName("panelHijo");
        String nombrePanelHijo = panelHijo.getName();

        JLabel etiqueta = new JLabel("Etiqueta dentro del panel hijo");
        panelHijo.add(etiqueta);

        panelPadre.add(panelHijo, BorderLayout.CENTER);

        ventana.getContentPane().add(panelPadre);
        ventana.pack();
        ventana.setVisible(true);
    }
}
