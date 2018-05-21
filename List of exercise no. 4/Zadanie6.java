import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class Zadanie6_4{
    public static void main(String args[]) {
		
		System.out.print("Podaj n: ");
		Scanner liczba = new Scanner(System.in);
	   	int n = liczba.nextInt();
	   	
		for(int j = 1; j <= n; j++)
		{
			List<Object> lista = new LinkedList<Object>();
			List<Object> lista_los = new LinkedList<Object>();
	    	
	    	for(int i = 1; i <= 49; i++)
	    	{
	    		lista.add(i);
	    	}
	    	Random los = new Random();
		
	    	for(int k = 1; k <= 6; k++)
	    	{
	    	    int randInx = los.nextInt(lista.size());
	    	    lista_los.add(lista.get(randInx));
	    	    lista.remove(randInx);
	    	}
	    	System.out.print(lista_los);
		}
    }
}