/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-D1
 */
public class NodoEnt {
    private int info;
    private NodoEnt sig;

    public NodoEnt() {
        this.info = 0;
        sig = null;
    }

    public NodoEnt(int info) {
        this.info = info;
        sig = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoEnt getSig() {
        return sig;
    }

    public void setSig(NodoEnt sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "{" + "info=" + info + "}--->";
    }
    
    
}
