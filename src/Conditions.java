
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Creat a City
       City KW = new City();
       //create robot
       Robot joe = new Robot(KW, 1, 1, Direction.EAST);
       
       //Crteate wall
       new Wall(KW, 1, 5, Direction.EAST);
       
       //infinite loop
       while(joe.frontIsClear()){
           joe.move();
           joe.turnLeft();
           while(joe.canPickThing()){
           joe.pickThing();
           }
       }
       joe.turnLeft();
       
       joe.canPickThing();
    }
}
