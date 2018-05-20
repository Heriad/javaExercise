import java.util.Scanner;

public class Zadanie9{
	public static void main(String args[]){
		
		System.out.print("Podaj n: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		int i = 3;
		int wynik = 0;
		int fib1 = 0;
		int fib2 = 1;
		
		System.out.println("Oto Ciąg Fibonacciego: ");
        System.out.println(wynik);
        System.out.println(wynik+1);

		while(n >= i)
		{	
			wynik = fib1 + fib2;
			fib1 = fib2;
			fib2 = wynik;
			System.out.println(wynik);
			i++;
		}
	}
}