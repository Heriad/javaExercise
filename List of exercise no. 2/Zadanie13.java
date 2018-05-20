import java.util.Scanner;

public class Zadanie12{
	public static void main(String args[]){
		
		System.out.print("Podaj długość boku: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		System.out.print("Podaj znak: ");
		Scanner wyraz1 = new Scanner(System.in);
		String a = wyraz1.nextLine();
		
		while(n >= 0)
		{
		    int k = n;
			while(k >= 0)
			{
				System.out.print(a);
				k--;
			}
			System.out.println();
			n--;
		}
	}
}

/*
int dl = n;
		while(n >= 0)
		{
		    int k = dl;
			while(k >= 0)
			{
				System.out.print(a);
				k--;
			}
			System.out.println();
			n--;
		}
*/