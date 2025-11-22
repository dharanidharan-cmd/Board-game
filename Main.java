

import java.util.Scanner;
public class boardgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] block = new int[16];
		for (int i = 1; i <= 15; i++) block[i] = 1;
		while (true) {
			System.out.println("\nBlocks Status:");
			for (int i = 1; i <= 15; i++) {
				if (block[i] == 1) System.out.println(i + ". Block " + i + " = Present");
				else System.out.println(i + ". Block " + i + " = Removed");
			}
			System.out.print("\nRemove which block (1-15): ");
			int ch = sc.nextInt();
			if (ch < 1 || ch > 15) {
				System.out.println("Invalid block number");
			}
			if (block[ch] == 0) {
				System.out.println("Block already removed");
			}
			block[ch] = 0;
			System.out.println("Block " + ch + " removed.");
			if (ch == 8||ch==2||ch==5||ch==12) {
				System.out.println("\n Tower Collapsed");
				break;
			}
		}
	}
}

