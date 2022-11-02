/*Write a complete Java program that accept a set of marks in test out of 100 for 40 students.
The program should find the average and highest marks in the test and display them. Use a method to
 capture the marks into an array via keyboard.
 Include another method that receive an array of the captured marks and returns their sum. [20]
 */



import java.util.*;
public class Assignment
{
    // Main driver method
    public static void main(String args[]) {
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        int n;     //Declaring Variables
        int i;


        //Ask the user to enter the Array Size
        System.out.println("enter total number of students ");
        n = sc.nextInt();

        //Declare the array
        int arr[] = new int[n];
        System.out.println("Enter the marks secured in the   subject ");
        for ( i = 0; i < n; i++)   //Initialize the array
        {
            arr[i] = sc.nextInt();
        }
        int a[] = new int[n];

        double avg = 0;
        System.out.println("enter the marks:");

        for (i = 0;i < n; i++) {
            a[i] = sc.nextInt();

        }
        for (i = 0; i < n; i++) {
            avg = avg + a[i];
        }
        System.out.println("average of (");
        for (i = 0; i < n - 1; i++) {
            System.out.println(a[i] + ",");
        }
        System.out.println(a[i] +") ="+avg/n);
    }



    }



