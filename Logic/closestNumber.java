import java.util.Scanner;

public class closestNumber {

    int closest(int m, int n) {
        int q = n/m; // N = 14(larger) and m = smaller where (m!=0)

        int lower = m*q;
        int upper = (q+1)*m;
        
        int dif1 = Math.abs(n-lower);
        int dif2 = Math.abs(n-upper);
        int result;
        if(dif1 < dif2) {
            result = lower;
        }

        else if (dif2 < dif1) {
            result = upper;
        }
        else {
            result = (Math.abs(lower) > Math.abs(upper)) ? lower : upper; 
        }
        System.out.println("The closest Number is : "+result);
        return result;
    }





    public static void main(String args[]) {
        
        System.out.println("Enter M and N, Where m is not equal to 0 and n should be greater than m");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        closestNumber s = new closestNumber();
        s.closest(m, n);




    }
}

