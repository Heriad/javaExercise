import java.util.Scanner;

public class Zadanie11{
	public static void main(String args[]){
		
		System.out.print("Podaj dodatnią natrualną liczbę większą od jedności: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		System.out.println("Rozkład na czynniki pierwsze:");

		int dzielnik = 2;
			
		while(n >= dzielnik)
		{
			if(n % dzielnik == 0)
			{
				n = n / dzielnik;
				System.out.println(dzielnik);
			}
			else
			{
				dzielnik++;
			}
		}
	}
}