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
   
   public static int sumaDigRec(int n){
    
      if(n==0) return 0;
      else return sumaDigRec(n/10)+n%10;
      
   }
   
   public static int numParRec(int a[], int n){
   
      if(n<0)return 0;
      else if(a[n]%2==0)return 1+numParRec(a, n-1);
      else return numParRec(a,n-1);
     
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
   
   public static boolean numeroPrimoRec(int num, int c){
        if(num/2 < c){ return true;}
        else{ if(num%c==0)return false;
        else return numeroPrimoRec(num, c+1);}
    }
    
    public static void burbRec(int[] A, int n, int i, int j){
         int temp = 0;
         if(i >= n-1) return;
         if(j < n - 1){
            burbRec(A, n, i, j + 1);
            if(A[j] > A[j+1]){
               temp = A[j];
               A[j] = A[j+1];
               A[j+1] = temp;
               }
             }
         if(j == 0) burbRec(A, n, i + 1, 0);
        }
   
   public static void main(String args[]){
   
      int A[]={1,7,4,5,51,10};
      //System.out.println(buscarElementoR(A,38, 0));
      //System.out.print(exponencialRec(2, 32));
      //Ssystem.out.print(factorialRec(5));
      //if(palRec("casac",0, 3))System.out.print("si");
      //else System.out.print("no");
      //System.out.print(sumaDigRec(123));
      //System.out.print(numParRec(A, A.length-1));
      //System.out.print(numeroPrimoRec(5,1));
      
      burbRec(A, A.length, 0, 0);
      
      for(int i=0; i<A.length;i++){
      
         System.out.print("["+A[i]+"]"+" ");
      
      }
      
      
   }

}
