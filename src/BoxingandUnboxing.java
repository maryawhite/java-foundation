import java.util.ArrayList;

public class BoxingandUnboxing {

    public static void main(String[] args) {
        //you can't use primited types as objects
        //but there is a wrapper class

        //you can't do the following, "type argument cannot be of primitive type"
//    ArrayList<int> intArrayList = new ArrayList<~>();

        //instead, you would do the following:
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));  //this is boxing: valueOf takes the primitive type of i and converts it to the Integer class
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //this is unboxing
        }


        ///an easier way to do the above code:
        Integer myIntValue = 56;  //java will automatically box it for us using Integer.valueOf()
        int myInt = myIntValue.intValue(); //this is unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));  //boxing
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();  //unboxing
            System.out.println(i + " --> " + value);
        }

    }


}
