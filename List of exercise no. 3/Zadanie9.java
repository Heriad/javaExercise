import java.util.Scanner;

public class Zadanie9{
	public static void main(String args[]){
		
		System.out.print("Wprowadź wyraz: ");
		Scanner wyraz = new Scanner(System.in);
		String napis = wyraz.nextLine();
		
		int i = 0;

		while(napis.charAt(i) == napis.charAt(napis.length()-1-i) && i < napis.length()/2)
		{
		    i++;
		}
		if(i == napis.length()/2)
		{
			System.out.print("To jest palindrom");
		}
		else
		{
			System.out.print("To nie jest palindrom");
		}
	}
}