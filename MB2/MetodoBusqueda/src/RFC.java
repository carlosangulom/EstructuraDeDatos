
import java.io.IOException;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class RFC {
    String nom, apP, apM, rfc, fNac;
    int año, dia, mes;

    public RFC() {
    }

    public RFC(String rfc, String nom, String apP, String apM, String fNac) {
        this.nom = nom;
        this.apP = apP;
        this.apM = apM;
        this.fNac = fNac;
        this.rfc = rfc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApP() {
        return apP;
    }

    public void setApP(String apP) {
        this.apP = apP;
    }

    public String getApM() {
        return apM;
    }

    public void setApM(String apM) {
        this.apM = apM;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void guardar(java.io.FileWriter f){
        String reg= rfc+":"+nom+":"+apP+":"+apM+":"+fNac+"\n";
        try {
            f.write(reg); f.flush();
        } catch (IOException ex) {
            showMessageDialog(null, ex.getMessage());
        }
    }
}
