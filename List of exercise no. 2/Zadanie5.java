import java.util.Scanner;

public class Zadanie5{
	public static void main(String args[]){
		
		System.out.print("Podaj dodanią liczbę całkowitą: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		int i = 1;
		while(n >= i)
		{
			if(n % i == 0)
			{
				System.out.println("Dzielnik: "+i);
			}
			i++;
		}
	}
}