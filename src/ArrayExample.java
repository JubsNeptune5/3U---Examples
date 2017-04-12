
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laveh2107
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create a list of five numbers
        double[] marks = new double[5];

        //Scan in some marks
        System.out.println("Please enter in five marks");
        //THIS IS THE BAD WAY TO DO IT.....
        //put number in first position
        // marks[0] = input.nextDouble();
        //put number in second position
        // marks[1] = input.nextDouble();
        //put number in third position
        // marks[2] = input.nextDouble();
        //put number in first position
        // marks[3] = input.nextDouble();
        //put number uin first position
        //marks[4] = input.nextDouble();

        //BEST WAY... FOR LOOP
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //EXTRA- enchance for loop
        for(double num:marks){
            System.out.println(num);
        }
        //use for loop to determine sum
        //Satrt with an accumulator
        double sum = 0;
        //loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //Add to whatever  number I'm on
            sum = sum + marks[i];
        }
        System.out.println("");
        System.out.println("The sum is "+sum);
        
        double avg = sum/marks.length;
        System.out.println("");
        System.out.println("The average is "+avg);
    }
}
