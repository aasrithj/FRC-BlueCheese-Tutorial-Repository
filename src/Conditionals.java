class Drivetrain {
    /**
     * Dummy function that spins drivetrain motors at the specified speed.
     * @param speed
     */
    public void setThrottle(int speed) {
        String throttleInfo = String.format("Spinning drivetrain motors at speed: %d", speed);
        System.out.println(throttleInfo);
    }
}

Drivetrain drivetrain = new Drivetrain();

public class Conditionals {
    public static void main(String[] args) {
        boolean shooterEnabled = false;
        int shooterVelocity;
        int statusCode = 1;
        int input = 2;
        int shooterAngleDeg = 54;
        boolean intakeDisabled = false;

        if (shooterEnabled == false) {
            shooterVelocity = 0;
        } else {
            shooterVelocity = 1;
        }

        System.out.println(shooterVelocity);

        if (statusCode == 0) {
            System.out.println("Success!");
        } else if (statusCode != 0) {
            System.out.println("User exited code.");
        } else {
            System.out.println("There was an error");
        }

        if (input >= 5) {
            System.out.println("Controller input detected.");
        } else {
            System.out.println("Discarding input.");
            input = 0;
        }

        if (shooterAngleDeg > 75 || shooterAngleDeg < 10) {
            System.out.println("The shooter has been stopped.");
        } else {
            System.out.println("The shooter is moving.");
        }

        System.out.println(!intakeDisabled);

    }
}