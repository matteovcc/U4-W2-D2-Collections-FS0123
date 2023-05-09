package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();

		myList.add("Mario");
		myList.add("Matteo");
		myList.add("Luca");

		myList.remove(2);

		System.out.println(myList);

		for (String string : myList) {
			System.out.println(string + " ");
		}

		String primoNome = myList.get(0);
		System.out.println("il primo nome è" + " " + primoNome);
		System.out.println("il suo indice è" + " " + myList.indexOf(primoNome));

		// TIPI PRIMITIVI
		List<Integer> x = new ArrayList<>();
		x.add(1);

		List<Integer> listaInteri = new ArrayList<Integer>();
		listaInteri.add(23);
		listaInteri.add(2);
		listaInteri.add(3);

		for (i = 0; i < listaInteri.size(); i++) {
			int newList = listaInteri.get(i);
			System.out.print(i + newList + " ");
		}

		LinkedList<String> myLinkedList = new LinkedList<>();
		myLinkedList.addFirst("Ciao");
		myLinkedList.push("lillo");
		System.out.println(myLinkedList.poll());

		// Iterators

		ArrayList<String> characters = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

//		characters.forEach(c -> {
//			if(c.equals("a")) {
//				characters.remove(0);
//			}
//			System.out.println(c);
//		}); //QUESTO è SBAGLIATO se voglio iterare e rimuovere un elemento dalla lista

		// BIsogna usare l'iteratore
		Iterator<String> i = characters.iterator();
		while (i.hasNext()) {
			String current = i.next();
			System.out.println(current);
			if (current.equals("a")) {
				i.remove();
			}
		}

		for (String string : characters) {
			System.out.println(string);
		}

		// I MAP

		Map<String, String> studentsMap = new HashMap<>();
		studentsMap.put("Giacomo", "Maschio");
		studentsMap.put("Laura", "Femmina");

		System.out.println(studentsMap);

		for (Entry<String, String> key : studentsMap.entrySet()) {
//			System.out.println(studentsMap.get(key));
			System.out.println(studentsMap.entrySet());
		}

	}

}
