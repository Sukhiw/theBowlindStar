package chapter6;

public class PhoneBillCalculatorRedo {

    public static void main(String args[]){
        PhoneBillRedo bill = new PhoneBillRedo(12321);
        bill.setNumberOfMinutesUsed(350);
        bill.printItemizedBill();
    }
}
