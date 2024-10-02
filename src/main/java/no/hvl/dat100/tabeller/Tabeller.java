package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[ ");
		for (int i = 0; i< tabell.length; i++) {
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(tabell[i]);
		}
		System.out.println(" ]");
	}
	

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tabstr = ("[ ");
		
		for (int i = 0; i< tabell.length; i++) {
			if (i > 0) {
				tabstr = tabstr + ", ";
			}
			String verdi = String.valueOf(tabell[i]);
			tabstr = tabstr + verdi;
		}
		tabstr = tabstr + " ]";
		return tabstr;
	}

	// c)
	public static int summer(int[] tabell) {

		int tabsum = 0;
		
		for (int i = 0; i< tabell.length; i++) {
			
			int x = tabell[i];
			tabsum = tabsum + x;
		}
		return tabsum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean x = false;
		for (int i = 0; i<tabell.length; i++) {
			int check = tabell[i];
			if (check == tall) {
				x = true;
			}
			
		}
		return x;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int x = -1;
		for (int i = tabell.length-1; i>-1; i--) {
			int check = tabell[i];
			if (check == tall) {
				x = i;
			}
		}
		return x;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int t = tabell.length;
		int[] revers = new int[t];
		int j = t;
		for (int i = 0; i<t; i++) {
			j--;
			
			revers [j]= tabell[i];
		}
		
		
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean x = true;
		for (int i = 0; i<tabell.length-1; i++) {
			if (tabell[i]>tabell[i+1]) {
				x = false;
			}
		}
		
		return x;
		}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int t1 = tabell1.length;
		int t2 = tabell2.length;
		int t = t1 + t2;
		int[] joined = new int[t];
		
		for (int i = 0; i<t; i++) {
			if (i<t1) {
				joined[i] = tabell1[i];
			} if (i>t1-1) {
			joined[i] = tabell2[i-t1];
			}
		}
		
		return joined;
	}
	
	
	public static void main (String[] args) {
		
		//a) 
		System.out.println(" a)");
		int[] tabella = {1, 2, 3, 4, 5};
		skrivUt(tabella);
		
		//b)
		System.out.println("\n b)");
		int[] tabellb = {42, 67, 89};
		System.out.println (tilStreng(tabellb));
		
		//c)
		System.out.println("\n c)");
		int[] tabellc = {42, 67, 89};
		System.out.println ("Sum av tabell: " + (summer(tabellc)));
		
		//d)
		System.out.println("\n d)");
		int[] tabelld = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(finnesTall(tabelld, 8));
		
		//e)
		System.out.println("\n e)");
		int[] tabelle = {1, 2, 3, 4, 2, 5, 4, 6, 3};
		System.out.println(posisjonTall(tabelle, 3));
		
		//f)
		System.out.println("\n f)");
		int[] tabellf = {1, 2, 3, 4, 5, 6};
		skrivUt(reverser(tabellf));
		
		//g)
		System.out.println("\n g)");
		int[] tabellg = {1, 2, 3, 4, 5, 6}; 
		System.out.println(erSortert(tabellg));
		
		//h)
		System.out.println("\n h)");
		int [] tabellh1 = {1, 2, 3, 4};
		int [] tabellh2 = {5, 6, 7, 8, 9, 10, 11};
		skrivUt(settSammen(tabellh1, tabellh2));
	}
}
