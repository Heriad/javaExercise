import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Zadanie7_4{
	public static void main(String args[]){
	
		System.out.print("Podaj n: ");
		Scanner liczba = new Scanner(System.in);
		int n = liczba.nextInt();
	
		List<Object> lista = new LinkedList<Object>();
		Random los = new Random();
		
		int low = 1;
		int high = 1000;
		int wynik = 0;
		
		for(int i = 1; i <= n; i++)
		{
			int result = los.nextInt(high-low) + low;
			lista.add(result);
			wynik += result;
			
			if(result == 333)
			{
				System.out.println("W liście znajduje się liczba 333");
			}
		}
		System.out.println(lista);
		
		double średnia_aryt = wynik / lista.size();
		System.out.println("Średnia arytmetyczna wynosi: " + średnia_aryt);
		
		Collections.sort(lista);
		System.out.println(lista);
}
}