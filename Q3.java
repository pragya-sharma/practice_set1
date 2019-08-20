/*
Write a program in Java to accept two integers and print the following -
the sum of the two numbers:
*/
import java.util.Scanner;
public class Q3{
  public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int n1 = in.nextInt();
     int n2 = in.nextInt();
     System.out.println(n1+" + "+n2+" = " +(n1+n2));
  }
}
     