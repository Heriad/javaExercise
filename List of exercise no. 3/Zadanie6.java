import java.util.Scanner;
import java.util.Random;

public class Zadanie3
{
	public static void main(String args[]){
		
		System.out.print("Wprowadź wyraz do zaszyfrowania: ");
		Scanner wyraz = new Scanner(System.in);
		String napis = wyraz.nextLine();
		
		String szyfr = "";
		for(int i = 0; i < napis.length(); i++)
		{
			if(napis.charAt(i) == 'a')
			{
				szyfr += 7;
			}
			else if(napis.charAt(i) == 'd')
			{
				szyfr += 1;
			}
			else if(napis.charAt(i) == 'f')
			{
				szyfr += 9;
			}
			else
			{
				szyfr += napis.charAt(i);
			}
		}
		System.out.println(szyfr);
	}
}