package code._2_challenge._1_fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println("Stage 1: ");

        for(int i = 1; i <= 100; i++) {
            System.out.print(fizzBuzz(i)+", ");
        }

        System.out.println("\nStage 2: ");

        for(int i = 1; i <= 100; i++) {
            System.out.print(fizzBuzz2(i)+", ");
        }
    }

    public static String fizzBuzz(int i) {
        String s = "";

        NumberWordCorrelation[] correlations = {
                new NumberWordCorrelation(3, "Fizz"),
                new NumberWordCorrelation(5, "Buzz"),
        };
        boolean isDivisible = false;
        for (NumberWordCorrelation correlation : correlations) {
            if (i % correlation.getNumber() == 0) {
                isDivisible = true;
                s += correlation.getWord();
            }
        }
        if (!isDivisible) {
            s = String.valueOf(i);
        }


        return s;
    }

    public static String fizzBuzz2(int i) {
        String s = "";

        NumberWordCorrelation[] correlations = {
                new NumberWordCorrelation(3, "Fizz"),
                new NumberWordCorrelation(5, "Buzz"),
                new NumberWordCorrelation(7, "Rizz"),
                new NumberWordCorrelation(9, "Jazz"),
        };
        boolean isDivisible = false;
        for (NumberWordCorrelation correlation : correlations) {
            if (i % correlation.getNumber() == 0) {
                isDivisible = true;
                s += correlation.getWord();
            }
        }
        if (!isDivisible) {
            s = String.valueOf(i);
        }


        return s;
    }
}