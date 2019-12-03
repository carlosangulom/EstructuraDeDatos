/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-D1
 */
public class NodoString {
    private String dato;
    private NodoString ant, sig; 

    public NodoString(String dato) {
        this.dato = dato; ant=sig=null; 
    }

    /*NodoString(String d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoString getAnt() {
        return ant;
    }

    public void setAnt(NodoString ant) {
        this.ant = ant;
    }

    public NodoString getSig() {
        return sig;
    }

    public void setSig(NodoString sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "{"+ dato + "}";
    }
    
    
    
}
