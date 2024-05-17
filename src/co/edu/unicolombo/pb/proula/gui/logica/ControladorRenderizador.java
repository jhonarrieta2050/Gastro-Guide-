
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

public class ControladorRenderizador {
    
   
 
    public ArrayList<JPanel> renderizarRecetas(Usuario usuario, Controlador control,Recipes recipe){
        
        ArrayList<Recetas> array = usuario.getRecetas();
        ArrayList<JPanel> arrayPanel = new ArrayList<>();
        
        for (Recetas receta : array) {
            
             JPanel nuevoPanel = new JPanel();
            nuevoPanel.setLayout(new java.awt.BorderLayout());
            nuevoPanel.setPreferredSize(new Dimension(0,200));
            nuevoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            nuevoPanel.setBackground(Color.white);
            
            

        
        JPanel panelSuperior = new JPanel();
        JLabel titulo = new JLabel(receta.getTitulo());
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panelSuperior.setBackground(Color.white);
        
        panelSuperior.add(titulo);
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;
        if(numeroAleatorio == 1){
            panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/icons8-cook-85.png"))));
        }else if(numeroAleatorio == 2){
            panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/icons8-cookbook-64.png"))));
        }else if(numeroAleatorio == 3){
            panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/icons8-cook-48.png"))));
        }else if(numeroAleatorio == 4){
           panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/yogurt.png"))));
        }else{
           panelSuperior.add(new JLabel(new ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/carne.png"))));
        }
        
        
        JPanel panelCentral = new JPanel();
        JButton boton = new JButton();
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

        nuevoPanel.add(panelSuperior, java.awt.BorderLayout.NORTH);
        nuevoPanel.add(panelCentral, java.awt.BorderLayout.CENTER);
        
        arrayPanel.add(nuevoPanel);
            
        }
        
        
        
        return arrayPanel;
    }
    
}
