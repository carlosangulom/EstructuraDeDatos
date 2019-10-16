/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class NodoADN {
    
    String dato;
    NodoADN ant, sig;
    int posY;

    public NodoADN(String dato) {
        this.dato = dato;
        ant=sig=null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoADN getAnt() {
        return ant;
    }

    public void setAnt(NodoADN ant) {
        this.ant = ant;
    }

    public NodoADN getSig() {
        return sig;
    }

    public void setSig(NodoADN sig) {
        this.sig = sig;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "{" +  dato + "}";
    }

      
    
    
}
