//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int primeNumCounter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNumCounter++;
                if (primeNumCounter == 3) {
                    System.out.println("3 prime numbers found ");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

//        if (wholeNumber == 2) {
//            return true;
//        } else if (wholeNumber < 2) {
//            return false;
//        }

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            // by adding wholeNumber / 2, we are reducing iterations as the divisor is two so any number divided by two won't be a prime number.
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}