public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        //return the area of a circle
        //r * r * PI
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        //return area of a rectangle x * y
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));  //78.53975
        System.out.println(area(5.0, 4.0));  //20.0
    }
}
