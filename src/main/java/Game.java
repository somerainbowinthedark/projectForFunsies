import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        printDramaticText("blah blah blah ");

           String[] cowboys = new String[]{"Agustin", "TallDust"};
            System.out.println("Pick your cowboy: Agustin or TallDust");
        String cowboy = scanner.nextLine();

        System.out.print("Cowboy: ");
        String cowfolks = scanner.nextLine();
    while(!Arrays.asList(cowfolks).contains(cowfolks.toLowerCase())) {
        System.out.println(" blah blah blah: ");
        System.out.print("Cowboy: ");
        cowfolks = scanner.nextLine();
        }
        Cowboy player = new Cowboy(cowfolks);
        player.printCharacterSheet();
        while(Array.asList(cowfolks).contains("Agustin")){
            printDramaticText("blah blah blah ");
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
