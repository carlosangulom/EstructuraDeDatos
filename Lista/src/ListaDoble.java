/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class ListaDoble {
    
    public NodoADN inicio, fin;
    public ListaDoble(){inicio=fin=null;}
    public void mostrar(){for(NodoADN i=inicio;i!=fin;i=i.getSig())System.out.print(i);
    System.out.print(fin);
    }
    
    public void insertar(String d, int posY){
        NodoADN t =new NodoADN(d);//Crear un nuevo nodo
        if(inicio==null){inicio=fin=t; t.setPosY(10);}//Lista Vacia
        else{
            if(d.compareToIgnoreCase(fin.getDato())>0){//Insertar al Final
                fin.setSig(t);fin.setPosY(fin.getPosY()+200);t.setAnt(fin);fin=t;
            }else{
                if(d.compareToIgnoreCase(inicio.getDato())<0){//Insertar al inicio
                inicio.setAnt(t);inicio.setPosY(10);t.setSig(inicio);t.setPosY(posY+200);inicio=t;
            }else
               for(NodoADN i=inicio.getSig();i!=null;i=i.getSig())//Insertar entre inicio y fin 
               if(d.compareToIgnoreCase(i.getDato())<0){
                i.getAnt().setSig(t);i.getAnt().setPosY(posY-200);t.setSig(i);t.setAnt(i.getAnt());i.setAnt(t);break;}
            }
        }
        inicio.setAnt(fin);fin.setSig(inicio);
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
    
    
     public static void main(String[] arg){
        ListaDoble i=new ListaDoble();
        /*i.insertar("Zergio");
        i.insertar("Sergio"); i.insertar("Paola");i.insertar("RamÃ³n");
        i.mostrar();i.eliminar("Paola");i.mostrar();
        if(i.eliminar("Raul"))System.out.println("Se elimino correctamente");
        else  System.out.println("Nodo no encontrado");*/
    }
    
}
