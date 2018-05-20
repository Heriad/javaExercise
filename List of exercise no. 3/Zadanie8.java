import java.util.Scanner;

public class Zadanie8{
	public static void main(String args[]){
		
		System.out.print("Wprowadź wyraz: ");
		Scanner wyraz = new Scanner(System.in);
		String napis = wyraz.nextLine();
		
		String napis2 = "";
		System.out.println("Długość wyrazu wynosi: "+napis.length());
		
		String samogloski = "aAąĄeEęiIoOÓuUyY";
		
		for(int i = 0; i < napis.length(); i++)
		{
		    for(int j = 0; j < samogloski.length(); j++)
			{
				if(napis.charAt(i) == samogloski.charAt(j))
				{
					System.out.println("Znaleziona samogłoska: "+samogloski.charAt(j));
					break;
				}
			}
		}
		
		for(int i = napis.length()-1; i >= 0; i--)
		{
			napis2 += napis.charAt(i);
		}
		System.out.println("Odwrócony wyraz: "+napis2);
	}
}