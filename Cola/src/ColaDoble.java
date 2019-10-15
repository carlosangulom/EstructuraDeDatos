
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-D1
 */
public class ColaDoble {
     private String C[];
    //private int c=0;
    private int tam,izq,derc;

    public String[] getC() {
        return C;
    }

    public void setC(String[] C) {
        this.C = C;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getIzq() {
        return izq;
    }

    public void setIzq(int izq) {
        this.izq = izq;
    }

    public int getDerc() {
        return derc;
    }

    public void setDerc(int derc) {
        this.derc = derc;
    }

    public ColaDoble() {this.tam=5;izq=derc=-1;C=new String[tam];}
    public ColaDoble(int tam) {this.tam = tam; izq=derc=-1;C=new String[tam];}
    public boolean vacia(){return izq==-1;}
    public boolean llena(){return (izq==0&& tam-derc==1 )|| derc+1==izq;}
    
    public boolean llenaIzq(){
        return((izq>0&&derc<tam)? C[izq+1]!=null:izq==tam-1||izq==tam-1);
    }
    
    public boolean llenaDer(){
        return((derc>0&&derc<tam)? C[derc-1]!=null:derc==0||derc==0);
    }
    
    
    public void mostrar(){
     if(vacia())showMessageDialog(null,"Vacia");else
      for(int i=izq;i!=derc+1;i++){if(i==tam)i=0;System.out.println("["+C[i]+"]");}
   }
    public void mostrar2(){
     if(vacia())showMessageDialog(null,"Vacia");else
     { int i=izq;
         for(;i!=derc;i=(i+1)%tam)System.out.println(C[i]);
     }
     System.out.println("-----------------------");
   }
    public void entradaDer(String d){
        if(derc==tam-1)showMessageDialog(null,"Llena por derecha");else {
            C[++derc]=d; //if(izq==-1)izq++;
        }
    }//entrada derecha 
    
    
//    public void pop(){
//        if(vacia())showMessageDialog(null,"Vacia");else {
//            if(fin==-1)fin=0;
//            if(c==0)C[(inicio==tam)?inicio=0:inicio]=null;
//            if(c>0)C[(inicio==tam)?inicio=0:inicio++]=null;
//            c++;
//        }
//    }
    
    
    public String salidaIzq(){
            String d=null;
        if(izq==-1)showMessageDialog(null,"vacia por la izquierda");else {
            d=C[izq];izq++; 
           if(izq>derc)izq=derc=-1; 
        }
        return d;
    }
    
     public String salidaDer(){
            String d=null;
        if(derc==-1)showMessageDialog(null,"vacia por derecha");else {
            d=C[derc]; if(derc<izq)izq=derc=-1;derc--;       
        }
        return d;
    }
     public void entradaIzq(String d){
        if(izq==0)showMessageDialog(null,"Llena por izquierda");else {
            C[--izq]=d; if(derc==-1)derc++;
        }
    }//entrada izquierda
     
     public void vaciar(){
         for (int i = 0; i < tam; i++) {
             C[i]=null;
         }
     }
     
    public static void main(String ar[]){
       ColaCircular a=new ColaCircular(3);
       a.push("Hola");
       a.push("Hi");
       a.push("Hello");
       a.mostrar2();
       a.pop2();
       a.pop2();
       a.push("jejeje");
       a.mostrar2();
   }
    
}
