
package co.edu.unicolombo.pb.proula.gui.logica;

import co.edu.unicolombo.pb.proula.gui.EditarReceta;
import co.edu.unicolombo.pb.proula.gui.Recipes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ControladorRenderizador {
    
   
 
    public ArrayList<JPanel> renderizarRecetas(Usuario usuario, Controlador control,Recipes recipe){
        
        ArrayList<Recetas> array = usuario.getRecetas();
        ArrayList<JPanel> arrayPanel = new ArrayList<>();
        
        for (Recetas receta : array) {
            
             JPanel nuevoPanel = new JPanel();
            nuevoPanel.setLayout(new java.awt.BorderLayout());
            nuevoPanel.setPreferredSize(new Dimension(0,170));
            nuevoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            nuevoPanel.setBackground(Color.black);
            
            

        
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new java.awt.BorderLayout());
        JLabel titulo = new JLabel(receta.getTitulo());
       
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        EmptyBorder border = new EmptyBorder(0, 35, 0, 0);
        titulo.setBorder(border);
        titulo.setForeground(Color.black);
        panelSuperior.setBackground(Color.white);
        
        panelSuperior.add(titulo,java.awt.BorderLayout.CENTER);
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;
            switch (numeroAleatorio) {
                case 1 -> panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/icons8-cook-85.png"))),java.awt.BorderLayout.NORTH);
                case 2 -> panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/icons8-cookbook-64.png"))),java.awt.BorderLayout.NORTH);
                case 3 -> panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/icons8-cook-48.png"))),java.awt.BorderLayout.NORTH);
                case 4 -> panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/yogurt.png"))),java.awt.BorderLayout.NORTH);
                default -> panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/carne.png"))),java.awt.BorderLayout.NORTH);
            }
        
        
        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.black);
        JButton boton = new JButton();
        boton.setPreferredSize(new Dimension(100, 50));
        boton.setText("Ver receta");
        boton.setForeground(Color.black);
        boton.setBackground(Color.blue);
        boton.setBorder(BorderFactory.createLineBorder(Color.white,2));
        boton.addActionListener(new ActionListener(){
            
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    EditarReceta editar = new EditarReceta();
                    editar.setControl(control);
                    editar.setUsuario(usuario);
                    editar.setIdReceta(receta.getId());
                    editar.colocarDatos();
                    editar.setVisible(true);
                    editar.setLocationRelativeTo( null);
                    editar.setRecipe(recipe);
                    
                 }
        });
        
        panelCentral.add(boton);
        
        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.white);
        
        nuevoPanel.add(panelSuperior, java.awt.BorderLayout.NORTH);
        nuevoPanel.add(panelCentral, java.awt.BorderLayout.CENTER);
        nuevoPanel.add(panelInferior,java.awt.BorderLayout.SOUTH);
        
        arrayPanel.add(nuevoPanel);
            
        }
        
        
        
        return arrayPanel;
    }
    
}
