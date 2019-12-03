
import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barce
 */
public class BicolasD extends javax.swing.JFrame {

    /**
     * Creates new form BicolasD
     */
    public BicolasD() {
        initComponents();
       
        m=(DefaultTableModel) tblBicola.getModel();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPushI = new javax.swing.JButton();
        btnPopI = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBicola = new javax.swing.JTable();
        btnPushD = new javax.swing.JButton();
        btnPopD = new javax.swing.JButton();
        lblDato = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        txtTam = new javax.swing.JTextField();
        lblTam = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(995, 326));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(930, 0, 60, 30);

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(870, 0, 60, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/dasd.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(-180, 0, 1180, 380);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1000, 30);

        jPanel2.setLayout(null);

        btnPushI.setBackground(new java.awt.Color(153, 255, 255));
        btnPushI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPushI.setText("PushIzq");
        btnPushI.setEnabled(false);
        btnPushI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushIActionPerformed(evt);
            }
        });
        jPanel2.add(btnPushI);
        btnPushI.setBounds(30, 60, 110, 90);

        btnPopI.setBackground(new java.awt.Color(153, 255, 255));
        btnPopI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPopI.setText("PopIzq");
        btnPopI.setEnabled(false);
        btnPopI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopIActionPerformed(evt);
            }
        });
        jPanel2.add(btnPopI);
        btnPopI.setBounds(30, 160, 110, 90);

        tblBicola.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        tblBicola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBicola.setAlignmentX(3.0F);
        tblBicola.setAlignmentY(3.0F);
        tblBicola.setRowHeight(175);
        jScrollPane1.setViewportView(tblBicola);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(170, 60, 660, 190);

        btnPushD.setBackground(new java.awt.Color(153, 255, 255));
        btnPushD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPushD.setText("PushDer");
        btnPushD.setEnabled(false);
        btnPushD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushDActionPerformed(evt);
            }
        });
        jPanel2.add(btnPushD);
        btnPushD.setBounds(860, 60, 110, 90);

        btnPopD.setBackground(new java.awt.Color(153, 255, 255));
        btnPopD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPopD.setText("PopDer");
        btnPopD.setEnabled(false);
        btnPopD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopDActionPerformed(evt);
            }
        });
        jPanel2.add(btnPopD);
        btnPopD.setBounds(860, 160, 110, 90);

        lblDato.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblDato.setForeground(new java.awt.Color(255, 255, 255));
        lblDato.setText("Dato:");
        jPanel2.add(lblDato);
        lblDato.setBounds(560, 10, 110, 40);

        txtDato.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtDato);
        txtDato.setBounds(670, 10, 160, 40);

        txtTam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamActionPerformed(evt);
            }
        });
        txtTam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTamKeyReleased(evt);
            }
        });
        jPanel2.add(txtTam);
        txtTam.setBounds(330, 10, 140, 40);

        lblTam.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTam.setForeground(new java.awt.Color(255, 255, 255));
        lblTam.setText("Tamaño:");
        jPanel2.add(lblTam);
        lblTam.setBounds(170, 0, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/da.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 300);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 30, 1000, 300);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/aaaaa.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 60, 1030, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents
                    
    
    private void btnPushIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushIActionPerformed
        bc.meterIzq(txtDato.getText());
        mostrarTbl();
    }//GEN-LAST:event_btnPushIActionPerformed

    private void btnPopIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopIActionPerformed
        bc.sacarIzq();
        mostrarTbl();

    }//GEN-LAST:event_btnPopIActionPerformed

    private void btnPushDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushDActionPerformed
        bc.meterDer(txtDato.getText());
        mostrarTbl();
        
    }//GEN-LAST:event_btnPushDActionPerformed

    private void btnPopDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopDActionPerformed
        bc.sacarDer();
        mostrarTbl();
    }//GEN-LAST:event_btnPopDActionPerformed

    private void txtTamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamKeyReleased
        if(!txtTam.getText().equals("")){
            int tam = Integer.parseInt(txtTam.getText());
            if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
                m.setColumnCount(tam);
                Object o[] = new Object[tam];
                for(int i=0;i<tam;i++) o[i]="";
                m.setColumnIdentifiers(o);
                m.setRowCount(1); 
                bc = new Bicola(tam);
                actBtn();
            }
        }else showMessageDialog(this,"Inserte un numero");
    }//GEN-LAST:event_txtTamKeyReleased

    private void txtTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                this.setExtendedState(1);

    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void actBtn(){
        btnPushD.setEnabled(true);
        btnPushI.setEnabled(true);
        btnPopI.setEnabled(true);
        btnPopD.setEnabled(true);
    }
    
    public void mostrarTbl(){
        Object O[]=bc.getA();
        for(int i=0;i<bc.getTam();i++){
            m.setValueAt(O[i], 0, i);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(BicolasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BicolasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BicolasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BicolasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BicolasD().setVisible(true);
            }
        });
    }
    private DefaultTableModel m;
    private Bicola bc = new Bicola();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPopD;
    private javax.swing.JButton btnPopI;
    private javax.swing.JButton btnPushD;
    private javax.swing.JButton btnPushI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblTam;
    private javax.swing.JTable tblBicola;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtTam;
    // End of variables declaration//GEN-END:variables
}
