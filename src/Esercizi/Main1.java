package Esercizi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setParole = new HashSet<>(); // set distinte
		Set<String> setParoleDuplicate = new HashSet<>(); // set duplicate
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci N  elementi da inserire nei set: ");
		int n = in.nextInt();

//		ArrayList<String> s = new ArrayList<>[n];
//		Iterator<String> i = s.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next() + "Inserisci parola");
//		}

		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Inserisci la parola");
			s[i] = in.next();
		}
		for (String parola : s) {
			if (setParole.contains(parola)) {
				setParoleDuplicate.add(parola);
			} else {
				setParole.add(parola);
			}
		}
		System.out.println("set parole duplicate:" + setParoleDuplicate);
		System.out.println("length di parole distinte:" + setParole.size());
		System.out.println("set di parole distinte: " + setParole);
		in.close();
	}

}
