public class CalculateTip {
    public static int calculateTip(int totalCost) {
        int newtotal = (int) (totalCost + (totalCost * .18));
        return Math.round(newtotal);
    }

    public static void main(String[] args) {
        System.out.println(calculateTip(100));
    }

}

//write a function which takes the number representing the total cost of a meal as its argument
//your function should calculate the new total with an 18% tip added and round that number using round
//calculateTip(100) should return 118


