
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laveh2107
 */
public class Countedloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // City
        City kw = new City();

        //robot
        RobotSE joe = new RobotSE(kw, 1, 1, Direction.EAST);

        // make a counter
        int counter = 0;
        while (counter < 5) {
            //move
            joe.move();
            //increase counter
            counter = counter + 1;
            //counter = ++; <-- shortcut to add one
            //counter +=1; <-- another shortcut
        }
        joe.turnAround();

        //using a for loop to count
        //for(define a variable; condition to loop; increase variable)
        for (int i = 0; i < 5; i = i + 1) {
            joe.move();
        }
        //Coumpound Condition
        //&& <- AND statement - both must be true
        //|| <- OR statement - one of them must be true
        if (joe.frontIsClear()) {
            if (joe.countThingsInBackpack() == 5) {
                //do something
            }
        }
        if (joe.frontIsClear() && joe.countThingsInBackpack() == 5) {
            //do something
        }
        if (joe.frontIsClear()) {
            //do something
        } else if (joe.countThingsInBackpack() == 5) {
            //do same thing as above if statement
        }
        if (joe.frontIsClear() || joe.countThingsInBackpack() == 5) {
            //do something
        }
    }
}
