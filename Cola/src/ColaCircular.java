
import javax.swing.JOptionPane;
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
public class ColaCircular {
    public String C[];
    private int c=0;
    public int tam,inicio,fin;

    public ColaCircular() {this.tam=5;inicio=fin=-1;C=new String[tam];}
    public ColaCircular(int tam) {this.tam = tam; inicio=fin=-1;C=new String[tam];}
    public boolean vacia(){return inicio==-1;}
    public boolean llena(){return (inicio==0&& tam-fin==1 )|| fin+1==inicio;
    
    }
    public void mostrar(){
     if(vacia())throw new ColaException("Vacía");else
      for(int i=inicio;i!=fin+1;i++){if(i==tam)i=0;System.out.println("["+C[i]+"]");}
   }
    public void mostrar2(){
     if(vacia())throw new ColaException("Vacía");else
     { int i=inicio;
         for(;i!=fin;i=(i+1)%tam)System.out.println(C[i]);
     }
     System.out.println("-----------------------");
   }
    public void push(String d){
        /*if(llena())throw new ColaException("Llena");else {
            if(inicio==-1)inicio=0;
            C[(fin==tam)?fin=0:++fin]=d;*/
        
        if (llena())throw new ColaException("Llena");
        else {
            if (fin == 0 && inicio == -1) {
                fin = -1;
            }
            if (inicio == -1) {
                inicio = 0;
            }

            C[(fin == tam - 1) ? fin = 0 : ++fin] = d;
        }
    
    }
       
   /*public void pop(){
        if(vacia())showMessageDialog(null,"Vacia");else {
            if(fin==-1)fin=0;
            if(c==0)C[(inicio==tam)?inicio=0:inicio]=null;
           if(c>0)C[(inicio==tam)?inicio=0:inicio++]=null;
           c++;
        }
   }*/

    public String pop2(){
            String d=null;
        if(vacia()){
            inicio=fin=-1;
            throw new ColaException("Vacía"); 
        }
        else {
            d=C[inicio];
           if(inicio==fin)inicio=fin=-1;else if(inicio==tam-1)inicio=0; else ++inicio;
                
        }
        return d;
    }

    public String[] getC() {
        return C;
    }

    public int getTam() {
        return tam;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setC(String[] C) {
        this.C = C;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFin(int fin) {
        this.fin = fin;
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
