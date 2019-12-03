
//Para generar una colisión :
//GARG310307JEO
//AIRA540126V9K

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class BusquedaRFC extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaRFC
     */
    public BusquedaRFC() {
        initComponents();
        this.setLocationRelativeTo(null);
        m = (DefaultTableModel) tblRFC.getModel();
        c = (DefaultTableModel) tblColisiones.getModel();
        
        llenarTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRFC = new javax.swing.JTextField();
        btnGenerarAl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRFC = new javax.swing.JTable();
        lblNomT = new javax.swing.JLabel();
        lblApPT = new javax.swing.JLabel();
        lblApMT = new javax.swing.JLabel();
        lblFNT = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtAP = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        txtAM = new javax.swing.JTextField();
        btnGenerarBN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblColisiones = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerarAl.setText("RFC Aleatorio");
        btnGenerarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarAlActionPerformed(evt);
            }
        });

        tblRFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RFC", "Nombre", "Apellido Paterno", "Apellido Materno", "Fecha de Nacimientoa"
            }
        ));
        jScrollPane1.setViewportView(tblRFC);

        lblNomT.setText("Nombre:");

        lblApPT.setText("Apellido Paterno:");

        lblApMT.setText("Apellido Materno:");

        lblFNT.setText("Fecha de Nacimiento:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtNom.setNextFocusableComponent(txtAP);

        txtAP.setNextFocusableComponent(txtAM);

        txtAM.setNextFocusableComponent(txtFN);
        txtAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAMActionPerformed(evt);
            }
        });

        btnGenerarBN.setText("Generar");
        btnGenerarBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBNActionPerformed(evt);
            }
        });

        tblColisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RFC", "Nombre", "Apellido Paterno", "Apellido Materno", "Fecha de Nacimientoa"
            }
        ));
        jScrollPane2.setViewportView(tblColisiones);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGenerarAl)
                                    .addComponent(btnGenerarBN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApPT)
                                    .addComponent(lblNomT))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFNT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(lblApMT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerarAl)
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnGenerarBN))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomT)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblApPT))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApMT))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFNT))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarAlActionPerformed
        try {
            generarRFC();
        } catch (IOException ex) {
            Logger.getLogger(BusquedaRFC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarAlActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
        if(txtRFC.getText().equals("") || txtNom.getText().equals("") || txtAP.getText().equals("") || txtAM.getText().equals("") || txtFN.getText().equals("")){ showMessageDialog(this, "Campos vacíos"); return;}
        
        int pos = hash(txtRFC.getText());
        
        if(m.getValueAt(pos, 0)!=null){
            if(c.getValueAt(pos, 0)!=null)pos++;
            c.setValueAt(txtRFC.getText(), pos, 0);
            c.setValueAt(txtNom.getText(), pos, 1);
            c.setValueAt(txtAP.getText(), pos, 2);
            c.setValueAt(txtAM.getText(), pos, 3);
            c.setValueAt(txtFN.getText(), pos, 4);
            tblColisiones.changeSelection(pos, pos, false, false);
        }else{
            m.setValueAt(txtRFC.getText(), pos, 0);
            m.setValueAt(txtNom.getText(), pos, 1);
            m.setValueAt(txtAP.getText(), pos, 2);
            m.setValueAt(txtAM.getText(), pos, 3);
            m.setValueAt(txtFN.getText(), pos, 4);
            tblRFC.changeSelection(pos, pos, false, false);
        }
        
        txtRFC.setText("");
        txtAP.setText("");
        txtAM.setText("");
        txtNom.setText("");
        txtFN.setText("");
        
        System.out.println("****"+hash(txtRFC.getText())+"******");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAMActionPerformed

    private void btnGenerarBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBNActionPerformed
        if(txtRFC.getText().equals("") || txtNom.getText().equals("") || txtAP.getText().equals("") || txtAM.getText().equals("") || txtFN.getText().equals("")){ showMessageDialog(this, "Campos vacíos"); return;}
        String pc = primerosCuatroCaracteresRFC(txtNom.getText(), txtAP.getText(), txtAM.getText());
        String fn[] = txtFN.getText().split("\\-");
        String mnc = generarMonoclave();
        String a = fn[2].substring(2, 4);
        txtRFC.setText(pc+a+fn[1]+fn[0]+mnc);
    }//GEN-LAST:event_btnGenerarBNActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int pos = hash(txtRFC.getText());
        
        if(m.getValueAt(pos, 0)==null){
            if(c.getValueAt(pos, 0)==null){
                showMessageDialog(this,"No existe."); 
                return;
            }
        }
        
        if(m.getValueAt(pos, 0)!=null && m.getValueAt(pos, 0).toString().equals(txtRFC.getText())){
            txtRFC.setText("");
            txtAP.setText("");
            txtAM.setText("");
            txtNom.setText("");
            txtFN.setText("");
        
            txtRFC.setText(m.getValueAt(pos, 0).toString());
            txtAP.setText(m.getValueAt(pos, 1).toString());
            txtAM.setText(m.getValueAt(pos, 2).toString());
            txtNom.setText(m.getValueAt(pos, 3).toString());
            txtFN.setText(m.getValueAt(pos, 4).toString());
            tblRFC.changeSelection(pos, pos, false, false);
        }else{
            txtRFC.setText("");
            txtAP.setText("");
            txtAM.setText("");
            txtNom.setText("");
            txtFN.setText("");
        
            txtRFC.setText(c.getValueAt(pos, 0).toString());
            txtAP.setText(c.getValueAt(pos, 1).toString());
            txtAM.setText(c.getValueAt(pos, 2).toString());
            txtNom.setText(c.getValueAt(pos, 3).toString());
            txtFN.setText(c.getValueAt(pos, 4).toString());
            tblColisiones.changeSelection(pos, pos, false, false);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        guardarArchivos();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaRFC().setVisible(true);
            }
        });
    }
    
    public int hash(String rfc){
        int n = 0;
        
        for (int i = 0; i < rfc.length(); i++) {
            n+=(rfc.charAt(i))*3;
            System.out.println(n);
        }
        
        System.out.println("------"+n+"------");
        
        return (n%1555)/15;
    }
    
    public String generarRFC() throws IOException{
        String rfc="";
        int n = R.nextInt(39)+1;
        //if(n==0) n=1;
        String reg="";
        
        try {
            fe = new java.io.FileReader("ListaNombres.txt");
            br=new java.io.BufferedReader(fe);
            
            for (int i = 0; i < n; i++) {
                reg=br.readLine();
            }
            
            String R[] = reg.split("\\|");
            
            String pc = primerosCuatroCaracteresRFC(R[2], R[0], R[1]);
            String monoclave="", fechaN="", año, dia, mes;
            Random A  = new Random();
            
            int a = A.nextInt(89)+10;
            año = ""+a;
            int m = A.nextInt(12);
            if(m==0)m++;
            if(m<10)mes ="0"+m;
            else mes =""+m;
            int d = A.nextInt(D[m]);
            if(d<10)dia = "0"+d;
            else dia = ""+d;
            
            fechaN=año+mes+dia;
            
            monoclave=generarMonoclave();
            
            rfc = pc+fechaN+monoclave;
            
            txtRFC.setText(rfc);
                        
            txtAP.setText(R[0]);
            txtAM.setText(R[1]);
            txtNom.setText(R[2]);
            txtFN.setText(dia+"-"+mes+"-"+"19"+año);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BusquedaRFC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rfc;
    }
    
    public String generarMonoclave(){
        String mono="";
        Random A  = new Random();
        int num; 
        
        for (int i = 0; i < 3; i++) {
                
                boolean bueno;
                do{
                    num = A.nextInt(100);
                    if((num>=49 && num<=57) || (num>=65 && num<=90))bueno = true;
                    else bueno = false;
                    
                }while(!bueno);
                
                char c = (char) num;
                mono+=c;
            }
        
        return mono;
    }
    
    public void guardarArchivos(){
        
        try { 
            fs=new java.io.FileWriter("rfc_g.txt");
              for (int i = 0; i < m.getRowCount(); i++) {
                  if(m.getValueAt(i, 0)!=null)rfc=new RFC(m.getValueAt(i, 0).toString(),m.getValueAt(i, 1).toString(),m.getValueAt(i, 2).toString(),m.getValueAt(i, 3).toString(),m.getValueAt(i, 4).toString());
                  else rfc=new RFC("","","","","");
                  rfc.guardar(fs);
              }
            fc=new java.io.FileWriter("Colisiones.txt");
                for (int i = 0; i < c.getRowCount(); i++) {
                if(c.getValueAt(i, 0)!=null)rfc=new RFC(c.getValueAt(i, 0).toString(),c.getValueAt(i, 1).toString(),c.getValueAt(i, 2).toString(),c.getValueAt(i, 3).toString(),c.getValueAt(i, 4).toString());
                  else rfc=new RFC("","","","","");
                  rfc.guardar(fs);
            }
        } catch (IOException ex) {
             showMessageDialog(this, ex.getMessage());
        }
    }
    
    public void llenarTablas(){
        try {
            FileRead = new java.io.FileReader("rfc_g.txt");
            buff = new java.io.BufferedReader(FileRead);
            String rfc = "";
            
            for (int i = 0; i < 100; i++) {
                rfc=buff.readLine();
                String G[] = rfc.split("\\:");
                System.out.println(G.length);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BusquedaRFC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BusquedaRFC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static String primerosCuatroCaracteresRFC(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        //Eliminar acentos y llevar a mayúsculas
        nombre = eliminarAcentosYSimbolos(nombre);
        apellidoPaterno = eliminarAcentosYSimbolos(apellidoPaterno);
        apellidoMaterno = eliminarAcentosYSimbolos(apellidoMaterno);

        //Nombre: Omitir palabras que no se utilizan, MARIA, JOSE y compuestos, y obtener las 2 primeras letras
        Pattern pattern = Pattern.compile("\\A(?:(?:MARIA|JOSE) )?+(?:(?:DEL?|L(?:AS?|OS)|M(?:AC|[CI])|V[AO]N|Y)\\b ?)*+([A-Z&]?)([A-Z&]?)");
        final Matcher matcherNom = pattern.matcher(nombre);
        matcherNom.find();

        //Apellido: Omitir palabras que no se utilizan, y obtener la primera letra y la vocal interna (si el apellido tiene más de 2 letras)
        pattern = Pattern.compile("\\A(?:(?:DEL?|L(?:AS?|OS)|M(?:AC|[CI])|V[AO]N|Y)\\b ?)*+(([A-Z&]?)[B-DF-HJ-NP-TV-Z&]*([AEIOU]?)[A-Z&]?)");
        final Matcher matcherPat = pattern.matcher(apellidoPaterno);
        matcherPat.find();

        final Matcher matcherMat = pattern.matcher(apellidoMaterno);
        matcherMat.find();

        //LETRAS
        //Obtener vocal de apellido paterno y letra(s) del nombre
        String letraPat = matcherPat.group(2);
        String letraMat = matcherMat.group(2);
        String letraNom = matcherNom.group(1);
        String rfc;
        if (letraPat.isEmpty() || letraMat.isEmpty()) {
            //Si no tiene alguno de los apellidos (paterno o materno), se toma la primera y segunda letra del apellido que tiene
            //y el 4to caracter será la segunda letra del nombre.
            rfc = (matcherPat.group(1) + matcherMat.group(1)).substring(0,2) + letraNom + matcherNom.group(2);
        }
        else if (matcherPat.group(1).length() > 2)
        {
            String vocal = matcherPat.group(3);
            //Cuando el apellido paterno no tiene vocales, se utiliza una X.
            if (vocal.isEmpty())
                vocal = "X";
            rfc = letraPat + vocal + letraMat + letraNom;
        } 
        else
        {
            //Si el apellido paterno tiene 1 o 2 letras, no se toma la primera vocal,
            //y el 4to caracter es la segunda letra del nombre.
            rfc = letraPat + letraMat + letraNom + matcherNom.group(2);
        }


        //Cuando las 4 letras resulten en una palabra inconveniente (regla 9), se modifica la última letra a una X
        if (rfc.matches("BUE[IY]|C(?:A[CGK][AO]|O(?:GE|J[AEIO])|ULO)|FETO|GUEY|JOTO|K(?:A(?:[CG][AO]|KA)|O(?:GE|JO)|ULO)|M(?:AM[EO]|E(?:A[RS]|ON)|ION|OCO|ULA)|P(?:E(?:D[AO]|NE)|UT[AO])|QULO|R(?:ATA|UIN)"))
            return rfc.substring(0,3) + "X";
        else
        return rfc;
    }

    public static String eliminarAcentosYSimbolos(String s)
    {
        s = Normalizer.normalize(s.replaceAll("[Ññ]","&"), Normalizer.Form.NFD);
        s = s.replaceAll("[^&A-Za-z ]", "");
        return s.trim().toUpperCase();
    }
    

    Random R = new Random();
    int D[] = {00,31,28,31,30,31,30,31,31,30,31,30,31};
    private java.io.FileWriter fs, fc; 
    private java.io.FileReader fe, FileRead; 
    private java.io.BufferedReader br, buff;
    DefaultTableModel m, c;
    RFC rfc;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarAl;
    private javax.swing.JButton btnGenerarBN;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApMT;
    private javax.swing.JLabel lblApPT;
    private javax.swing.JLabel lblFNT;
    private javax.swing.JLabel lblNomT;
    private javax.swing.JTable tblColisiones;
    private javax.swing.JTable tblRFC;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}