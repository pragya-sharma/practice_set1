/*
Write a program in Java to accept a number from the user and to check whether the number if odd or even.
*/
import java.util.Scanner;
public class Q5{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if(n%2==0){
         System.out.println("even");
      }
      else{
         System.out.println("odd");
      }
   }
}