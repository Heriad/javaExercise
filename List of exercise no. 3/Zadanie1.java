import java.util.Scanner;

public class Zadanie1{
	public static void main(String args[]){
		
		int suma = 0;
		int a = 6;
		
		for(int i = 1; a < 2000; i++)
		{
		    System.out.println("a"+i+": "+a);
		    suma += a;
		    a += 9;
		}
		System.out.print("Suma wynosi: "+suma);
	}
}
