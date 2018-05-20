import java.util.Scanner;
import java.util.Random;

public class Zadanie3
{
	public static void main(String args[]){
		
		String[] tab = new String[5];
		System.out.print("Wprowadź pięć różnych powitań: ");
		
		for(int i = 0; i < 5; i++)
		{
			Scanner wyraz = new Scanner(System.in);
			String wyr = wyraz.nextLine();
			tab[i] = wyr;
		}
		Random losuj = new Random();
		int los = losuj.nextInt(4)+0;
		
		System.out.print(tab[los]);
	}
}