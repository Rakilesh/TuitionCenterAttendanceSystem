package calcultor;


    public class ScientificCalculator extends Calculator {

        public double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        public double squareRoot(double num) {
            if (num < 0) {
                System.out.println("Error: Cannot find square root of a negative number!");
                return 0;
            }
            return Math.sqrt(num);
        }
    }

