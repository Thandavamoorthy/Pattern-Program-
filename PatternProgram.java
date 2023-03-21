package PatternProgram;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Letter A
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col + row == 6 || col == row + 4 || row == 5 && col >= row - 3 && col <= row + 3
						|| col == 1 && row >= col + 5 || col == 9 && row >= col - 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter B
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 || row == 1 && col <= row + 6 || row == 5 && col <= row + 2 || row == 9 && col <= row - 2
						|| col == 8 && row >= col - 2 && row != col + 1
						|| col == 8 && row <= col - 4 && row != col - 7) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter C
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 && row != col && row != col + 8 && row != col + 1 && row != col + 7
						|| row == 1 && col != row && col != row + 8 && col != row + 1
						|| row == 9 && col != row - 8 && col != row && col != row - 7 || row == 2 && col == row + 7
						|| row == 8 && col == row + 1 || col == 2 && row == col || col == 2 && row == col + 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter D
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row == 1 && col != row + 7 && col != row + 8 || row == 9 && col != row - 1 && col != row
						|| row == 2 && col == 8 || row == 8 && col == 8 || col == 2
						|| col == 9 && row != col - 8 && row != col - 7 && row != col && row != col - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter E
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 || row == 1 || row == 9 || row == 5 && col <= row + 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter F
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 || row == 1 || row == 5 && col <= row + 2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter G
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 && row != col && row != col + 8 && row != col + 1 && row != col + 7
						|| row == 1 && col != row && col != row + 8 && col != row + 1
						|| row == 9 && col != row - 8 && col != row && col != row - 7 || row == 2 && col == row + 7
						|| col == 2 && row == col || col == 2 && row == col + 6
						|| col == 9 && row != col && row >= col - 4 || row == 5 && col != row + 4 && col >= 5
						|| col == 5 && row >= col + 1 && row != col + 3 && row != col + 2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter H
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 || col == 8 || row == 5 && col != row - 4 && col != row + 4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter I
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row == 1 || row == 9 || col == 5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter J
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row == 1 && col <= row + 7 && col != row || row == 9 && col <= 4 && col != row - 8
						|| col == 5 && row != col + 4 || row == 8 && col == row - 7) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter K
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 3 && row <= col + 5 && row != col + 7 || col == 2 && row <= col || col == 2 && row == 9
						|| row + col == 8 && col > 2 || col > 2 && row == col + 1 && col != 8 || col == 8 && row == col
						|| col == 8 && row == col - 7) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter L
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 || row == 9 && col <= row - 2 && col != row - 8) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter M
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 && row != col || col == 9 && row != col - 8 || row <= 5 && row >= 2 && row == col
						|| row <= 5 && row >= 2 && row + col == 10) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter N
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 || col == 9 || row == col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter O
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 && row <= 8 && row != col - 1 || col == 8 && row >= col - 6 && row != col + 1
						|| row == 1 && col >= row + 2 && col != row + 7 && col != row + 8
						|| row == 9 && col >= row - 6 && col != row - 1 && col != row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter P
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 && row <= 8 || col == 8 && row <= col - 4 && row != col - 7
						|| row == 1 && col >= row + 2 && col != row + 7 && col != row + 8 || row == 9 && col <= row - 6
						|| row == 5 && col >= row - 2 && col != row + 3 && col != row + 4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter Q
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 && row <= 7 && row != col || col == 7 && row >= col - 5 && row != col + 1 && row != col + 2
						|| row == 1 && col <= row + 5 && col != row || row == 8 && col <= row - 2 && col != row - 7
						|| row == 6 && col == 6 || row == 8 && col == 8 || row == 7 && col == 9 || row == 5 && col == 5
						|| row == 6 && col == 4) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter R
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 && row >= col || row == 9 && col <= row - 6 || row == 1 && col >= row + 2 && col != row + 8
						|| col == 9 && row <= col - 5 && row != 1 || row == 5 && col >= row - 3 && col != row + 4
						|| row == 6 && col == 4 || row == 7 && col == 5 || row == 8 && col == 6 || row == 9 && col == 7
						|| row == 9 && col == 8 || row == 8 && col == 9) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter S
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 && row <= col + 2 && row != col - 1 || row == 1 && col >= row + 2 && col != row + 8
						|| col == 9 && row == 2 || row == 5 && col >= row - 2 && col != row + 4
						|| col == 9 && row >= col - 3 && row != col || row == 9 && col >= row - 6 && col != row
						|| col == 2 && row == 8) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter T
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 5 || row == 9 && col == 4 || row == 9 && col == 6 || row == 1 && col <= row + 7 && col != row
						|| row == 2 && col == 1 || row == 2 && col == row + 7) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter U
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 2 && row <= col + 6 || col == 8 && row <= col
						|| row == 9 && col >= row - 6 && col != row - 1 && col != row || row == 1 && col <= row + 2
						|| row == 1 && col >= row + 6) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter V
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row <= 5 && row == col || row <= 5 && row + col == 10) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter W
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (col == 1 || col == 9 || row >= 5 && row + col == 10 || row >= 5 && row == col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter X
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row + col == 10 || row == col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter Y
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row + col == 10 || row <= 5 && row == col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Letter Z
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if (row + col == 10 || row == 1 || row == 9) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}

}
