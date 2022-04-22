import java.io.*;
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args)
	{
		int n = 5; //sizeOfArray

		ArrayList<Integer> arrli = new ArrayList<Integer>(n); //ArrayList arr = new ArrayList(); 

		for (int i = 1; i <= n; i++)  //addingElementsToList
			arrli.add(i);

		
		System.out.println(arrli); // Printing elements

	
		arrli.remove(3); 	// Remove element at index 3
		System.out.println(arrli); //deletingElement

		
		for (int i = 0; i < arrli.size(); i++) // Printing elements one by one
			System.out.print(arrli.get(i) + " ");
	}

}


