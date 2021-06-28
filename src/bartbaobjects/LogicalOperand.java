package bartbaobjects;

import java.util.Scanner;

public class LogicalOperand {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();
      if (x==0)
           System.out.println(false + "Error");
         else
            System.out.println("Enter second number");
      int s = sc.nextInt();
      
      int div = x *s;
        System.out.println("Rezultat je: " + div);
           
               
    }
         
                
            

}
