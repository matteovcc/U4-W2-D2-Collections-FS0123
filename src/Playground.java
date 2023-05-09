import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Il framwork collections è ricco di funzionalità e strutture dati , le
		 * interfacce principali sono : 1)List,2)Queue,3)Set,4)Map a Spanne le
		 * differenze generali sono che i SET non ammette ripetizioni di elementi, le
		 * LIST possiamo decidere l'ordine in cui inserire elementi,a cui puo accedere
		 * usando l'indice della loro posizione. i QUUEUE prevede operazioni di
		 * inserimento,rimozione e ispezione degli elementi,l'ordinamento è tipicamente
		 * First in First Out
		 */
		Set<Automobile> setAutomobile = new HashSet<Automobile>();

		SortedSet<Veicolo> sortedSetVeicolo = new TreeSet<Veicolo>();

		List<Automobile> listAutomobile = new ArrayList<Automobile>();

		Queue<Automobile> codaAutomobile = new LinkedList<Automobile>();

		/*
		 * le mappe defiiscie una funziona da chiavi a valori. ad una chiave è associato
		 * un valore.non è una collezzione in senso stretto. si può vedere il contenuto
		 * della mappa come un insieme (Set) di chiavi una collection di valori o un
		 * insieme di corrispondenze tra chiavi e valori. La sottointerfaccia SortedMap
		 * fornisce inoltre un ordine totale sulle chiavi
		 */

	}

}
