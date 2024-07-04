package kadai_bingogame;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] bingo = makeBingoBoard();
	
		String[][] strBoard = new String[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				strBoard[i][j] = String.valueOf(bingo[i][j]);
			}
		}
		System.out.println("----------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 2) {
					System.out.print("FREE\t");
				} else {
					System.out.print(strBoard[i][j] + "\t\t");
				}
			}
			System.out.println();
		}
	}

	static int[][] makeBingoBoard() {
		Random r = new Random();
		int[][] bingo = new int[5][5];

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 5; i++) {
			int random = r.nextInt(15) + 1;
			if (set.contains(random)) {
				i--;
				continue;
			}
			bingo[i][0] = random;
			set.add(random);
		}
		for (int i = 0; i < 5; i++) {
			int random = r.nextInt(15) + 16;
			if (set.contains(random)) {
				i--;
				continue;
			}
			set.add(random);
			bingo[i][1] = random;
		}
		for (int i = 0; i < 5; i++) {
			int random = r.nextInt(15) + 31;
			if (set.contains(random)) {
				i--;
				continue;
			}
			set.add(random);
			bingo[i][2] = random;
		}
		for (int i = 0; i < 5; i++) {
			int random = r.nextInt(15) + 46;
			if (set.contains(random)) {
				i--;
				continue;
			}
			set.add(random);
			bingo[i][3] = random;
		}
		for (int i = 0; i < 5; i++) {
			int random = r.nextInt(15) + 61;
			if (set.contains(random)) {
				i--;
				continue;
			}
			set.add(random);
			bingo[i][4] = random;
		}
		return bingo;
	}

	static void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	static void bingoDebug(int[][] bingo) {
		for (int i = 0; i < bingo.length; i++) {
			debug(bingo[i]);
		}
	}
}


