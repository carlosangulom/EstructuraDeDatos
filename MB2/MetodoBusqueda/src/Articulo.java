
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER3
 */
public class Articulo {
    private String clave, descrip; 
    private float precio; 

    public Articulo() {
    }

    public Articulo(String clave, String descrip, float precio) {
        this.clave = clave;
        this.descrip = descrip;
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void guardar(java.io.FileWriter f){
        String reg=clave+"|"+descrip+"|"+precio+"\n";
        try {
            f.write(reg); f.flush();
        } catch (IOException ex) {
            showMessageDialog(null, ex.getMessage());
        }
    }
}
