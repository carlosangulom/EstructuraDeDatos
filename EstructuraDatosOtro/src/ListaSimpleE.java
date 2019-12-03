/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barce
 */
public class ListaSimpleE {
    private NodoEnt inicio, fin;

    public ListaSimpleE() {inicio=fin=null;}
    public void insertar(int d){
        if(inicio==null) inicio=fin=new NodoEnt(d);
        else{ fin.setSig(new NodoEnt(d));fin = fin.getSig();}
    }
    public void mostrar(){for(NodoEnt i=inicio;i!=null;i=i.getSig())System.out.print(i);}
    
    public NodoEnt buscar(int d){
        for(NodoEnt i=inicio;i!=null;i=i.getSig()){ if(i.getInfo()==d) return i;}
        return null;
    }
    
    public NodoEnt buscarAnt(NodoEnt j){
        for(NodoEnt i=inicio;i!=null;i=i.getSig()){ if(i.getSig()==j) return i;}
        return null;
    }
    
    public boolean borrar(int d){
        NodoEnt i;
        if(buscar(d)!=null){
            if(buscar(d)==inicio){i=buscar(d); inicio=i.getSig();}
            else if(buscar(d)==fin){i=buscar(d); fin=buscarAnt(i); fin.setSig(null);}
            else{i=buscarAnt(buscar(d)); i.setSig(buscar(d).getSig());}
            return true;
        }
        return false;
    }
    
    public boolean eliminar(int e){
        if(inicio.getInfo()==e){inicio=inicio.getSig();} 
        else{
            NodoEnt i=inicio;
            for(; i!=fin; i=i.getSig())
                if(i.getSig().getInfo()==e){i.setSig(i.getSig().getSig()); return true;}
        
        if(fin.getInfo()==e){fin=i; fin.setSig(null);return true;} 
        }
        return false; 
    }
    
    public static void main(String[] arg){
        ListaSimpleE i=new ListaSimpleE();
        i.insertar(3); i.insertar(8);i.insertar(9); i.insertar(6); i.insertar(10); i.mostrar();
        i.borrar(10); i.borrar(8); i.mostrar();
        
    }
}
