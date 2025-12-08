import java.util.*;

public class MultiplicationTable {

        int add(int a, int b) {
            int sum = a + b;
            System.out.println("Adittion = "+ sum);
            return sum;
        }

        int sub(int a, int b) {
            
            if(a > b) {
            int sub = a - b;
            System.out.println("Subtraction = "+ sub);
            return sub;
                }
              else {
                System.out.println("Enter a bigger value than the value b");
                return 0;
            }
        }

         int mul(int a, int b) {
          int mul = a * b;
          System.out.println("Multiplication = "+ mul);
          return mul;
         }

         int div(int a, int b) {
          int div = a / b;
          System.out.println("Multiplication = "+ div);
          return div;  
         }

         int mod(int a, int b) {
          int mod = a % b;
          System.out.println("Multiplication = "+ mod);
          return mod;  
         }



    public static void main(String args[]) {
        
        
        int choice;
        do {
        
        System.out.println("Multiplication Table");
        
        System.out.println("Enter the 2 Values");

        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.println("Enter the Operation wish to perform");
        

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        int opr = sc.nextInt();

        MultiplicationTable s = new MultiplicationTable();

        switch(opr) {
            case 1 : 
                    s.add(v1, v2);
                break;
            
            case 2 : 
                    s.sub(v1,v2);
                break;

            case 3 :
                    s.mul(v1,v2);
                break;

            case 4 : 
                    s.div(v1, v2);
                break;

            case 5 : 
                    s.mod(v1, v2);
                break;
            
            default : 
                    System.out.println("Enter valid Option!");
        }

        System.out.println("Do you want to continue further! (y/n)");
         choice = sc.next().charAt(0);
    } while(choice == 'y' || choice == 'Y');

    }
}
