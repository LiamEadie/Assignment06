
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */

public class A6Q1 {
public static double areaCircle(double r){
        double area = Math.PI*r*r;
        return area;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double radius = input.nextDouble();
        double answer = areaCircle(radius);
        System.out.println("The Area of the Circle is " + answer);
    }
}
