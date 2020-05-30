
package ventanas;

import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    ResultSet rs;
    PreparedStatement ps;
    conexion cn = new conexion();
    String user,password;
    boolean acceso = false;
    

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        lblicon = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 102, 102));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N
        getContentPane().add(lblicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 260, 250));
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 460, 110, 30));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 180, 30));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wall.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        if(evt.getSource()== btnsalir){
            System.exit(0);
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
        user = txtuser.getText();
        password = txtpassword.getText();
        try{
            con = cn.getConection();
            
            ps = con.prepareStatement("select per_usuario,per_password from personal");
            rs = ps.executeQuery();
            while(rs.next()){
                if(user.equalsIgnoreCase(rs.getString("per_usuario")) && password.equalsIgnoreCase(rs.getString("per_password"))){
                    acceso = true;
                    break;
                }else{
                }
            }
            if(acceso){
                JOptionPane.showMessageDialog(null,"Usuario valido");
            }else{
                JOptionPane.showMessageDialog(null,"Usuario no registrado");
            }
            acceso = false;
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblicon;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
