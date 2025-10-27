import java.util.Scanner;

public class L2Q6 {
    public static void main (String[] args) {

        double water_weights, initial_temp, final_temp, energy_needed;

        Scanner input = new Scanner(System.in);

        System.out.print("Weight of the water (g): ");
        water_weights = input.nextDouble();

        System.out.print("Initial temperature of the water (°f): ");
        initial_temp = input.nextDouble();
        initial_temp = (initial_temp - 32) / 1.8;

        System.out.print("Final temperature of the water (°f): ");
        final_temp = input.nextDouble();
        final_temp = (final_temp - 32) / 1.8;

        energy_needed = water_weights * (final_temp - initial_temp) * 4184;
        System.out.printf("The energy needed is %.2f\n", energy_needed);

        input.close();
    }
}