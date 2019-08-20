/*
Write a program in Java to accept a String value from the user and print a welcome message in the format given below.
*/
import java.util.Scanner;
public class Q1{
  public static void main(String[]args){
       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
       System.out.println("welcome,"+s);
  }
}