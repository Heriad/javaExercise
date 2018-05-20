import java.util.Scanner;

public class Zadanie6{
	public static void main(String args[]){
		
		System.out.print("Podaj naturalną dodatnią liczbę a: ");
		Scanner liczba1 = new Scanner(System.in);
		int a = liczba1.nextInt();
		
		System.out.print("Podaj naturalną dodatnią liczbę b: ");
		Scanner liczba2 = new Scanner(System.in);
		int b = liczba2.nextInt();
        
        int i = 1;
		if(a > b)
		{
		    while(true)
		    {
		        int wynik = a * i;
		        if(wynik % b == 0)
		        {
		            System.out.print("Najmniejsza wspólna wielokrotnośc wynosi: "+wynik);
		            break;
		        }
		        i++;
		    }
		}
		else if(b > a)
		{
	    	while(true)
		    {
		        int wynik = b * i;
		        if(wynik % a == 0)
		        {
		            System.out.print("Najmniejsza wspólna wielokrotnośc wynosi: "+wynik);
		            break;
		        }
		        i++;
		    }
		}
		else if(a == b)
		{
		    System.out.print("Najmniejsza wspólna wielokrotnośc wynosi: "+a);
		}
	}
}