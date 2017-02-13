
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();
        
        //create robot
        Robot joe = new Robot(kw, 4, 1, Direction.EAST);
        
        //create the path
        new Thing(kw, 4, 2);
        
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 3);
        
        new Thing(kw, 3, 3);
        
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        
        //turn on the thing labels
        kw.showThingCounts(true);
        
        //step onto first part fo the path
        joe.move();
        
        //loop
        while(true){
            
       
       while(joe.canPickThing()){
           joe.pickThing();
       }
        //if holding one thing, move
       if(joe.countThingsInBackpack()==1){
           //drop thing
           joe.putThing();
           //move
           joe.move();
        //if holding two things, turn left
       }else if(joe.countThingsInBackpack()==2){
           //drop things
           joe.putThing();
           joe.putThing();
           //move
           joe.turnLeft();
           joe.move();
         //if holding three things, turn right
       }else if(joe.countThingsInBackpack()==3){
        //dropthings
           joe.putThing();
           joe.putThing();
           joe.putThing();
           //move
           joe.turnLeft();
           joe.turnLeft();
           joe.turnLeft();
           joe.move();
       
      
        //if holding four things, stop
        }
    }
    }

