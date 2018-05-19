import java.util.Scanner;

public class Zadanie1{
	public static void main(String args[]){
		
		System.out.print("Podaj całkowitą dodanią liczbę n: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		if(n > 0)
		{
			int i = 0;
			while(n > i)
			{
				System.out.println("I like programming in Java");
				i++;
			}
		}
		else
		{
			System.out.print("Wprowadzona liczba n jest niepoprawna");
		}
		
		
	}
}