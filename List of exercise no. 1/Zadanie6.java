import java.util.Scanner;
import java.lang.Math;

public class Zadanie6{
	public static void main(String args[]){
		
		System.out.print("Podaj długość a: ");
		Scanner liczba1 = new Scanner(System.in);
		double a = liczba1.nextDouble();
		
		System.out.print("Podaj długość b: ");
		Scanner liczba2 = new Scanner(System.in);
		double b = liczba2.nextDouble();
		
		System.out.print("Podaj długość c: ");
		Scanner liczba3 = new Scanner(System.in);
		double c = liczba3.nextDouble();
		
		if(a > 0 && b > 0 && c > 0)
		{
			double pole_całk, objętość, przekątna;
			
			pole_całk = 2*(a*b+a*c+b*c);
			System.out.println("Pole powierzchni całkowitej wynosi; "+pole_całk);
			
			objętość = a*b*c;
			System.out.println("Objętość wynosi; "+objętość);
			
			przekątna = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
			System.out.print("Przekątna prostopadłościanu wynosi; "+przekątna);
		}
		else
		{
			System.out.print("Wprowadzone błędne dane!");
		}
	}
}