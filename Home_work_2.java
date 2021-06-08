package Home2;

public class Home_work_2 {
    public static void main(String[] args) {
        numbers(5, 4);
        System.out.println("***");
        if (passTheNumber(-9)) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
        System.out.println("***");
        reverse(5);
        System.out.println("***");
        stringNumber("I like Java", 5);
        System.out.println("***");
        int year = 201;
        if (LeapYear(year)) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " - Не високосный год");
        }

    }

    public static boolean numbers(int a, int b) {
        boolean sum;
        sum = ((a + b) >= 10 && (a + b) <= 20) ? true : false;
        System.out.println(sum);
        return sum;
    }

    public static boolean passTheNumber(int a) {
        return a >= 0;
    }

    public static boolean reverse(int a) {
        boolean rev;
        rev = (a > 0) ? false : true;
        System.out.println(rev);
        return rev;
    }

    public static void stringNumber(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean LeapYear(int a) {
        boolean rev;
        if (a % 4 == 0 && a % 100 != 0) {
            rev = true;
        } else if (a % 100 == 0 && a % 400 != 0) {
            rev = false;
        } else if (a % 400 == 0) {
            rev = true;
        }
        else {
            rev = false;
        }
        return rev;

    }
}



