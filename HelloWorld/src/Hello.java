public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Heera");

        boolean isReversed = false;
        if (isReversed == false) {
            System.out.println("The component is not reversed!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <=90) {
            System.out.println("Either or both the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "BMW" ? false : true;

        double myVar = 20.00d;
        double mySecondVar = 80.00d;
        double myFirstSum = myVar + mySecondVar;
        double mySecondSum = myFirstSum * 100;
        double myRemVar = mySecondSum % 60.00;
        System.out.println(myRemVar);

        boolean noRem = (myRemVar == 0) ? true : false;
        if (!noRem) {
            System.out.println("got some remainder");
        }

    }
}

