
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get user input
        Scanner input = new Scanner(System.in);
        
        //Asking user to type in thier name 
        System.out.println("Please enter your name");
        //Scanning in thier name into a variable
        String name2 = input.nextLine();
        //String name = "Hunter";
        
        //System hello to the user
        System.out.println("Hello " + name2);
        
        //ask uuser what year they are born
        //use this to calculate thier age
        System.out.println("What year were you born");
        int year = input.nextInt();
        //determine thier age
        int age = 2017 - year;
        if (age > 0){
        System.out.println("Yo are " + age + "years old?");
    }else{
            System.out.println("I think your lying !:}");
        }
    }
}
