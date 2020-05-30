
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class Venta extends javax.swing.JFrame {
    
    static String url ="jdbc:mysql://localhost:3306/proyectobase";
    static String user = "root" , pass="desarrollador", producto="",ticket="";
    static int precio , cantidad , total = 0;
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
  private void llenarCombo() {                                            
        Connection con = null;
        try{
            con = getConection();
            ps=con.prepareStatement("select producto from almacen");
            rs = ps.executeQuery();
            
            while(rs.next()){
                producto = rs.getString("producto");
                cmbproductos.addItem(producto);
            }
           
                con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }       
    public Venta() {
        initComponents();
        setLayout(null);
        setLocationRelativeTo(null);
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbproductos = new javax.swing.JComboBox();
        txtcantidad = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad:");

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cmbproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnaceptar)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnaceptar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        Connection con = null;
        
        try{
           con = getConection();
           ps = con.prepareStatement("call llenar_venta(?,?,?,?)");
           ps.setInt(1,1);
           ps.setString(2,cmbproductos.getSelectedItem().toString());
           ps.setInt(3,Integer.parseInt(txtcantidad.getText()));
           ps.setInt(4,1);
            int resp = ps.executeUpdate();
           
           if(resp > 0){
               JOptionPane.showMessageDialog(null,"venta realizada");
           }else{
               JOptionPane.showMessageDialog(null,"Fallo de venta");
           }
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JComboBox cmbproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
