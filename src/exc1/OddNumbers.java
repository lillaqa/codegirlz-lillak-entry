package exc1;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args){
        //double num = 0;
        //double x = 1;
        //Scanner NumScanner = new Scanner(System.in);

        //System.out.println("Add your numbers to calculate mean:");
        String name;
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

        avarage = (double) (nbr1+nbr2+nbr3+nbr4+nbr5)/5;

        System.out.println("The avarage number is:" + avarage);






    }




}
