import java.util.Scanner;
import java.util.Random;

public class Zadanie3{
	public static void main(String args[]){
		
		int tab[] = new int[49];
		int tab2[] = new int[6];
		
		System.out.print("Wprowadź ilość losowanych 6-elementowych tablic: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		for(int j = 1; j <= n; j++)
		{
			for(int i = 0; i < tab.length; i++)
			{
				tab[i] = i+1;
			}
		
			for(int i = 0; i < tab2.length; i++)
			{
				Random losowa = new Random();
				int los = losowa.nextInt(48)+1;
				tab2[i] = tab[los];
			}
			
			for(int i = 0; i < tab2.length; i++)
			{
				System.out.print(tab2[i]+", ");
			}
			System.out.println();
		}	
	}
}