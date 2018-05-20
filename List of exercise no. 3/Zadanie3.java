import java.util.Scanner;

public class Zadanie3
{
	public static void main(String args[]){
		
		int wek1[] = new int[3];
		int wek2[] = new int[3];
		int suma_wek[] = new int[3];
		int iloczyn_skal = 1;
		
		System.out.print("Wprowadź współrzędne pierwszego wektora: ");
		for(int i = 0; i <= 2; i++)
		{
			Scanner liczba1 = new Scanner(System.in);
			wek1[i] = liczba1.nextInt();
		}
		
		System.out.print("Wprowadź współrzędne drugiego wektora: ");
		for(int i = 0; i <= 2; i++)
		{
			Scanner liczba2 = new Scanner(System.in);
			wek2[i] = liczba2.nextInt();
		}
		
		for(int i = 0; i <= 2; i++)
		{
			suma_wek[i] = wek1[i] + wek2[i];
			iloczyn_skal += wek1[i] * wek2[i];
		}
		
		System.out.println("Pierwszy wektor: ["+wek1[0]+","+wek1[1]+","+wek1[2]+"]");
		System.out.println("Drugi wektor: ["+wek2[0]+","+wek2[1]+","+wek2[2]+"]");
		
		if(iloczyn_skal == 0)
		{
			System.out.println("Wektory są prostopadłe");
		}
		else
		{
			System.out.println("Wektory nie są prostopadłe");
		}
		
		if(wek1[0]*wek2[1] == wek1[1]*wek2[0] && wek1[1]*wek2[2] == wek1[2]*wek2[1] && wek1[0]*wek2[2] == wek1[2]*wek2[0])
		{
			System.out.println("Wektory są równoległe");
		}
		else
		{
			System.out.println("Wektory nie są równoległe");
		}
	}
}