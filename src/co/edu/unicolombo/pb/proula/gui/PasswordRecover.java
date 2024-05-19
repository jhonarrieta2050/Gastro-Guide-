
package co.edu.unicolombo.pb.proula.gui;

import co.edu.unicolombo.pb.proula.gui.logica.Controlador;
import javax.swing.JOptionPane;


public class PasswordRecover extends javax.swing.JFrame {

    private Controlador control;
    private Loggin loggin;
    private String usuarioRecover;
    
    public void setControl(Controlador control){
        
        this.control = control;
    }
    
    public void setLoggin(Loggin loggin){
        
       this.loggin  = loggin;
    }
    
    public PasswordRecover() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCancelarCambiarContraseñaLoggin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        contrasenaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contrasenaTextP = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(199, 252, 199));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(280, 188));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Recupere su cuenta!!!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
        jPanel2.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, -1));

        jLabel2.setText("Solo ingresando su nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(17, 132, 17));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 170, 100, 30));

        btnCancelarCambiarContraseñaLoggin.setBackground(new java.awt.Color(0, 249, 124));
        btnCancelarCambiarContraseñaLoggin.setText("Cancelar");
        btnCancelarCambiarContraseñaLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCambiarContraseñaLogginActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarCambiarContraseñaLoggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 220, -1, -1));

        tabbedPane.addTab("", jPanel2);

        jPanel3.setBackground(new java.awt.Color(199, 252, 199));

        jButton2.setBackground(new java.awt.Color(17, 132, 17));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Cambiar contrasena");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contrasenaText)
                            .addComponent(contrasenaTextP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton2)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(contrasenaText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contrasenaTextP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tabbedPane.addTab("", jPanel3);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -35, -1, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nombre = nombreField.getText();
        
        if(control.validarNombre(nombre)){
            JOptionPane.showMessageDialog(this, "No se a encontrado a el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        nombreField.setText("");
        
        this.usuarioRecover = nombre;
        
        tabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String contrasena = contrasenaText.getText();
        char[] charC = contrasenaTextP.getPassword();
        String contrasenaP = new String(charC);
        
        try{
            
            if(control.CompararContrasena(contrasena,contrasenaP,usuarioRecover)){
                
                JOptionPane.showMessageDialog(null, "Su contrasena a sido cambiada con exito");
                tabbedPane.setSelectedIndex(0);
                contrasenaText.setText("");
                contrasenaTextP.setText("");
                
                this.setVisible(false);
        
                loggin.setVisible(true);
                loggin.setLocationRelativeTo(null);
            }
            
        }catch(IllegalArgumentException e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCancelarCambiarContraseñaLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCambiarContraseñaLogginActionPerformed
        this.setVisible(false);
        loggin.setVisible(true);
        loggin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarCambiarContraseñaLogginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCambiarContraseñaLoggin;
    private javax.swing.JTextField contrasenaText;
    private javax.swing.JPasswordField contrasenaTextP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
