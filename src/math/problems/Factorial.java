package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Factorial 5 =  " + factioral(5));
        }

        public static int factioral (int a) {
            if (a == 0)
                return 1;
            else return a * factioral(a - 1);
        }


    }



