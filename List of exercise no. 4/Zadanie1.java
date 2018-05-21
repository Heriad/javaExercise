import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Zadanie1{
	public static void main(String args[]){
		
		List<Object> lista = new LinkedList<Object>();
		
		System.out.print("Wprowadź dziesięć liczb: ");
		int iloczyn = 1;
		for(int i = 1; i <= 10; i++)
		{
			Scanner liczba = new Scanner(System.in);
			int a = liczba.nextInt();
			lista.add(a);
			iloczyn *= a;
		}
		System.out.println("Iloczyn wprowadzonych liczb wynosi: "+iloczyn);
		
		int min = (int)lista.get(0);
		
		for(int i = 1; i < 10; i++)
		{
			if((int)lista.get(i) < min)
			{
				min = (int)lista.get(i);
			}
		}
		System.out.println("Lista: "+lista);
		System.out.println("Najmniejszy element listy: "+min);
		
		int i = 0;
		int dl = 10;
		while(i < dl)
		{
		    if((int)lista.get(i) == 2)
		    {
		        lista.remove(i);
		        dl--;
		    }
		    else if((int)lista.get(i) == 3)
		    {
		        lista.add(i,1);
		        lista.remove(i+1);
		        i++;
		    }
		    else
		    {
		        i++;
		    }
		}
		System.out.println("Nowa lista: "+lista);
	}
}