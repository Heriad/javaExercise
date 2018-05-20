import java.util.Scanner;

public class Zadanie8{
	public static void main(String args[]){
		
		System.out.print("Podaj naturalną liczbę całkowitą większą od dwóch: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		System.out.println("Oto liczby pierwsze mniejsze od: "+n);
		int i = 2;

		while(n > i)
		{
			int d = 2;
			while(i % d != 0)
			{
				d += 1;
			}
			if(i == d)
			{
				System.out.println(i);
			}
			i += 1;
		}
	}
}