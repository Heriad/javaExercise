import java.util.Scanner;

public class Zadanie4{
	public static void main(String args[]){
		
		System.out.print("Podaj całkowitą liczbę dodatnią: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		if(n > 0)
		{
			while(n > 0)
			{
				if(n % 2 == 0)
				{
					System.out.println(n);
				}
				n--;
			}	
		}
		else
		{
			System.out.print("Wprowadzono błędną liczbę!");
		}
	}	
}