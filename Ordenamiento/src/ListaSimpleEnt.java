/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-D1
 */
public class ListaSimpleEnt {
    
    private NodoEnt inicio, fin;

    public ListaSimpleEnt() {
        inicio = fin = null;
    }
    
    public void insert(int d){
        if(inicio==null)inicio = fin = new NodoEnt(d);
        else {fin.setSig(new NodoEnt(d)); fin = fin.getSig();}
    }
    
    public NodoEnt buscar(int d){
        for (NodoEnt i = inicio; i != null; i=i.getSig()) {
            if(i.getInfo()==d) return i;
        }
         return null;
    }
    
    public boolean eliminar(int d){
        
        for (NodoEnt i = inicio; i != null; i=i.getSig()) {
            if(i.getInfo()==d);
        }
        
        return false;
    }
    
    public void mostrar(){
        for (NodoEnt i = inicio; i!=null; i=i.getSig()) {
            System.out.print(i);
        }
    }
    
    public int getDatoN(NodoEnt n){
        return n.getInfo();
    }

    public NodoEnt getInicio() {
        return inicio;
    }

    public void setInicio(NodoEnt inicio) {
        this.inicio = inicio;
    }

    public NodoEnt getFin() {
        return fin;
    }

    public void setFin(NodoEnt fin) {
        this.fin = fin;
    }
    
    
    
    public static void main(String args[]){
        ListaSimpleEnt l = new ListaSimpleEnt();
        
        l.insert(3);
        l.insert(8);
        l.insert(10);
        
        l.mostrar();
        
        System.out.println(l.buscar(20));
    }
    
}
