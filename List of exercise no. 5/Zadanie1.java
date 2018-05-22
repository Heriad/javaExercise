import java.util.Scanner;

public static float obj(float a, float b, float c)
{
	return a*b*c;
}

public class Zadanie1{
	public static void main(){
	
		System.out.print("Podaj a: ");
		Scanner liczba1 = new Scanner(System.in);
		float a = liczba1.nextFloat();
		
		System.out.print("Podaj b: ");
		Scanner liczba2 = new Scanner(System.in);
		float b = liczba2.nextFloat();
		
		System.out.print("Podaj c: ");
		Scanner liczba3 = new Scanner(System.in);
		float c = liczba3.nextFloat();
		
		System.out.print(obj(a, b, c));
	
	}
}