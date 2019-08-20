/*
Write a program in Java to accept a number from the user and to check whether the number if positive, negative or zero.
*/
import java.util.Scanner;
public class Q4{
  public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     if(n>0){
         System.out.println("Positive");
     }
     else if(n==0){
         System.out.println("Zero");
     }
     else{
         System.out.println("Negative");
     }
  }
}