import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Zadanie5{
	public static void main(String args[]){
	
		System.out.print("Podaj liczbe wierszy macierzy: ");
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
		
		System.out.print("Podaj liczbe kolumn macierzy: ");
        Scanner k = new Scanner(System.in);
        int m = k.nextInt();
		
		List<List<Object>> lista = new LinkedList<List<Object>>();
		List<List<Object>> lista2 = new LinkedList<List<Object>>();
		
		// pierwsza macierz
		for(int i = 0; i < n; i++)
		{
			List<Object> listawew = new LinkedList<Object>();
			lista.add(listawew);
			
			for(int j = 0; j < m; j++)
			{
				System.out.print("Podaj element "+(i+1)+" "+(j+1)+" macierzy: ");
				Scanner liczba = new Scanner(System.in);
				int element = liczba.nextInt();
				listawew.add(element);
			}
		}
		
		System.out.print("Twoja pierwsza macierz: ");
		for(int i = 0; i < n; i++)
		{
			System.out.println();
			for(int j = 0; j < m; j++)
			{
				System.out.print(lista.get(i).get(j)+"\t");
			}
		}
		// druga macierz
		System.out.println();
		for(int i = 0; i < n; i++)
		{
			List<Object> listawew2 = new LinkedList<Object>();
			lista2.add(listawew2);
			
			for(int j = 0; j < m; j++)
			{
				System.out.print("Podaj element "+(i+1)+" "+(j+1)+" macierzy: ");
				Scanner liczba = new Scanner(System.in);
				int element = liczba.nextInt();
				listawew2.add(element);
			}
		}
		
		System.out.print("Twoja druga macierz: ");
		for(int i = 0; i < n; i++)
		{
			System.out.println();
			for(int j = 0; j < m; j++)
			{
				System.out.print(lista2.get(i).get(j)+"\t");
			}
		}
		System.out.println();
		// dodawanie macierzy
		System.out.println("Macierz powstała po dodaniu: ");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print((int)lista.get(i).get(j) + (int)lista2.get(i).get(j)+"\t");
			}
			System.out.println();
		}
	}
}