import java.util.Scanner;

public class Zadanie11{
	public static void main(String args[]){
		
		System.out.print("Podaj podwójną silnie n: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		int i = n-2;
		int wynik = n;
		
		while(i > 0)
		{
		    	wynik *= i;
		    	i = i-2;
		}
		System.out.print("Silnia wynosi: "+wynik);
	}
}