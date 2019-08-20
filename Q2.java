/*
Write a program in Java that accepts two String type values and generate the output in the required format.
*/
import java.util.Scanner;
public class Q2{
   public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s1 =  in.nextLine();
        String s2 =  in.nextLine();
        System.out.println(s1+" University "+s2);
   }
}