
/**
 * Write a description of class FibonacciMemoziation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciMemoziation
{
   public static void main(String[] ars){
       System.out.println(fibonacciM(7));
    }
    
   public static int fibonacci(int number){
       if(number==0){return 0;}
       else if (number==1){ return 1;}
       return fibonacci(number -1) + fibonacci(number -2);
    }
    
   public static int fibonacciM(int number){
       int [] cach = new int[number+1];
       return fibonacciMemoization(number,cach);
    }
   public static int fibonacciMemoization(int n,int[] cach){
       if(n==0){return 0;}
       else if(n==1){return 1;}
       if(cach[n]!=0){ return cach[n];}
       cach[n] = fibonacciM(n-1) + fibonacciM(n-2);
       return cach[n];
    }
}
