// Chapter 6 Programming Exercise 13 (page 326)

import java.util.Scanner;

public class BarChart
{
    public static void main(String[] arg)
    {
        // constants and variables
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;

        // input phase
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter points earned by Art >> ");
        artPoints = input.nextInt();

        System.out.print("Please enter points earned by Bob >> ");
        bobPoints = input.nextInt();

        System.out.print("Please enter points earned by Cal >> ");
        calPoints = input.nextInt();

        System.out.print("Please enter points earned by Dan >> ");
        danPoints = input.nextInt();

        System.out.print("Please enter points earned by Eli >> ");
        eliPoints = input.nextInt();

        // output phase
        System.out.println();
        System.out.println("Points Earned This Game");
        displayPoints("Art", artPoints);
        displayPoints("Bob", bobPoints);
        displayPoints("Cal", calPoints);
        displayPoints("Dan", danPoints);
        displayPoints("Eli", eliPoints);

    }
    // method that generates the asterisk characters for the bar chart
    public static void displayPoints(String name, int points)
    {
        System.out.print("\n" + name + ": ");

        for(int x = 1; x  <= points; ++x)
        {
            System.out.print("*");
        }
    }
}