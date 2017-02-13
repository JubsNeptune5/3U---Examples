
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
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
       
       //things
       new Thing(KW, 0, 1);
       new Thing(KW, 0, 1);
       new Thing(KW, 0, 1);
       new Thing(KW, 0, 1);
       new Thing(KW, 0, 1);
       new Thing(KW, 0, 1);
       new Thing(KW, 0, 1);
       
       //ask if front is clear
       while(joe.countThingsInBackpack()<5){
           joe.move();
           joe.turnLeft();
           //if there is something to pick up
           if(joe.canPickThing()){
           //pick up everything
           joe.pickThing();
           break;
           }
       }
       joe.turnLeft();
       
       joe.canPickThing();
       
    }
}
