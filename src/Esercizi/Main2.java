package Esercizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercise 1
		int n = 10;
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			myList.add((int) (Math.random() * 100) + 1);
		}
		myList.sort(null);
		System.out.println(myList);

		// Exercise 2
		List<String> initialList = new ArrayList<>();
		initialList.add("Ciao");
		initialList.add("Sono");
		initialList.add("Matteo");
		System.out.println(initialList);

		Collections.reverse(initialList);
		System.out.println(initialList);

		// Exercise 3
		List<Integer> pariDispari = new ArrayList<>();
		boolean isEven = true;
		pariDispari.add(0);
		pariDispari.add(1);
		pariDispari.add(2);
		pariDispari.add(3);
		pariDispari.add(4);

		for (int i = 0; i < pariDispari.size(); i++) {
			if (isEven && i % 2 == 0) {
				System.out.println(pariDispari.get(i));
			} else if (!isEven && i % 2 != 0) {
				System.out.println(pariDispari.get(i));
			}
		}

	}

}
