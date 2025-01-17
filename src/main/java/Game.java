import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

        printDramaticText("blah blah blah ");

        Scanner scanner = new Scanner(System.in);
           String[] cowboys = new String[]{"Agustin", "TallDust"};
        System.out.println("Choose a Cowboy: ");

        System.out.print("Cowboy: ");
        String cowyboys = scanner.nextLine();
        while(!Arrays.asList(cowboys).contains(cowboys.toLowerCase())) {
            System.out.println(" blah blah blah: ");
        
    }
}
    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 100;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
