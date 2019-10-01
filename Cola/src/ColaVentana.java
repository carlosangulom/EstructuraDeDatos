
import static javax.swing.JOptionPane.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ColaVentana extends javax.swing.JFrame {

    /**
     * Creates new form ColaVentana
     */
    public ColaVentana() {
        initComponents();
        txtDat.requestFocus();
        m = (DefaultTableModel) tblT.getModel();
        col = new ColaCircular(m.getColumnCount());
        tblT.setValueAt("Inicio", 0, 0);
        lblInicio.setText("0");
        lblFin.setText("0");
        tblT.setValueAt("Fin", 2, 0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblT = new javax.swing.JTable();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDat = new javax.swing.JTextField();
        btnEmpt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTam = new javax.swing.JTextField();
        btnCamb = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFin = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Inicio", null, null, null, null},
                {null, null, null, null, null},
                {"Fin", null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E"
            }
        ));
        jScrollPane1.setViewportView(tblT);

        btnPush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMAGENES COLA/login.png"))); // NOI18N
        btnPush.setText("PUSH");
        btnPush.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPushMouseClicked(evt);
            }
        });

        btnPop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMAGENES COLA/basura.png"))); // NOI18N
        btnPop.setText("POP");
        btnPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPopMouseClicked(evt);
            }
        });

        jLabel1.setText("Tamaño:");

        jLabel2.setText("Ingresa un dato: ");

        btnEmpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMAGENES COLA/empty-cart.png"))); // NOI18N
        btnEmpt.setText("VACIAR");
        btnEmpt.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Instituto Tecnologico de Tepic ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estructura de Datos- COLAS ");

        txtTam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTamKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamKeyTyped(evt);
            }
        });

        btnCamb.setText("Cambiar");
        btnCamb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambMouseClicked(evt);
            }
        });

        jLabel5.setText("Inicio:");

        jLabel6.setText("Fin:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEmpt)
                    .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDat, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtTam)))
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCamb)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblFin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(57, 57, 57)))
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCamb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addComponent(btnPush))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblInicio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPop)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblFin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmpt)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtTamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtTamKeyTyped

    private void txtTamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTamKeyReleased
    
    private void validaTam(JTextField txt)throws ColaException{
        if(txtTam.getText().length()==0)throw new ColaException("Campo vacío");
        String c = txt.getText();
        for (int i = 0; i < c.length(); i++) {
            if(c.charAt(i)<48 || c.charAt(i)>57) throw new ColaException("Solo números");
        } 
    }
    
    private void validaDato(JTextField txt)throws ColaException{
        if(txt.getText().length()==0) throw new ColaException("Campo vacío");
    }
    
    private boolean validado(JTextField t){
        try{
          validaTam(t);  
        }catch(ColaException err){
            showMessageDialog(this, err.getMessage());
            txtTam.setText("");
            return false;
        }
        
        return true;
    }
    private boolean dValidado(JTextField t){
        try{
          validaDato(t);  
        }catch(ColaException err){
            showMessageDialog(this, err.getMessage());
            return false;
        }
        
        return true;
    }
    
    private void btnCambMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambMouseClicked
        // TODO add your handling code here:
        col = new ColaCircular(Integer.parseInt(txtTam.getText()));
        if(!validado(txtTam))return;
        int t = Integer.parseInt(txtTam.getText());
        try{
            m.setColumnCount(t);
        }catch(ColaException err){
            showMessageDialog(this, err.getMessage());
        }
        
    }//GEN-LAST:event_btnCambMouseClicked

    private void btnPushMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPushMouseClicked
        btnCamb.setEnabled(false);
        if(!dValidado(txtDat))return;
        if(col.getFin()==-1 && !col.llena())tblT.setValueAt("", 2, 0);
        else if(!col.llena())tblT.setValueAt("", 2, col.getFin());
        
        if(col.getFin()==(m.getColumnCount()-1)){
            try{
                col.push(txtDat.getText());
                tblT.setValueAt("Fin", 2, 0);
                tblT.setValueAt(txtDat.getText(), 1, 0);
                lblFin.setText(""+col.getFin());
                tblT.repaint();
                txtDat.setText("");
                txtDat.requestFocus();
            }catch(ColaException ex){
                showMessageDialog(this, ex.getMessage());
            }
        }
        
        else{
            try{
                col.push(txtDat.getText());
                //if(col.getFin()==m.getColumnCount()) tblT.setValueAt(txtDat.getText(), 1, 0);
                tblT.setValueAt(txtDat.getText(), 1, col.getFin());
                //if(col.getFin()==m.getColumnCount()) tblT.setValueAt("Fin", 2, 0);
                tblT.setValueAt("Fin", 2, col.getFin());
                lblFin.setText(""+col.getFin());
                tblT.repaint();
                txtDat.setText("");
                txtDat.requestFocus();
            }catch(ColaException err){
                showMessageDialog(this, err.getMessage());
            }
        }
    }//GEN-LAST:event_btnPushMouseClicked

    private void btnPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPopMouseClicked
        if(col.vacia())return;
        if(col.getInicio()==col.getFin()){
            try{
                tblT.setValueAt("", 1, col.getInicio());
                col.pop2();
            }catch(ColaException ex){
                showMessageDialog(this, ex.getMessage());
            }
        }
        else{
            try{
                tblT.setValueAt("", 0, col.getInicio());
                tblT.setValueAt("", 1, col.getInicio());
                col.pop2();
                tblT.setValueAt("Inicio", 0, col.getInicio());
                lblInicio.setText(""+col.getInicio());
                tblT.repaint();
            }catch(ColaException err){
                showMessageDialog(this, err.getMessage());
            }
        }
    }//GEN-LAST:event_btnPopMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ColaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaVentana().setVisible(true);
            }
        });
    }
    
    public DefaultTableModel m;
    ColaCircular col;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCamb;
    private javax.swing.JButton btnEmpt;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JTable tblT;
    private javax.swing.JTextField txtDat;
    private javax.swing.JTextField txtTam;
    // End of variables declaration//GEN-END:variables

    
}