import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Zadanie4{
    public static void main(String[] args){
		
		List<List<Object>> lista = new LinkedList<List<Object>>();
		
		for(int i = 0; i < 2; i++)
		{
			List<Object> listawew = new LinkedList<Object>();
			lista.add(listawew);
			
			for(int j = 0; j < 2; j++)
			{
				System.out.print("Podaj element macierzy "+(i+1)+" "+(j+1)+": ");
				Scanner liczbawew = new Scanner(System.in);
				int liczba = liczbawew.nextInt();
				listawew.add(liczba);
			}
		}
		System.out.print("Twoja macierz: ");
		for(int i = 0; i < 2; i++)
		{
		    System.out.println();
			for(int j = 0; j < 2; j++)
			{
				System.out.print(lista.get(i).get(j)+"\t");
			}
		}
		int wyznacznik = (int)lista.get(0).get(0) * (int)lista.get(1).get(1) - (int)lista.get(1).get(0) * (int)lista.get(0).get(1);
		System.out.println();
		System.out.println("Wyznacznik macierzy wynosi: "+wyznacznik);
		
	}
}