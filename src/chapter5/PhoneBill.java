package chapter5;

import java.util.Scanner;

public class PhoneBill {

static double rate = 0.25;
    static Scanner scanner = new Scanner(System.in);


    public static void main (String args[]){

        double fee = planFee();
        System.out.println("plan fee is : "+ fee);

        double overUtilization = OverageUnits();
        System.out.println("plan overutilization fee is : "+ overUtilization);

        double subTotal = fee + overUtilization ;
        System.out.println("Sub total amount is: " + subTotal);

        double tax = TaxAmt(subTotal);
        System.out.println("Tax: " + TaxAmt(subTotal));

       double Total =  tax + subTotal;
        System.out.println("Total: " + Total);

    }

    public static double planFee(){
        System.out.println("Enter the base cost of the plan: ");
        double fee =  scanner.nextDouble();
        return fee ;
    }

    public static double OverageUnits(){
        System.out.println("Enter overage minutes");
        double over = scanner.nextDouble();
        double TotalOver = over * rate ;
        return TotalOver;
    }

    public static double TaxAmt(double subTotal){
         double tax = subTotal * 0.15;
         return tax;

    }
}
