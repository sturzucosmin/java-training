package code._2_challenge._2_foobarqix;

public class FooBarQix {

    public static void main(String[] args) {

        System.out.println("Stage 1: ");

        for(int i = 1; i <= 100; i++) {
            System.out.println(i+" => "+compute(i));
        }

        System.out.println("\nStage 2: ");

        for(int i = 1; i <= 100; i++) {
            System.out.println(i+" => "+compute(i));
        }
    }

    public static String compute(int i) {
        String s = "";
        if (i % 3 == 0) s += "Foo";
        if (i % 5 == 0) s += "Bar";
        if (i % 7 == 0) s += "Qix";

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') s += "Foo";
            if (digit == '5') s += "Bar";
            if (digit == '7') s += "Qix";

        }

        if (s.isEmpty()) {
            s = String.valueOf(i);
        }
        return s;
    }

    public static String compute2(int i) {
        String s = "";

        boolean isDivisible = false;
        if (i % 3 == 0) {
            s += "Foo";
            isDivisible = true;
        }
        if (i % 5 == 0) {
            s += "Bar";
            isDivisible = true;
        }
        if (i % 7 == 0) {
            s += "Qix";
            isDivisible = true;
        }

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') s += "Foo";
            else if (digit == '5') s += "Bar";
            else if (digit == '7') s += "Qix";
            else if (digit == '0') s += "*";
            else if (!isDivisible) s += digit;
        }

        return s;
    }
}