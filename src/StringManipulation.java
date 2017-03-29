
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Pig latin translator
 *
 * @author laveh2107
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
       
        while (true) {
            
            //get word from user
            System.out.println("Please enter a word");
            String word = input.nextLine();

            //try to find the position of an a
            //if not found, it is -1
            int aPosition = word.indexOf("a");
            
            //ends program when "END" is typed in
            if (word.equals("END")) {
                break;
            }
            //covert to lowercase
            word = word.toLowerCase();

            //fix  1337 (leet) speak
            //changes all 3 to e
            word = word.replace("3", "e");
            //change all @ to a
            word = word.replace("@", "a");
            //change all 0 to o
            word = word.replace("0", "o");

            //find word length and tell the user
            int length = word.length();
            System.out.println("That word's length is " + length);

            //gets letter at position
            char letter = word.charAt(0);
            System.out.println("Character at 0 is " + letter);

            //print out each letter in the word
            //start at position 0, go up to length -1
            for (int i = 0; i < length; i++) {
                //get the character at position i
                char character = word.charAt(i);
                //print out the characters
                System.out.println(character);

                //see if there is a vowel
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

                    //breaking up the string where the vowel was found
                    String firstHalf = word.substring(0, i);
                    String lastHalf = word.substring(i);

                    //Create the translated word
                    String tWord = lastHalf + firstHalf + "ay";

                    //show the user the pig latin
                    System.out.println("Your word in Pig Latin is " + tWord);

                    //stop looking for vowels 
                    break;
                }
            }
        }
    }
}
