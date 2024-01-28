import java.util.Arrays;

/**
 * Klasa App demonstrująca użycie tablic.
 */
public class App {
	public void tableOperations() {
		int[] table1, table2;

		table1 = new int[5];
		table2 = new int[]{2, 4, 7, 3, 6};

		for(int i = 0; i < table2.length; i++){
			System.out.println("Element [" + i + "] to "+ table2[i]);
		}

		for(int i = 0; i < table2.length; i++){
			table1[i] = table2[table2.length - i - 1];
		}

		if( Arrays.equals(table1, table2)) {
			System.out.println("W obu tablicach jest to samo");
		} else {
			System.out.println("Tablice mają różną zawartość");
		}

		for(int i : table1){                       // for-each i in table1
			System.out.println("Element " + i);
		}

		System.out.println("Największy element w tablicy: " + findMaxElement(table1));
		System.out.println("Suma elementów tablicy: " + sumOfElements(table1));
	}

	/**
	 * Zwraca największy element w tablicy.
	 * Jeśli tablica jest pusta lub nie istnieje, to zwracana jest wartość 0.
	 *
	 * @param t przeszukiwana tablica
	 * @return największa wartość w tablicy lub 0
	 */
	public int findMaxElement(int[] t) {
		if( t == null || t.length == 0)
			return 0;

		int max = t[0];
		for(int element : t) {
			if( max < element ) {
				max = element;
			}
		}

		return max;
	}

	/**
	 * Zwraca sumę elementów tablicy liczb całkowitych
	 * @param table tablica sumowanych liczb
	 * @return suma elementów lub 0 jeśli tablica nie istnieje
	 */
	public int sumOfElements(int[] table) {
		if(table == null) {
			return 0;
		}

		int sum = 0;

		for(int element : table) {
			sum += element;
		}

		return sum;
	}
}
