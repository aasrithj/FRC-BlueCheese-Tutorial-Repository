public class Print {
    public static void main(String[] args) {
        double myPi = 3.14159;
        int g = 10;
        String mode = "autonomous";
        double degrees = 360;

        System.out.println("Hello World!");
        System.out.println("The robot knows where it is at all times.");
        System.out.println("It knows this because it knows where it isn't.");

        System.out.println(myPi + " " + g + " " + mode);
        myPi = 142857;

        System.out.println(myPi);
        System.out.println(degrees);
    }
}