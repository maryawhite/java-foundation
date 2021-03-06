public class StarPyramid {

    public static void drawPyramid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawFlag() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("= ");
            }
            System.out.println();
        }
    }

    public static void drawStairs() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void skipARow() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++) {
                if(i == 3){   //this will skip row 4 because the index starts at 0, index 3 is row 4
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void skipAColumn() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++) {
                if(i== 3 && j == 2){   //this will skip a column in the 4th row
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printARogue() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++) {
                if(i== 3 && j == 2){   //this will print a different character in row 4 column 3
                    System.out.print("# ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void invertedTriangle() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedStairs() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); //You can play around with the spacing here to get different results
            }
            System.out.println();
        }
    }

    public static void drawPlatform() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <+ i; j++) {
                System.out.print("   "); //this moves it to the right 3 times each iteration
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawPlatform2() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("   "); //this moves it to the right 3 times each iteration
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        drawPyramid();
        System.out.println();
        drawFlag();
        System.out.println();
        drawStairs();
        System.out.println();
        System.out.println("skip a row");
        skipARow();
        System.out.println();
        System.out.println("skip a column");
        skipAColumn();
        System.out.println();
        System.out.println("print a rogue");
        printARogue();
        System.out.println();
        invertedTriangle();
        System.out.println();
        invertedStairs();
        System.out.println();
        drawPlatform();
        drawPlatform2();
    }
}
