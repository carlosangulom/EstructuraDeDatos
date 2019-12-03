/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduar
 */
public class NodoAdn {
    int serieA, id;
    NodoAdn ant, sig;

    public NodoAdn(int id, int serieA) {
        this.serieA = serieA;
        this.id = id;
        ant=sig=null;
    }

    public int getSerieA() {
        return serieA;
    }

    public void setSerieA(int velocidad) {
        this.serieA = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoAdn getAnt() {
        return ant;
    }

    public void setAnt(NodoAdn ant) {
        this.ant = ant;
    }

    public NodoAdn getSig() {
        return sig;
    }

    public void setSig(NodoAdn sig) {
        this.sig = sig;
    }
}
