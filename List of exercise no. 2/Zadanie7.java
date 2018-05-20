import java.util.Scanner;

public class Zadanie7{
	public static void main(String args[]){
		
		System.out.print("Podaj dodanią liczbę naturalną a: ");
		Scanner liczba1 = new Scanner(System.in);
		int a = liczba1.nextInt();
		
		System.out.print("Podaj dodanią liczbę naturalną b: ");
		Scanner liczba2 = new Scanner(System.in);
		int b = liczba2.nextInt();
		
		while(a != b)
		{
			if(a > b)
			{
				a -= b;
			}
			else if(b > a)
			{
				b -= a;
			}
		}
		System.out.print("Największy wspólny dzielnik wynosi: "+a);
	}
}