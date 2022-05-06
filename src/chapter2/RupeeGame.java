package chapter2;

import java.util.Scanner;

public class RupeeGame {

   static double rupee = 1;
    static double quarter = 0.25;
    static double paisa50 = 0.5;
    public static void main(String args[]){

        System.out.println("how many quarters do you have");
        Scanner scanner = new Scanner(System.in);
        double quarterScanner = scanner.nextDouble();

        System.out.println("How many 50 paisas do you have");
        double paisa50Scanner = scanner.nextDouble();

        System.out.println("How many rupees do you have");
        double rupeeScanner = scanner.nextInt();

        double totalMoney = (quarterScanner * quarter) + (paisa50Scanner * paisa50) + (rupeeScanner * rupee);
        if (totalMoney == rupee){
            System.out.println("You match exact amount, Bang on!!");
        }
        else if(totalMoney > rupee){
            System.out.println("Sorry you are short of 1 rupee by " + (rupee - totalMoney));
        }
        else if (totalMoney<rupee) {
                    System.out.println("you are over the desired amont by " + (rupee - totalMoney));
        }
    }
}
