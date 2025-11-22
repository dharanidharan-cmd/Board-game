import java.util.Scanner;

class TowerGame {

    private int[] block = new int[16];
    private Scanner sc = new Scanner(System.in);

    
    public TowerGame() {
        for (int i = 1; i <= 15; i++) {
            block[i] = 1;
        }
    }

    
    public void displayBlocks() {
        System.out.println("\nBlocks Status:");
        for (int i = 1; i <= 15; i++) {
            if (block[i] == 1)
                System.out.println(i + ". Block " + i + " = Present");
            else
                System.out.println(i + ". Block " + i + " = Removed");
        }
    }

    
    public boolean removeBlock() {
        System.out.print("\nRemove which block (1–15): ");
        int ch = sc.nextInt();

        if (ch < 1 || ch > 15) {
            System.out.println("Invalid block number");
            return true;
        }

        if (block[ch] == 0) {
            System.out.println("Block already removed");
            return true;
        }

        block[ch] = 0;
        System.out.println("Block " + ch + " removed.");

        if (ch == 2 || ch == 5 || ch == 8 || ch == 12) {
            System.out.println("\nTower Collapsed!");
            return false;
        }

        return true;
    }

    
    public void start() {
        while (true) {
            displayBlocks();
            if (!removeBlock()) break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TowerGame game = new TowerGame();
        game.start();
    }
}
