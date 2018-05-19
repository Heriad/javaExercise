import java.util.Scanner;
import java.util.Random;

public class Zadanie2{
	public static void main(String args[]){
		
		System.out.print("Podaj n: ");
		Scanner liczba1 = new Scanner(System.in);
		int n = liczba1.nextInt();
		
		int i = 0;
		int suma = 0;
		int iloczyn = 1;
		
		while( n > i)
		{
			Random liczba2 = new Random();
			int los = liczba2.nextInt(8) + 1;
			
			suma += los;
			iloczyn *= los;
			i++;
		}
		
		System.out.println("Suma wylosowanych liczb wynosi: "+suma);
		System.out.println("Iloczyn wylosowanych liczb wynosi: "+iloczyn);
	}
}