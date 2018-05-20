import java.util.Scanner;

public class Zadanie2{
	public static void main(String args[]){
		
		int sum_iloczyn = 1;
		int a = 10;
		
		for(int i = 1; a > -30; i++)
		{
			System.out.println("a"+i+": "+a);
		    sum_iloczyn *= a;
			a -= 6;
		}
		System.out.print("Iloczyn wynosi: "+sum_iloczyn);
	}
}