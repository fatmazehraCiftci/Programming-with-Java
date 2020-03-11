
package newpackage;

import java.util.Scanner;

public class NewClass {
   public static void main(String args[]){ 
       String name;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter your name or nickname:");
       name=scanner.nextLine();
       System.out.println("Hello "+name);
       

   }   
}
