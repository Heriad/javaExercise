import java.util.Scanner;
import java.lang.Math;

public class Zadanie7{
	public static void main(String args[]){
		
		System.out.print("Podaj a: ");
		Scanner liczba1 = new Scanner(System.in);
		double a = liczba1.nextDouble();
		
		System.out.print("Podaj b: ");
		Scanner liczba2 = new Scanner(System.in);
		double b = liczba2.nextDouble();
		
		System.out.print("Podaj c: ");
		Scanner liczba3 = new Scanner(System.in);
		double c = liczba3.nextDouble();
		
		System.out.println("Równanie kwadratowe ma postać: "+a+"x^2"+"+"+b+"x"+"+"+c);
		
		if(a != 0)
		{
			double delta, x1, x2;
			delta = Math.pow(b,2)-4*a*c;
			System.out.println("Delta wynosi: "+delta);
			if(delta > 0)
			{
				x1 = (-b-Math.sqrt(delta))/(2*a);
				x2 = (-b+Math.sqrt(delta))/(2*a);
				
				System.out.println("x1 wynosi: "+x1);
				System.out.println("x2 wynosi: "+x2);
			}
			else if(delta == 0)
			{
				x1 = -b/(2*a);
				
				System.out.println("x1 wynosi: "+x1);
			}
			else
			{
				delta = Math.abs(delta);
				x1 = (-b-Math.sqrt(delta))/(2*a);
				x2 = (-b+Math.sqrt(delta))/(2*a);
				
				System.out.println("x1 wynosi: "+x1+"i");
				System.out.println("x2 wynosi: "+x2+"i");
			}
		}
}
}