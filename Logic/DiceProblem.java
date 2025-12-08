/* 

Problem : ou are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

Ideation: From oberserving the dice, we can conclude that sum of 2 opposite sides gives answer as 7.
1->6 = 7;
2->5 = 7;
3->4 = 7;
*/


import java.util.*;

public class DiceProblem {

    int DiceOpposite(int a) {
        int result = 7 - a;
        System.out.println("The opposite of "+a+" is "+result);
        return result;
    }



    public static void main(String args[]) {

        System.out.println("Enter the number to find the opposite side of the dice");
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        DiceProblem ss = new DiceProblem();
        ss.DiceOpposite(value);

    }

    
}
