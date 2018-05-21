import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Zadanie2{
	public static void main(String args[]){
		
		List<Float> lista = new LinkedList<Float>();

		int suma = 0;
		for(int i = 1; i <= 100; i++)
		{
		    Random los = new Random();
		    float liczba = los.nextInt((50 - (-50))+1)+(-50);
		    lista.add(liczba);
			suma += liczba;
		}
		System.out.print(lista);
		System.out.println("Suma elementów listy wynosi: "+suma);
		
		for(int i = 0; i < 100; i++)
		{
		    if(lista.get(i) < 0)
			{
				System.out.println(lista.get(i));
			}
		}
		Collections.sort(lista);
		System.out.println("Posortowana lista: "+lista);
		
		float max = lista.get(0);
		for(int i = 0; i < 100; i++)
		{
		    if(lista.get(i) > max)
			{
				max = lista.get(i); 
			}
		}
		System.out.println("Największy element tablicy wynosi: "+max);
		
		for(int i = 0; i < 10; i++)
		{
		    Random los = new Random();
		    float liczba2 = los.nextInt((20 - (-20))+1)+(-20);
			lista.add(liczba2);
		}
		System.out.println("Lista z dodatkowymi elementami: "+lista);
	}
}