package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			System.out.print("[ ");

			for (int j = 0; j < matrise[i].length; j++) {

				if (j > 0) {
					System.out.print(", ");
				}
				System.out.print(matrise[i][j]);
			}
			System.out.println(" ]");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matrStr = "";
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				if (j > 0) {
					matrStr = matrStr + " ";
				}
				String verdi = String.valueOf(matrise[i][j]);
				matrStr = matrStr + verdi;
			}
			matrStr = matrStr + "\n";
		}
		return matrStr;
	}

	// c)
	// implementerte slik at tabellane i matrisa ikkje treng å vere like store/lange

	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] newMatr = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			int[] xMatr = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				int x = matrise[i][j];

				xMatr[j] = x * tall;
			}
			newMatr[i] = xMatr;
		}
		return newMatr;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean x = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				if (a[i].length == b[i].length) {
					for (int j = 0; j < a[i].length; j++) {
						if (a[i][j] != b[i][j]) {
							x = false;
						}
					}
				} else {
					x = false;
				}
			}
		} else {
			x = false;
		}
		return x;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}

	public static void main(String[] args) {

		// a)
		System.out.println(" a)");
		int[][] matrA = { 
				{ 1, 2, 3, 4 }, 
				{ 2, 3, 4, 5 }, 
				{ 3, 4, 5, 6 , 10} 
		};
		skrivUt(matrA);

		// b)
		System.out.println("\n b)");
		int[][] matrB = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
		};
		System.out.println(tilStreng(matrB));

		// c)
		System.out.println("\n c)");
		int[][] matrC = { 
				{ 1, 2, 3, 4 }, 
				{ 2, 4, 6 }, 
				{ 69, 420 } 
		};
		skrivUt(skaler(42, matrC));

		// d)
		System.out.println("\n d)");
		int[][] matrD1 = { 
				{ 1, 2, 3, 4 }, 
				{ 3, 4, 5, 6 }, 
				{ 6, 7, 8, 9 } 
		};
		int[][] matrD2 = { 
				{ 1, 2, 3, 4 }, 
				{ 3, 4, 5, 6 }, 
				{ 6, 7, 8, 9 } 
		};

		System.out.println(erLik(matrD1, matrD2));
	}
}
