package Esercizi;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> contattoMap = new HashMap<>();

		contattoMap.put("Matteo", 3456);
		contattoMap.put("Andrea", 1234);
		contattoMap.put("Emanuele", 2673);
		contattoMap.put("Marianna", 8435);

		System.out.println(contattoMap.entrySet());

//		if (contattoMap.containsValue(3456)) {
//			System.out.println(contattoMap.entrySet());
//		}

		// Ex2
		contattoMap.remove("Andrea");

		System.out.println(contattoMap.entrySet());

		// Ex 3
//		
//		for(Map.Entry<String,Integer> entry: contattoMap.entrySet()) {
//			int numeroTelefono = entry.getValue();
//			int nome = entry.getKey();
//			
//			if(numeroTelefono == 3456) {
//				System.out.println();
//			}
//		}
//		for (String key : contattoMap.keySet()) {
//			int numeroTelefono = entry.getValue();
//			if (numeroTelefono == 3456) {
//				System.out.println(contattoMap.get(key));
//			}
//		}
		for (Map.Entry<String, Integer> entry : contattoMap.entrySet()) {
			String nome = entry.getKey();
			int numeroTelefono = entry.getValue();

			if (numeroTelefono == 3456) {
				System.out.println("Contatto:" + " " + nome + " " + numeroTelefono);
			} else {
				System.out.println("Numero non trovato");
			}
		}
	}

}
