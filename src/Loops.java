class Drivetrain {
    /**
     * Dummy function that spins drivetrain motors at the specified speed.
     * @param speed
     */
    public void setThrottle(double speed) {
        System.out.println("Spinning drivetrain motors at speed: " + speed);
    }
}
Drivetrain drivetrain = new Drivetrain();

public class Loops {
    public static void main(String[] args) {
        int calibrationTime = 0;

        while (calibrationTime < 5) {
            System.out.println("Calibrating");
            calibrationTime++;

            if (calibrationTime >= 5) {
                System.out.println("Done!");
            }
        }

        for (int timer = 15; timer >= 0; timer--) {
            System.out.println("Time left: " + timer);
        }

        for (int timer = 15; timer >= 0; timer--) {
            if (timer <= 0) {
                drivetrain.setThrottle(0);
            } else if (timer <= 15) {
                drivetrain.setThrottle(1);
            }
        }
    }
}
void main() {
    
}