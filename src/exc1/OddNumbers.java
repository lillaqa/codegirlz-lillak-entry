package exc1;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args){

        int nbr1, nbr2, nbr3, nbr4, nbr5;
        int cntEven = 0, cntOdd = 0, sumEven = 0, sumOdd = 0;
        //double avarage;


        Scanner input = new Scanner(System.in);

        System.out.println("Add your numbers to calculate mean:");
        nbr1 = input.nextInt();
        nbr2 = input.nextInt();
        nbr3 = input.nextInt();
        nbr4 = input.nextInt();
        nbr5 = input.nextInt();
        input.close();

        if (nbr1 % 2 == 0) {
            cntEven++;
            sumEven = sumEven + nbr1;
        } else {
            cntOdd++;
            sumOdd = sumOdd + nbr1;
        }

        if (nbr2 % 2 == 0) {
            cntEven++;
            sumEven = sumEven + nbr2;
        } else {
            cntOdd++;
            sumOdd = sumOdd + nbr2;
        }

        if (nbr3 % 2 == 0) {
            cntEven++;
            sumEven = sumEven + nbr3;
        } else {
            cntOdd++;
            sumOdd = sumOdd + nbr3;
        }

        if (nbr4 % 2 == 0) {
            cntEven++;
            sumEven = sumEven + nbr4;
        } else {
            cntOdd++;
            sumOdd = sumOdd + nbr4;
        }

        if (nbr5 % 2 == 0) {
            cntEven++;
            sumEven = sumEven + nbr5;
        } else {
            cntOdd++;
            sumOdd = sumOdd + nbr5;
        }

        int evenAvg,oddAvg;
        evenAvg = sumEven/cntEven;
        oddAvg = sumOdd/cntOdd;

        System.out.println("The avarage of odd numbers: "+oddAvg);

    }




}
