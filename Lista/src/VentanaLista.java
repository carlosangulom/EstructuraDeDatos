
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;
import static javax.swing.SwingConstants.TOP;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class VentanaLista extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLista
     */
    public VentanaLista() {
        initComponents();
        this.setLayout(null);
        this.setBackground(new Color(219,241,241));
        btnEliminar.setEnabled(false);
        this.setLocationRelativeTo(null);
        pnl.getVerticalScrollBar().setUnitIncrement(16);
        ((AbstractDocument) txtId.getDocument()).setDocumentFilter(filter);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTit = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        pnl = new javax.swing.JScrollPane();
        pnlPrin = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblImgSelec = new javax.swing.JLabel();
        lblTxtCad = new javax.swing.JLabel();
        lblCad = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Doblemente Enlazada");
        setBackground(new java.awt.Color(219, 241, 241));
        setSize(new java.awt.Dimension(512, 492));

        lblTit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTit.setForeground(new java.awt.Color(82, 145, 144));
        lblTit.setText("LISTA DOBLEMENTE ENLAZADA");

        txtId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.setFocusable(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        pnl.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pnl.setAutoscrolls(true);

        pnlPrin.setBackground(new java.awt.Color(219, 241, 241));
        pnlPrin.setLayout(null);
        pnl.setViewportView(pnlPrin);

        pnlInfo.setBackground(new java.awt.Color(219, 241, 241));
        pnlInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(133, 133, 133)));

        lblImgSelec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTxtCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTxtCad.setText("Cadena Seleccionada:");

        lblCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addComponent(lblTxtCad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCad))
                            .addComponent(lblImgSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxtCad)
                    .addComponent(lblCad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImgSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTit)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String txt = txtId.getText();
        if(dValidado(txtId)){
            insertarD(txt);
            cont++;
            txtId.setText("");
            txtId.requestFocus();
            pnlPrin.revalidate();
            pnlPrin.repaint();
            
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLista().setVisible(true);
            }
        });
    }
    
    private void validaDato(JTextField txt)throws ListaException{
        int l = txt.getText().length();
        char c[] = txt.getText().toCharArray();
        if(l==0){txtId.requestFocus(); throw new ListaException("Campo vacío");}
        for (int i = 0; i <l; i++) {
            if(c[i] < 65 || c[i] > 90) throw new ListaException("Solo letras");
        }
    }
    
    private boolean dValidado(JTextField t){
        try{
          validaDato(t);  
        }catch(ListaException err){
            showMessageDialog(this, err.getMessage());
            txtId.setText("");
            txtId.requestFocus();
            return false;
        }
        
        return true;
    }
    
    
    
    public void insertarD(String d){
        max=10;
        System.out.println("PosY: " +posY +" - CompareTo: "+ "Dato: "+d  +" Max: " +max);
        if(pnlPrin.getComponentCount()==0){posY=10;max=210;}
        else{
            for (int i = 0; i < pnlPrin.getComponentCount(); i++) {
                JLabel l = (JLabel)pnlPrin.getComponent(i);
                if(d.equals(l.getText())){showMessageDialog(this,"Datos repetidos");cont--;return;}
                if(d.compareTo(l.getText())<0){posY=l.getLocation().y; l.setLocation(0, posY+200); max+=200; System.out.println("Max: " +max);/*System.out.println("PosY: " +posY +" - CompareTo: "+ "Dato: " +l.getText() +" vs " +d +" Resultado: " +l.getText().compareTo(d));*/}
                else{
                    if(d.compareTo(l.getText())>0){
                        if(posY<l.getLocation().y+200)max=l.getLocation().y+200;
                        posY=max;
                        System.out.println("Max: " +max +" PosY: " +posY);
                        //break;
                    }
                    
                }
                System.out.println("PosY: " +posY +" - CompareTo: "+ "Dato: " +d +" vs " +l.getText() +" Resultado: " +d.compareTo(l.getText()));   
            }
            
        }
        crearLbl(d, posY);
        
        //posY=0;
        System.out.println(pnlPrin.getComponentCount() + " Max: " + max);
    }    
    
    public boolean eliminar(String d){
        
        
            if(d.equals(inicio.getDato())){//borrar al Inicio
                 inicio=inicio.getSig();inicio.setAnt(fin);fin.setSig(inicio);return true;
                //fin.setSig(t);t.setAnt(fin);fin=t;
            }else{
                if(d.equals(fin.getDato())){//Borrar al final
                    fin=fin.getAnt();fin.setSig(null);return true;
            }else
               for(NodoADN i=inicio.getSig();i!=null;i=i.getSig())//Insertar entre inicio y fin 
               if(d.equals(i.getDato())){
                i.getAnt().setSig(i.getSig());i.getSig().setAnt(i.getAnt());return true;}
            }
            return false;
        
    }
        
    private void obtenerLabel(JLabel l){
         
        this.labelL = l;
    }
    
    private void crearLbl(String t, int posY){
        
        Font f = new Font("Dialog", Font.BOLD, 14);
        
        JLabel label = new JLabel(imgs[r.nextInt(10)]){
            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(f);
            g.drawString(t, 10, 10);
            }
        };
        
        label.setText(t);
        label.setForeground(Color.black);
        label.setLocation(0,posY);
        //location = label.getLocation();
        //setLocationDNA(location.y);
        label.setPreferredSize(new Dimension(200, 200));
        label.setSize(200,200);
        label.setMinimumSize(new Dimension(200, 200));
        label.setMaximumSize(new Dimension(200, 200));
        label.setForeground(Color.black);
        //label.repaint();
        label.addMouseListener(new MouseAdapter()  
        {  
        public void mouseClicked(MouseEvent e)  
        {  
            System.out.println("Click en " +t);
            
            lblCad.setText(t);
            lblImgSelec.setIcon(label.getIcon());
            btnEliminar.setEnabled(true);
            obtenerLabel(label);
            
        }  
        });
        
        Dimension pz = pnlPrin.getPreferredSize();
        pnlPrin.setPreferredSize(new Dimension(pz.width, pz.height+200));
        //pnlPrin.add(label);
        ;
        pnlPrin.add(label, cont);
        pnlPrin.revalidate();
        pnlPrin.repaint();
        
        pnl.revalidate();
        pnl.repaint();
    }
    
    protected ImageIcon createImageIcon(String path,String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    private void setLocationDNA(int p){
        posY=posY+200;
    }
    
    
    JLabel labelL = new JLabel();
    Border border = LineBorder.createBlackLineBorder();
    ImageIcon dna = createImageIcon("dna.png", "DNA");
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
    Random r = new Random();
    Point location;
    int posY=10;
    ListaDoble l = new ListaDoble();
    DocumentFilter filter = new UppercaseDocumentFilter();
    public NodoADN inicio, fin;
    int cont,max = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCad;
    private javax.swing.JLabel lblImgSelec;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lblTxtCad;
    private javax.swing.JScrollPane pnl;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlPrin;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}

class UppercaseDocumentFilter extends DocumentFilter {
  public void insertString(DocumentFilter.FilterBypass fb, int offset, String text,
      AttributeSet attr) throws BadLocationException {

    fb.insertString(offset, text.toUpperCase(), attr);
  }

  public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
      AttributeSet attrs) throws BadLocationException {

    fb.replace(offset, length, text.toUpperCase(), attrs);
  }
}
