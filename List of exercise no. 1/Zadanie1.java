import java.util.Scanner;

public class Zadanie1{
	public static void main(String args[]){
		
		System.out.print("Podaj liczbę: ");
		Scanner liczba = new Scanner(System.in);
		int a = liczba.nextInt();
		
		double a_kwad, a_szesc;
		
		a_kwad = Math.pow(a, 2);
		a_szesc = Math.pow(a, 3);
		
		System.out.println("Kwadrat liczby wynosi: "+a_kwad);
		System.out.println("Sześcian liczby wynosi: "+a_szesc);
	}
}
