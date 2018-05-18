import java.util.Scanner;

public class Zadanie3{
	public static void main(String args[]){
		
		System.out.print("Podaj liczbę: ");
		Scanner liczba = new Scanner(System.in);
		int a = liczba.nextInt();
		
		int rozw = 1;
		
		if(a == rozw)
		{
			System.out.print("Podana liczba jest rozwiązaniem równania x^3 - 5x + 4 = 0");
		}
		else
		{
			System.out.print("Podana liczba nie jest rozwiązaniem równania x^3 - 5x + 4 = 0");
		}
}
}