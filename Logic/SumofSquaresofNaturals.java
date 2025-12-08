

public class SumofSquaresofNaturals {
   
    public static void main(String args[]) {
            int n = 8;
            int sqsum = 0;


            for(int i = n; i > 0; i--) {
                sqsum += i * i;
            }
            System.out.println("Answer is" + sqsum);
    }



}
