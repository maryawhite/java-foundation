public class WhileLoops {

    public static void printWhileLoop(){
        int count = 1;
        while (count != 6) {  //this will stop it before it gets to 6, (along with count++). once the count == 6, then the loop breaks
            System.out.println("count is + " + count);
            count++;
        }
    }

    //write a method that takes in 1 parameter, int, if it is an even number return true, otherwise return false
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static void printEvenNumbers(int startNumber, int finishNumber){
        int countEvens = 0;
        while(startNumber <= finishNumber) {
            startNumber++;
            if(!isEvenNumber(startNumber)){   //if it's not an even number, skip it and continue the loop
                continue;
            }
            countEvens++;  //this count needs to be down here, if you put it above the if statement, it counts too many
            System.out.println("Even Number: " + startNumber);
        }
        System.out.println("Count is " + countEvens);

    }

    //the do while loop will run once before checking the condition
    public static void printEvenNumbersDoWhile (int startNumber, int finishNumber){
        do{
            if(!isEvenNumber(startNumber)){
                startNumber++;
                continue;
            }
            System.out.println("Even number: " + startNumber);
            startNumber++;
        } while(startNumber <= finishNumber);
    }



    public static void main(String[] args) {
//        printWhileLoop();
//        System.out.println(isEvenNumber(2));  //true
//        System.out.println(isEvenNumber(5));  //false

        printEvenNumbers(4, 20);
        System.out.println("------------------------");
        printEvenNumbersDoWhile(4, 20);
    }
}
