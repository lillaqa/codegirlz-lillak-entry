package exc2;

import java.util.Scanner;

public class EncodeText {

    public static void main(String[] args){

        String inputText;
        char firstLetter;
        Scanner input = new Scanner(System.in);
        System.out.println("Text to ecode:");
        inputText = input.nextLine();
        input.close();

        inputText = inputText.toLowerCase();
        System.out.println("Double check: " +inputText);

        firstLetter = inputText.charAt(0);
        System.out.println("double check first char: " + firstLetter);
        long countFirst = inputText.chars().filter(ch -> ch == firstLetter).count();
        System.out.println("The frequency of the first letter: " + countFirst);


        //inputText = inputText.replaceAll("b","c");
        //System.out.println("Double check: " +inputText);


        //each letter in the text is replaced by a letter some fixed number of positions up in the alphabet
        //the number of this shifting positions equals to the number of occurrences of the first letter in the whole text
        //the algorithm works with lower case letters, it modifies upper case letters to lower case ones as well
        //the special characters (e.g. spaces, exclamation mark, ...) remain the same
        //shifting a letter towards the end of the alphabet continues from the beginning of the alphabet (z → a)

    }
}
