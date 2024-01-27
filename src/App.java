import java.util.Scanner;

public class App {
	public void tableOperations() {
		int[] table1, table2;

		table1 = new int[5];
		table2 = new int[]{2, 4, 7, 3, 9};

		for(int i = 0; i < table2.length; i++){
			System.out.println("Element [" + i + "] to "+ table2[i]);
		}

		for(int i = 0; i < table2.length; i++){
			table1[i] = table2[table2.length - i - 1];
		}

		for(int i : table1){                       // for-each i in table1
			System.out.println("Element " + i);
		}
	}

}
