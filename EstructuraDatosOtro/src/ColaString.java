
import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-D1
 */
public class ColaString {
    private String C[]; //declaracion
    private int tam,tope;

    public ColaString(int tam) {this.tam = tam; tope=-1; C=new String[tam];}
    public ColaString() {tam = 5; tope=-1; C=new String[tam];}
    
    public boolean vacia(){return tope==-1;}
    public boolean llena(){return tope==tam-1;}
    
    public void mostrar(){for(int i=0;i<=tope;i++)System.out.println("["+C[i]+"]");}
    
    public void push(String d){
      if(llena()){showMessageDialog(null,"llena");}
      else C[++tope]=d;
   }//push
    
   //TareaSacar
    
    
}
