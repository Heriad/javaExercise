import java.util.Scanner;

public class Zadanie10{
	public static void main(String args[]){
		
		System.out.print("Podaj silnie n: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		int i = 1;
		int wynik = 1;
		
		while(n >= i)
		{
			wynik *= i;
			i++;
		}
		System.out.print("Silnia wynosi: "+wynik);
	}
}