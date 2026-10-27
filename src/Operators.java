public class Operators {
    public static void main(String[] args) {
        int first = 5;
        int second = 4;
        int firstSum = first + second;
        int resultOne = 1 + 6;
        int resultTwo = 7 - 8;
        int resultFinal = resultOne * resultTwo;
        int rotPerSec = 5;
        int rotPerHour = rotPerSec * 5;
        int quotient1 = 5 / 3;
        double quotient2 = 5.0 / 3;
        int rawEncoderDegrees = 560 / 2;
        int normalizedAngle = rawEncoderDegrees;
        int timer = 1000;
        timer++;
        int secondsLeftInMatch = 85;
        secondsLeftInMatch--;
        int num1 = 15;
        int num2 = 2;
        double avg = 3.667;


        System.out.println("The sum of 5 and 4 is " + firstSum);

        System.out.println("The final result is " + resultFinal);

        System.out.println("The amount of rotations per hour is " + rotPerHour);

        System.out.println("The value of the first quotient is " + quotient1);

        System.out.println("The value of the second quotient is " + quotient2);

        System.out.println("The value of the normalized robot angle is " + normalizedAngle);

        System.out.println("The value of the time is " + timer);

        System.out.println("The number of seconds left in the match is " + secondsLeftInMatch);

        System.out.println("The sum is: " + (num1 + num2) + ", the difference is " + (num1 - num2) + ", the product is " + (num1 * num2) + ", and the WHOLE NUMBER quotient (not accounting for the decimal) is " + (num1 / num2));

        System.out.println("The average is " + avg);

    }
}