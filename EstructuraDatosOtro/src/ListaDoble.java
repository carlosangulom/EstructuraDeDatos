/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-D1
 */
public class ListaDoble {
    private NodoString inicio, fin; 

    public ListaDoble() {
        inicio=fin=null; 
    }
    public void mostrar(){for(NodoString i=inicio;i!=null;i=i.getSig())System.out.print(i);
    }
    
    public void insertar(String d){
        NodoString t=new NodoString(d);
        if(inicio==null)inicio=fin=new NodoString(d);//Lista vacía
        else{
            if(d.compareToIgnoreCase(inicio.getDato())<0){//Insertar a la izquierda
                inicio.setAnt(t); t.setSig(inicio); inicio=t;
            }else if(d.compareToIgnoreCase(fin.getDato())>0){//Insertar al final 
                fin.setSig(t); t.setAnt(fin); fin=t;
            }
            else{
                for(NodoString i=inicio.getSig(); i!=fin; i=i.getSig()){//Insertar en medio
                    if(d.compareToIgnoreCase(i.getDato())<0){   
                        i.getAnt().setSig(t); t.setAnt(i.getAnt());t.setSig(i); i.setAnt(t); 
                    }
                }
            }
        }
    
    }//insertar
    
    public static void main(String[] arg){
        ListaDoble i=new ListaDoble();
        i.insertar("Sergio"); i.insertar("Paola");i.insertar("Will"); i.insertar("Ramón"); i.mostrar();
    }
}
