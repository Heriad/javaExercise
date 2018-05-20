import java.util.Scanner;

public class Zadanie7{
	public static void main(String args[]){
		
		System.out.print("Wprowadź wyraz: ");
		Scanner wyraz = new Scanner(System.in);
		String napis = wyraz.nextLine();
		
		for(int i = 0; i < napis.length()-2; i++)
		{
		    String napis2 = "";
			napis2 = "" + napis.charAt(i) + napis.charAt(i+1) + napis.charAt(i+2);
			System.out.println(napis2);
		}
	}
}