package Lesson1;

public class HomeWorkApp {


    public static void main(String[] args) {
        printThreeWords();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }
    public static void printThreeWords() {
        System.out.println("_Orange" + "\n" + "_Banana" + "\n" + "_Apple");
    }

    public static void checkSumSign () {
       int a = 20;
       int b = -30;
       int c = a + b;

       if (c > 0) {
           System.out.println("Сумма положительная");
       }
       else {
           System.out.println("Сумма отрицательная");
       }
   }

    public static void printColor () {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100 ) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers () {
        int a = 6;
        int b = 4;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    }
