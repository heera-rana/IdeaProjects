//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Height in Inches is " + convertToCentimeters(68));
        System.out.println("Feet and Height in Inches is " + convertToCentimeters(5, 8));





    }

    public static double convertToCentimeters(int heightInInches) {
        double inchesToCentimeters = heightInInches * 2.54;
        return inchesToCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remHeightInInches) {
        int feetToInches = (heightInFeet * 12) + remHeightInInches;
        return convertToCentimeters(feetToInches);

//        DIFFERENT WAY OF DOING IT:
//        int feetToInches = (heightInFeet * 12);
//        int totalInches = feetToInches + remHeightInInches;
//        double result = convertToCentimeters(totalInches);
//        return result;

    }
}