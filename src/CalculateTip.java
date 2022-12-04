import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateTip {

    public BigDecimal totalWithTip(double totalCost) {
        BigDecimal total;
        if(totalCost < 0) {
            total = new BigDecimal(0);
        } else {
            double newtotal = (totalCost + (totalCost * .18));
            total = new BigDecimal(newtotal).setScale(2, RoundingMode.HALF_UP);
        }
        return total;
    }

    public BigDecimal tip18Percent(double cost) {
        BigDecimal tipAmount;
        if(cost < 0){
            tipAmount = new BigDecimal(0);
        } else {
            double tip = cost * .18;
            tipAmount = new BigDecimal(tip).setScale(2, RoundingMode.HALF_UP);
        }
        return tipAmount;
    }

    //write another method, with parameters of the tip percent and total
    public BigDecimal calculateTipAmount(double total, double tip) {
        BigDecimal tipAmount;
        if(total < 0 || tip < 0) {
            tipAmount = new BigDecimal(0);
        } else {
            double cost = total * (tip / 100);
            tipAmount = new BigDecimal(cost).setScale(2, RoundingMode.HALF_UP);
        }
        return tipAmount;
    }

    public static void main(String[] args) {
        CalculateTip calculateTip = new CalculateTip();
//        System.out.println(calculateTip.totalWithTip(100));
//        System.out.println(calculateTip.totalWithTip(10.10));
//        System.out.println(calculateTip.tip18Percent(100.00));
//        System.out.println(calculateTip.tip18Percent(10.10));

//        System.out.println(calculateTip.totalWithTip(0));
//        System.out.println(calculateTip.totalWithTip(-10));


//        System.out.println(calculateTip.tip18Percent(-10));

        System.out.println(calculateTip.calculateTipAmount(100, 18));
//        System.out.println(calculateTip.calculateTipAmount(10.10, 18));
//        System.out.println(calculateTip.calculateTipAmount(10, 20));
//        System.out.println(calculateTip.calculateTipAmount(15, 10));
    }

}

//write a function which takes the number representing the total cost of a meal as its argument
//your function should calculate the new total with an 18% tip added
//calculateTip(100) should return 118


