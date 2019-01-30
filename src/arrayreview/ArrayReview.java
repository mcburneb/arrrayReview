
package arrayreview;

import java.util.Scanner;

/**
 * @author Brianna McBurney 
 * Student Number: 991517337
 * Date: Jan 16, 2019
 */
public class ArrayReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] myList = new double[3];
        
        Scanner in = new Scanner(System.in);
        
        double sum = 0;
        System.out.println("Please enter 3 numbers:");
        for (int i=0;i<myList.length;i++) {
            myList[i] = in.nextDouble();
            sum += myList[i];
        }
        
        System.out.println("\nSum = " +sum+"\n");
        
        double average = sum/myList.length;
        System.out.printf("The average is %.2f \n", average);
    }

}
