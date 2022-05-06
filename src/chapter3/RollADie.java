package chapter3;

import java.util.Random;

public class RollADie {

    public static void main (String args[]){

        int totalSpaces = 20;
        int totalTry = 5;
        int curentSpace = 0;

        for(int i =0; i<= totalTry; i++){

            Random random = new Random();
            int die = random.nextInt(6) + 1;
            curentSpace = die + curentSpace;
            System.out.println(String.format("Roll #%d: You have rolled a %d. ", i+1, die));

            if(curentSpace == totalSpaces){
                System.out.println("You are on space "+ curentSpace + " Congrats you win");
                break;
            }

            else if ( i == totalTry && curentSpace < totalSpaces){
                System.out.println("You are on space " + curentSpace + ".");
                System.out.println("Unfortunately short of total target of "+ totalSpaces + " You loose.");
            }

            else if (curentSpace > totalSpaces){
                System.out.println("You are now at space " + curentSpace);
                System.out.println(" Unfortunately that takes you over by " + (curentSpace - totalSpaces) + " You loose");
            }

            else {
                int spaceToGo = totalSpaces - curentSpace;
                System.out.println("You are now on space "+ curentSpace + " and have " + spaceToGo + " more to go.");
            }

            System.out.println();



        }

    }
}
