import java.util.Scanner;

public class Zadanie4{
	public static void main(String args[]){
		
		System.out.print("Podaj a: ");
		Scanner liczba1 = new Scanner(System.in);
		float a = liczba1.nextFloat();
		
		System.out.print("Podaj b: ");
		Scanner liczba2 = new Scanner(System.in);
		float b = liczba2.nextFloat();
		
		float obw, pole;
		
		if(a >= 0 && b >= 0)
		{
			System.out.print("Wybierz co ma zostać obliczone. " +" \n" + "1 - obwod, 2 - pole" + "\n"+"Wybór: ");
			Scanner liczba3 = new Scanner(System.in);
			float wybor = liczba3.nextFloat();
			
			if(wybor == 1)
			{
				obw = a*2+b*2;
				System.out.println("Obwód prostokąta wynosi: "+obw);
			}
			else if(wybor == 2)
			{
				pole = a*b;
				System.out.println("Pole prostokąta wynosi: "+pole);
			}
			else
			{
				System.out.println("Wprowadzono błędne dane!");
			}		
		}
		else
		{
			System.out.println("Wprowadzone dane nie są prawidłowe!");
		}	
}
}