public class Recursividad{

   public static int buscarElementoR(int a[], int e, int n){
   
      if(n==a.length || a[n]==e){
      
         if(n==a.length) return -1;
         else return n;
      
      }else return buscarElementoR(a, e, n+1);
   
   }
   
   public static long exponencialRec(int n, int e){
   
      if(e==0) return 1;
      else if(e==1) return n;
      else if(e<0) return exponencialRec(n, e+1)/n;
      else return n*exponencialRec(n, e-1);
   
   }
   
   public static int factorialRec(int n){
   
      int r;
      if(n==1) return 1;
      else r=n*factorialRec(n-1);
      return r;
   
   }
   
   public static boolean palRec(String palabra, int i, int j){
 
     if(i != (palabra.length()/2)){
         if(palabra.charAt(i) == palabra.charAt(j))
             return palRec(palabra, ++i, --j);
         else
             return false;
     }
      return true;
   }
   
   public static void main(String args[]){
   
      int A[]={1,3,4,5,38,50};
      //System.out.println(buscarElementoR(A,38, 0));
      //System.out.print(exponencialRec(2, 32));
      //Ssystem.out.print(factorialRec(5));
      if(palRec("casac",0, 3))System.out.print("si");
      else System.out.print("no");
   
   }

}
