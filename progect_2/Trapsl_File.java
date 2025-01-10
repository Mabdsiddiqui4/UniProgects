
package progect_2;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Trapsl_File {

        public static void main(String[] args) {
        int maxX = 10; // Maximum x-coordinate
        int maxY = 10; // Maximum y-coordinate
        int numTraps = 3; // Number of traps
        
        Set<String> traps = new HashSet<>();
        Random random = new Random();
        
        // Place traps on random locations
        while (traps.size() < numTraps) {
            int x = random.nextInt(maxX) + 1; // Generate random x-coordinate
            int y = random.nextInt(maxY) + 1; // Generate random y-coordinate
            
            traps.add(x + "," + y); // Add trap location as a string "x,y"
        }
        
        // Print out the trap locations
        int count = 1;
        for (String trap : traps) {
            System.out.println("Trap " + count + ": " + trap);
            count++;
        }
    }
}
    

