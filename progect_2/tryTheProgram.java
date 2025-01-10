package progect_2;

import java.util.Random;

public class tryTheProgram {

    public static void main(String[] args) {
        final int GAME_AREA_SIZE = 10; // Size of the game area
        Random random = new Random();

        // Place dragons on random locations
        placeDragons(random, GAME_AREA_SIZE);

        // Place treasure piles on odd locations
        placeTreasurePiles(GAME_AREA_SIZE);

        // Place traps on random locations (excluding dragon locations)
        placeTraps(random, GAME_AREA_SIZE);

        // Place exits
        placeExits(random, GAME_AREA_SIZE);
    }

    // Method to place dragons on random locations
    private static void placeDragons(Random random, int size) {
        System.out.println("Dragons:");
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(size) + 1; // Random x-coordinate
            int y = random.nextInt(size) + 1; // Random y-coordinate
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println();
    }

    // Method to place treasure piles on odd locations
    private static void placeTreasurePiles(int size) {
        System.out.println("Treasure Piles:");
        for (int x = 1; x <= size; x += 2) {
            for (int y = 1; y <= size; y += 2) {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
        System.out.println();
    }

    // Method to place traps on random locations (excluding dragon locations)
    private static void placeTraps(Random random, int size) {
        System.out.println("Traps:");
        for (int i = 0; i < 3; i++) {
            int x, y;
            do {
                x = random.nextInt(size) + 1; // Random x-coordinate
                y = random.nextInt(size) + 1; // Random y-coordinate
            } while ((x + y) % 2 == 0); // Ensure trap location is not on a treasure pile
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println();
    }

    // Method to place exits
    private static void placeExits(Random random, int size) {
        System.out.println("Exits:");
        int exit1X, exit1Y, exit2X, exit2Y;
        do {
            exit1X = random.nextInt(size) + 1; // Random x-coordinate for exit 1
            exit1Y = random.nextInt(size) + 1; // Random y-coordinate for exit 1
            exit2X = random.nextInt(size) + 1; // Random x-coordinate for exit 2
            exit2Y = random.nextInt(size) + 1; // Random y-coordinate for exit 2
        } while (exit1X == exit2X && exit1Y == exit2Y); // Ensure exits are not on the same location
        System.out.println("Exit 1: (" + exit1X + ", " + exit1Y + ") - Escape Route");
        System.out.println("Exit 2: (" + exit2X + ", " + exit2Y + ") - Cliff");
    }
}
