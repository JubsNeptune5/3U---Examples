/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class MethodsExample {

    /**
     * Say hello to the user
     */
    public static void sayHello() {
        System.out.println("Hello?");
    }
    //Overloaded method.....Has Perameters
    //Say hello to a specific person

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    /**
     * Calculate the volume of a cylinder
     *
     * @param radius the Radius of the cylinder
     * @param height the Height of the cylinder
     * @return the Volume of the cylinder with the radius and the height
     */
    public static double volumeOfCylinder(double radius, double height) {
        //Calculate the volume
        double rSquared = Math.pow(radius, 2);
        double volume = Math.PI * rSquared * height;

        return volume; //sends back an answer
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create string variable
        String n = "Fred";

        //Calling the say hello method
        sayHello();
        sayHello("Bob");
        sayHello(n);

        // radius = 10, hieght = 15
        double answer = volumeOfCylinder(10, 15);
        System.out.println(answer);

    }
}
