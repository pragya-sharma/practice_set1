/*
Write a program in Java to accept two char type values from the user and display them in alphabetical order.
import java.util.Scanner;
public class Q6{
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] a = s.split(" ");
        System.out.println(a);
   }
}
*/
/*
import java.util.Scanner;
public class Q6{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    if(ch == int(ch)){
       System.out.println("digit");
    }
  }
}
 */
import java.util.Scanner;
public class Q6{
   public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      String gender = in.next();
      int n = in.nextInt();
      if(gender == "female"){
            if(1=>n<=58){
                 System.out.println("8.2%");
            }
            else if(59=>n<=100){
                 System.out.println("9.2%");
            }
      }
      else if(gender == "male"){
            if(1=>n<=58){
                 System.out.println("8.4%");
            }
            else if(59=>n<=100){
                 System.out.println("10.5");
            }
      }
   }
}
      
   