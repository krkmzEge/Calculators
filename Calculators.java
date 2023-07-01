import java.util.Scanner;

public class miniproje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose an option:");
        System.out.println("Bmi calculator 1");
        System.out.println("Kmh to mile calculator 2");
        System.out.println("Mile to Kmh calculator 3");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Please enter your weight: ");
                int weight = scanner.nextInt();
                System.out.println("Please enter your height: (Please enter like this: 1.72) ");
                double height = scanner.nextDouble();

                double bmi = weight / ( height * height);

                System.out.println("Your body mass index is : " + bmi);
            }
            case 2 -> {
                System.out.println("Please enter a value: (Kmh) ");
                double kmh = scanner.nextInt();
                double mile = (kmh * 0.621371);
                System.out.println(kmh + " kmh equals to " + mile + " mile....");
            }
            case 3 -> {
                System.out.println("Please enter a value: (mile) ");
                double mile2 = scanner.nextInt();
                double kmh2 = (mile2 * 1.609344);
                System.out.println(mile2 + " mile equals to " + kmh2 + " kmh....");
            }
            default -> // The user entered an invalid choice.
                    System.out.println("Invalid choice.");
        }
    }
}