
package co.edu.unicolombo.pb.proula.gui;
import javax.swing.JOptionPane;
import co.edu.unicolombo.pb.proula.gui.logica.Controlador;
import co.edu.unicolombo.pb.proula.gui.logica.errores;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Random;
     
public class Register extends javax.swing.JFrame {
    
 
    Controlador control = new Controlador();
    
    public Register() {
        initComponents();
    }
        private Loggin loggin;
        
        
        public void setLoggin(Loggin loggin){
            
            this.loggin = loggin;
            
        }
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImagenContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        apellidoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        loginBtm = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        ImagenContainer.setBackground(new java.awt.Color(255, 255, 255));
        ImagenContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ImagenContainer.setPreferredSize(new java.awt.Dimension(1200, 888));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/proula/gui/images/Helado.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel2.setText("Registrese en Gastro Guide");

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameText.setText(null);
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        apellidoText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel3.setText("Genero");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel4.setText("Apellido");

        emailText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailText.setText(null);
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel6.setText("Contraseña");

        passwordText.setText(null);

        jToggleButton1.setBackground(new java.awt.Color(153, 0, 255));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Registrarse");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        loginBtm.setBackground(new java.awt.Color(51, 102, 0));
        loginBtm.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        loginBtm.setForeground(new java.awt.Color(255, 255, 255));
        loginBtm.setText("Iniciar sesion");
        loginBtm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        loginBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtmActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("O");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel8.setText("Nombre");

        ageText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageText.setText(null);
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel9.setText("Fecha de nacimiento (DD/MM/YYYY)");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        javax.swing.GroupLayout ImagenContainerLayout = new javax.swing.GroupLayout(ImagenContainer);
        ImagenContainer.setLayout(ImagenContainerLayout);
        ImagenContainerLayout.setHorizontalGroup(
            ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ImagenContainerLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ImagenContainerLayout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ImagenContainerLayout.createSequentialGroup()
                                .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailText, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ageText)
                                    .addComponent(passwordText)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)))
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ImagenContainerLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel7))
                    .addGroup(ImagenContainerLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ImagenContainerLayout.setVerticalGroup(
            ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenContainerLayout.createSequentialGroup()
                .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ImagenContainerLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(apellidoText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageText, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jComboBox1))
                        .addGap(15, 15, 15)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ImagenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ImagenContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void apellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTextActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
          
        int id = new Random().nextInt();
        String nombre = nameText.getText();
        String email = emailText.getText();
        char[] contrasena = passwordText.getPassword();
        String contrasenaa = new String(contrasena);
        String genero = (String)jComboBox1.getSelectedItem();
        String apellido = apellidoText.getText();
        String fechaa = ageText.getText();
         
        errores errorFecha = control.validarFecha(fechaa);
        errores Errores = control.validacionDatos(nombre,email,contrasenaa,genero,apellido);
  
        if(Errores.getPass()){
            String[] errores = Errores.getErrorName();
            
            for (String errore : errores) {
                JOptionPane.showMessageDialog(this, errore, "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            return; 
        }
        
        if(errorFecha.getPass()){
            String[] error = errorFecha.getErrorName();
            JOptionPane.showMessageDialog(this, error[0], "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
           Date nacimiento = errorFecha.getFecha();
        
       if(control.estanVacio(nombre,email,contrasenaa,genero,apellido)){
           JOptionPane.showMessageDialog(null, "Faltan algunos campos por llenar");
           return;
       }
        
        control.guardar(id,nombre,apellido,genero,nacimiento,email,contrasenaa);
        
        JOptionPane.showMessageDialog(null, "Tu cuenta ha sido creada exitosamente!");
        
        loggin.setVisible(true);
        this.setVisible(false);
        loggin.setControl(control);
       
       
        nameText.setText("");
        emailText.setText("");
        passwordText.setText("");
        apellidoText.setText("");
        ageText.setText("");
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void loginBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtmActionPerformed
            
        loggin.setVisible(true);
        loggin.setLocationRelativeTo(null);
        this.setVisible(false);
        nameText.setText("");
        emailText.setText("");
        passwordText.setText("");
        apellidoText.setText("");
        ageText.setText("");
    }//GEN-LAST:event_loginBtmActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ImagenContainer;
    private javax.swing.JTextField ageText;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton loginBtm;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passwordText;
    // End of variables declaration//GEN-END:variables
}
