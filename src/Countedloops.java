
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
        while(counter<5){
            //move
            joe.move();
            //increase counter
            counter = counter + 1;
            //counter = ++; <-- shortcut to add one
            //counter +=1; <-- another shortcut
        }
    }
}
