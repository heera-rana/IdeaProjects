//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int result = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += i;
                System.out.println(i + " is divisible by 3 and 5");

                counter++;
                if (counter == 5) {
                    System.out.println(result + " is the sum of numbers divisible by 3 and 5");
                    break;
                }
            }
        }
    }
}