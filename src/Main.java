import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Particles accelerator");
        System.out.print("Please insert distance in km :");
        int kmNumber = scanner.nextInt();

            if (kmNumber < 6 || kmNumber > 800008){
                System.out.println("Error, out of range.");
            }else {
                int result = (kmNumber - 3) / 8;
                int sensor = (int) Math.ceil(result);
                if (sensor < 2) {
                    System.out.println(1);
                } else if (sensor <= 5) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
    }
}

