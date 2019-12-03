
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barce
 */
public class Bicola {
       private String A[];
    private int der,izq,tam;

    public Bicola() {
        tam=5; 
        A=new String[tam];
        der=tam;
        izq=-1;
    }

    public Bicola(int tam) {
        this.tam = tam;
        A=new String[tam];
        der=tam;
        izq=-1;
    }
    ////Constructores 

    public String[] getA() {
        return A;
    }

    public void setA(String[] A) {
        this.A = A;
    }

    public int getDer() {
        return der;
    }

    public void setDer(int der) {
        this.der = der;
    }

    public int getIzq() {
        return izq;
    }

    public void setIzq(int izq) {
        this.izq = izq;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    
    
    public boolean vaciaIzq(){
        return(izq==-1);
    }
    
    public boolean vaciaDer(){
        return(der==tam);
    }
    
    /////Vacia
    
    public boolean llenaIzq(){
        return((izq>0&&der<tam)? A[izq+1]!=null:izq==tam-1||izq==tam-1);
    }
    
    public boolean llenaDer(){
        return((der>0&&der<tam)? A[der-1]!=null:der==0||der==0);
    }
    
    /////Llena
    
    public void meterIzq(String d){
        if(llenaIzq())showMessageDialog(null,"Llena Izquierda");
        else if(izq<tam-1) A[++izq]=d;
    }
    
    public void meterDer(String d){
        if(llenaDer())showMessageDialog(null,"Llena Derecha");
        else if(der>0) A[--der]=d;
    }
    
    ////Meter
    
    public void sacarIzq(){
        if(vaciaIzq()) izq=-1;
        //else if(der==izq+1){ A[izq++]=null; --der;}
        else if(izq>-1||der<tam) A[izq--]=null;
    }
    
    public void sacarDer(){
        if(vaciaDer()) der=tam;
        //else if(izq==der-1){ A[der--]=null;--izq;}
        else if(izq>-1||der<tam) A[der++]=null;
    }
    
    public String mostrarCola(){
        String cad="";
        for(int i=0;i<tam;i++){
            cad=cad+A[i]+" - ";
        }
        return cad;
    }
    public String getVal(){
      return ("\n I: "+izq+" D: "+der);
    }
    
    //// Sacar

}
