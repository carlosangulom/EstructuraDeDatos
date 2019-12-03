
import java.util.Random;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduar
 */
public class VentanaAdn extends javax.swing.JFrame {
    private NodoAdn inicio,fin;
    public VentanaAdn() {
        
        //this.setPreferredSize(1273, 639);
        inicio=fin=null;
        initComponents();
        this.setSize(816, 470);
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

        cmbAdn = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        lblPos2 = new javax.swing.JLabel();
        lblPos1 = new javax.swing.JLabel();
        lblPos4 = new javax.swing.JLabel();
        lblPos5 = new javax.swing.JLabel();
        lblPos6 = new javax.swing.JLabel();
        lblPos3 = new javax.swing.JLabel();
        lblSerie2 = new javax.swing.JLabel();
        lblSerie3 = new javax.swing.JLabel();
        lblSerie1 = new javax.swing.JLabel();
        lblSerie5 = new javax.swing.JLabel();
        lblSerie4 = new javax.swing.JLabel();
        lblSerie6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnReinio = new javax.swing.JButton();
        lblTit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista doblemente enlazada");
        getContentPane().setLayout(null);

        cmbAdn.setBackground(new java.awt.Color(204, 204, 204));
        cmbAdn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbAdn.setForeground(new java.awt.Color(79, 79, 80));
        cmbAdn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona una cadena", "1", "2", "3", "4", "5", "6" }));
        cmbAdn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 13, 52), 1, true));
        getContentPane().add(cmbAdn);
        cmbAdn.setBounds(270, 100, 280, 40);

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(79, 79, 81));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/create.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 13, 52), 1, true));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(270, 150, 130, 40);
        getContentPane().add(lblPos2);
        lblPos2.setBounds(156, 330, 126, 90);
        getContentPane().add(lblPos1);
        lblPos1.setBounds(30, 330, 126, 90);
        getContentPane().add(lblPos4);
        lblPos4.setBounds(408, 330, 126, 90);
        getContentPane().add(lblPos5);
        lblPos5.setBounds(534, 330, 126, 90);
        getContentPane().add(lblPos6);
        lblPos6.setBounds(660, 330, 126, 90);
        getContentPane().add(lblPos3);
        lblPos3.setBounds(282, 330, 126, 90);

        lblSerie2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblSerie2);
        lblSerie2.setBounds(156, 300, 93, 24);

        lblSerie3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblSerie3);
        lblSerie3.setBounds(282, 300, 93, 24);

        lblSerie1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblSerie1);
        lblSerie1.setBounds(30, 300, 93, 24);

        lblSerie5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblSerie5);
        lblSerie5.setBounds(534, 300, 93, 24);

        lblSerie4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblSerie4);
        lblSerie4.setBounds(408, 300, 93, 24);

        lblSerie6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblSerie6);
        lblSerie6.setBounds(660, 300, 93, 24);

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(79, 79, 81));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 13, 52), 1, true));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(420, 150, 130, 40);

        btnReinio.setBackground(new java.awt.Color(204, 204, 204));
        btnReinio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReinio.setForeground(new java.awt.Color(79, 79, 81));
        btnReinio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rest.png"))); // NOI18N
        btnReinio.setText("Reiniciar");
        btnReinio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 13, 52), 1, true));
        btnReinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinioActionPerformed(evt);
            }
        });
        getContentPane().add(btnReinio);
        btnReinio.setBounds(350, 200, 130, 40);

        lblTit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTit.setForeground(new java.awt.Color(71, 118, 206));
        lblTit.setText("LISTA DOBLEMENTE ENLAZADA");
        getContentPane().add(lblTit);
        lblTit.setBounds(220, 30, 382, 32);

        jSeparator1.setBackground(new java.awt.Color(25, 25, 25));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 284, 816, 10);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg.png"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(0, 0, 820, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean eliminar(int d){
            if (d==inicio.getSerieA()) {
                inicio = inicio.getSig();
                return true;
            }
            else if(d==fin.getSerieA()){
                    fin=fin.getAnt();
                    fin.setSig(null);
                    return true;
            }
            else
                for (NodoAdn i = inicio.getSig(); i != null; i = i.getSig()) {
                    if (d==i.getSerieA()) {
                        i.getAnt().setSig(i.getSig());
                        i.getSig().setAnt(i.getAnt());
                        return true;
                    }//if
                }//for
            return false;
    }//eliminar
     private void mostrar(){
        lblPos1.setIcon(null);
        lblPos2.setIcon(null);
        lblPos3.setIcon(null);
        lblPos4.setIcon(null);
        lblPos5.setIcon(null);
        lblPos6.setIcon(null);
        int j=0;
        for (NodoAdn i = inicio; i != null; i = i.getSig()) {
            j++;
        switch (j) {
                case 1:
                    lblSerie1.setText(""+i.getId());
                    lblPos1.setIcon(new ImageIcon("src/Imagenes/dna.png"));
                    break;
                case 2:
                    lblSerie2.setText(""+i.getId());
                    lblPos2.setIcon(new ImageIcon("src/Imagenes/dna"+(i.getSerieA()+1)+".png"));
                    break;
                case 3:
                    lblSerie3.setText(""+i.getId());
                    lblPos3.setIcon(new ImageIcon("src/Imagenes/dna"+(i.getSerieA()+1)+ ".png"));
                    break;
                case 4:
                    lblSerie4.setText(""+i.getId());
                    lblPos4.setIcon(new ImageIcon("src/Imagenes/dna"+(i.getSerieA()+1)+ ".png"));
                    break;
                case 5:
                    lblSerie5.setText(""+i.getId());
                    lblPos5.setIcon(new ImageIcon("src/Imagenes/dna"+(i.getSerieA()+1)+ ".png"));
                    break;
                case 6:
                    lblSerie6.setText(""+i.getId());
                    lblPos6.setIcon(new ImageIcon("src/Imagenes/dna"+(i.getSerieA()+1)+ ".png"));
                    break;
            }   
        }
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(cmbAdn.getSelectedIndex()==0){
            showMessageDialog(null, "¡Selecciona una cadena de adn!");
        } else {
              String se = cmbAdn.getItemAt(cmbAdn.getSelectedIndex()).toString();
              int Adn = cmbAdn.getSelectedIndex();
              int serie=Integer.parseInt(se);
            NodoAdn t = new NodoAdn(serie,Adn);
            if (inicio == null) {inicio = fin = t;}//lista vacia
            else
            if (serie>inicio.getId()) {inicio.setAnt(t);t.setSig(inicio);inicio = t;}//insrta izquierda
            else {
                if(serie<fin.getId()){fin.setSig(t);t.setAnt(fin);fin=t;}
                else{
                    for (NodoAdn i = inicio.getSig(); i != null; i = i.getSig()) {
                        if (serie>i.getId()) {
                            i.getAnt().setSig(t);
                            t.setAnt(i.getAnt());
                            i.setAnt(t);
                            t.setSig(i);
                            break;
                        }//if
                    }//for
                }//else
            }//else
            mostrar();
            cmbAdn.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(cmbAdn.getSelectedIndex()==0){
            showMessageDialog(null, "¡Selecciona una cadena de adn!");
        } else {
            int indice;
            indice = cmbAdn.getSelectedIndex();
            eliminar(indice);
            
                lblSerie1.setText(null);
                lblSerie2.setText(null);
                lblSerie3.setText(null);
                lblSerie4.setText(null);
                lblSerie5.setText(null);
                lblSerie6.setText(null);
            
            mostrar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinioActionPerformed
        inicio=fin=null;
        lblPos1.setIcon(null);
        lblPos2.setIcon(null);
        lblPos3.setIcon(null);
        lblPos4.setIcon(null);
        lblPos5.setIcon(null);
        lblPos6.setIcon(null);
        lblSerie1.setText(null);
        lblSerie2.setText(null);
        lblSerie3.setText(null);
        lblSerie4.setText(null);
        lblSerie5.setText(null);
        lblSerie6.setText(null);
        cmbAdn.setSelectedIndex(0);
    }//GEN-LAST:event_btnReinioActionPerformed
    
    protected ImageIcon createImageIcon(String path,String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    /*ImageIcon dna = createImageIcon("dna.png", "DNA");
    ImageIcon dna2 = createImageIcon("dna2.png", "DNA");
    ImageIcon dna3 = createImageIcon("dna3.png", "DNA");
    ImageIcon dna4 = createImageIcon("dna4.png", "DNA");
    ImageIcon dna5 = createImageIcon("dna5.png", "DNA");
    ImageIcon dna6 = createImageIcon("dna6.png", "DNA");
    ImageIcon dna7 = createImageIcon("dna7.png", "DNA");
    ImageIcon dna8 = createImageIcon("dna8.png", "DNA");
    ImageIcon dna9 = createImageIcon("dna9.png", "DNA");
    ImageIcon dna10 = createImageIcon("dna10.png", "DNA");
    
    ImageIcon imgs[] = {dna, dna2, dna3, dna4, dna5, dna6,dna7,dna8,dna9,dna10};
    Random r = new Random();*/
    
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
            java.util.logging.Logger.getLogger(VentanaAdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReinio;
    private javax.swing.JComboBox cmbAdn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblPos1;
    private javax.swing.JLabel lblPos2;
    private javax.swing.JLabel lblPos3;
    private javax.swing.JLabel lblPos4;
    private javax.swing.JLabel lblPos5;
    private javax.swing.JLabel lblPos6;
    private javax.swing.JLabel lblSerie1;
    private javax.swing.JLabel lblSerie2;
    private javax.swing.JLabel lblSerie3;
    private javax.swing.JLabel lblSerie4;
    private javax.swing.JLabel lblSerie5;
    private javax.swing.JLabel lblSerie6;
    private javax.swing.JLabel lblTit;
    // End of variables declaration//GEN-END:variables
}
