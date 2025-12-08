import java.util.*;

public class SwapNumbers {

void swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("Swapped values are a = "+ a + " b = "+ b);

}
public static void main(String args[]) {
    System.out.println("Enter Two Numbers to Perform Swap Operation");
    Scanner sc  = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before Swap : a = "+ a + " b = " + b);
    SwapNumbers s = new SwapNumbers();
    s.swap(a, b);

}


}
