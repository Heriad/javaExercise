import java.util.Scanner;
import java.util.Random;

public class Zadanie3{
	public static void main(String args[]){
		
		int rozw;
		int punkty = 0;
		int i = 1;
		while(i <= 10)
		{
			Random liczba1 = new Random();
			int a = liczba1.nextInt(9) + 2;
		
			Random liczba2 = new Random();
			int b = liczba2.nextInt(9) + 2;
			
			rozw = a * b;
			
			System.out.println(i+"."+"Podaj wynik działania: "+a+"*"+b);
			System.out.print("Odpowiedź: ");
			Scanner liczba3 = new Scanner(System.in);
			int wynik = liczba3.nextInt();
			
			if(rozw == wynik)
			{
				punkty++;
			}
			i++;
		}
		System.out.println("Twój wynik: "+punkty+"/10");
	}
}