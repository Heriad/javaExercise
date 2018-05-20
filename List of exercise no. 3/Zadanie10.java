import java.util.Scanner;

public class Zadanie10{
	public static void main(String args[]){
		
		System.out.print("Wprowadź wyraz: ");
		Scanner wyraz = new Scanner(System.in);
		String napis = wyraz.nextLine();
		
		System.out.print("Wybierz znak do usunięcia z wyrazu: ");
		Scanner znaczek = new Scanner(System.in);
		String znak = znaczek.nextLine();
		
		String napis2 = "";
		
		for(int i = 0; i <= napis.length()-1; i++)
		{
			if(napis.charAt(i) != znak.charAt(0))
			{
				napis2 += napis.charAt(i);
			}
		}
		System.out.print(napis2);
	}
}