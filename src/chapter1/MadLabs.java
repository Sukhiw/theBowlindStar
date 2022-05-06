package chapter1;

import java.util.Scanner;

public class MadLabs {

    public static void main (String args[]){

        //enter the season of a year
        System.out.println("Enter the season of year");
        Scanner scanner = new Scanner(System.in);
        String season =  scanner.next();

        //enter a whole number
        System.out.println("Enter a whole number");
        int number =  scanner.nextInt();

        // enter adjactive
        System.out.println("Enter the adjactive");
        String adj = scanner.next();

        System.out.println("On a "+ adj + " "+  season + " day, I drink a minimum of "+ number + " cups of coffee");
    }
}
