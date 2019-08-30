
import static javax.swing.JOptionPane.*;

public class BusquedaBinaria{

    private static int buscarN(int a[], int e){
   
     int n = a.length;
     int m=0, b=0, t=n-1;
     
      while(b<=t){
        
        m=(t+b)/2;
        
        if(a[m]==e) return m;
        
        else if(e<a[m]){
           
           t=m-1;
           
        }
        else {
          
          b=m+1;
          
        }
        
      }
      
      return -1;
    
    }

   public static void main(String args[]){
         
      int Num[] ={1,3,6,8,13,14,20,47,56,60,62,65,69,70};
      
      int v = Integer.parseInt(showInputDialog("Ingrese el valor que desea encontrar:"));
      
      int res = buscarN(Num,v);

      if(res!=-1) showMessageDialog(null, "La posición en el arreglo del número es: " + res);
      else showMessageDialog(null, "El valor no se encuentra dentro del arreglo");   
   
   }
   

}