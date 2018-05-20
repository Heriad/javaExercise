import java.util.Scanner;

public class Zadanie2{
	public static void main(String args[]){
		
		System.out.print("Podaj liczbę: ");
		Scanner liczba = new Scanner(System.in);
		int a = liczba.nextInt();
		
		if(a % 4 == 0)
		{
			System.out.print("Wprowadzona liczba jest podzielna przez 4");
		}
		else
		{
			System.out.print("Wprowadzona liczba nie jest podzielna przez 4");
		}
	}
}