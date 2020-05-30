
package ventanas;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

public class AltaBaja extends javax.swing.JFrame {
    
static String url = "jdbc:mysql://localhost:3306/ProyectoBase";
static String user = "root" , pass = "desarrollador";
PreparedStatement ps;
ResultSet rs;

public static Connection getConection(){
    Connection con = null;
    
    try{
        con = DriverManager.getConnection(url,user,pass);
        //JOptionPane.showMessageDialog(null, "Conexion Exitosa");

}
    catch(Exception e){
        System.err.println(e);
}
    return con;
}
    public AltaBaja(){
        initComponents();
        setLocationRelativeTo(null);
        txtid.setVisible(false);
        txtid.setEditable(false);
    }
    public void Limpiar(){
        txtnombre.setText("");
        txtclave.setText("");
        txtpaterno.setText("");
        txtmaterno.setText("");
        txtusuario.setText("");
        txtpassword.setText("");
        cbxpuesto.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtpaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmaterno = new javax.swing.JTextField();
        cbxpuesto = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Clave:");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Paterno:");

        jLabel4.setText("Materno:");

        cbxpuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Gerente" }));

        jLabel5.setText("Usuario:");

        jLabel6.setText("Password:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(cbxpuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificar)
                        .addGap(14, 14, 14)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnlimpiar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       Connection con = null;
        try{
            con = getConection();
            ps=con.prepareStatement("update personal set PER_CLAVE = ? , PER_NOMBRE = ?,PER_PATERNO = ?,PER_MATERNO = ?,PER_USUARIO = ?,PER_PASSWORD = ?,PER_CARGO = ? where idpersonal = ? ");
            ps.setString(1,txtclave.getText());
            ps.setString(2,txtnombre.getText());
            ps.setString(3,txtpaterno.getText());
            ps.setString(4,txtmaterno.getText());
            ps.setString(5,txtusuario.getText());
            ps.setString(6,txtpassword.getText());
            ps.setString(7,cbxpuesto.getSelectedItem().toString());
            ps.setString(8,txtid.getText());
            
           int resp =  ps.executeUpdate();
           
           if(resp > 0){
               JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
           }else{
               JOptionPane.showMessageDialog(null, "Error al modificar");
           }
                con.close();
                Limpiar();
        }catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Connection con = null;
        try{
            String clave,nombre,paterno,materno,usuario,password;
            clave = txtclave.getText();
            nombre = txtnombre.getText();
            paterno = txtpaterno.getText();
            materno = txtmaterno.getText();
            usuario = txtusuario.getText();
            password = txtpassword.getText();
            if(clave.equals("") || nombre.equals("") || paterno.equals("") || materno.equals("") || usuario.equals("") || password.equals("")){
                JOptionPane.showMessageDialog(null,"Llena todos los campos pendejo");
            }else{
            con = getConection();
            ps=con.prepareCall("call per_insert(?,?,?,?,?,?,?) ");
            ps.setInt(1,Integer.parseInt(txtclave.getText()));
            ps.setString(2,txtnombre.getText());
            ps.setString(3,txtpaterno.getText());
            ps.setString(4,txtmaterno.getText());
            ps.setString(5,txtusuario.getText());
            ps.setString(6,txtpassword.getText());
            ps.setString(7,cbxpuesto.getSelectedItem().toString());
            
           int resp =  ps.executeUpdate();
           
           if(resp > 0){
               JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente");
           }else{
               JOptionPane.showMessageDialog(null, "Error al guardar");
           }
                con.close();
                Limpiar();
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
                Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("select * from personal where per_clave = ? ");
            ps.setString(1,txtclave.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtid.setText(rs.getString("idpersonal"));
                txtclave.setText(rs.getString("per_clave"));
                txtnombre.setText(rs.getString("per_nombre"));
                txtpaterno.setText(rs.getString("per_paterno"));
                txtmaterno.setText(rs.getString("per_materno"));
                txtusuario.setText(rs.getString("per_usuario"));
                txtpassword.setText(rs.getString("per_password"));
                cbxpuesto.setSelectedItem(rs.getString("per_cargo"));
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe persona con esa clave");
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Connection con = null;
        try{
            con = getConection();
            ps=con.prepareStatement("delete from personal where idpersonal = ?");
            ps.setString(1,txtid.getText());
            
           int resp =  ps.executeUpdate();
           
           if(resp > 0){
               JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
           }else{
               JOptionPane.showMessageDialog(null, "Error al eliminar");
           }
                con.close();
                Limpiar();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new AltaBaja().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox cbxpuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtpaterno;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
