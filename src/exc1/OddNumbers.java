package exc1;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args){

        int nbr1, nbr2, nbr3, nbr4, nbr5;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.println("Add your numbers to calculate mean:");
        nbr1 = input.nextInt();
        nbr2 = input.nextInt();
        nbr3 = input.nextInt();
        nbr4 = input.nextInt();
        nbr5 = input.nextInt();
        input.close();

        if ( nbr1 % 2 == 0 )
            System.out.println(nbr1 + " number is even");
        else
            System.out.println(nbr1 + " number is odd");

        if ( nbr2 % 2 == 0 )
            System.out.println(nbr2 + " number is even");
        else
            System.out.println(nbr2 + " number is odd");

        if ( nbr3 % 2 == 0 )
            System.out.println(nbr3 + " number is even");
        else
            System.out.println(nbr3 + " number is odd");

        if ( nbr4 % 2 == 0 )
            System.out.println(nbr4 + " number is even");
        else
            System.out.println(nbr4 + " number is odd");

        if ( nbr5 %  2 == 0 )
            System.out.println(nbr5 + " number is even");
        else
            System.out.println(nbr5 + " number is odd");



        avarage = (double) (nbr1+nbr2+nbr3+nbr4+nbr5)/5;

        System.out.println("The avarage number is:" + avarage);


    }

}
