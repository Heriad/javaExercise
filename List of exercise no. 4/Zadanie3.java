import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Zadanie3{
	public static void main(String args[]){
	    
	    List<String> lista = new LinkedList<String>();
		System.out.print("Wprowadź pracownika: ");
		
		for(int i = 1; i <= 10; i++)
		{
		    System.out.print("Podaj dane: ");
			Scanner wyraz = new Scanner(System.in);
			String pracownik = wyraz.nextLine();
			lista.add(pracownik);
		}
		
		lista.add(2, "Andrzej Kalicki");
		Collections.sort(lista);
		System.out.print("Lista po sortowanaiu: "+lista);
		
		int dl = 11;
		int i = 0;
		
		while(i < dl)
		{
		    if(lista.get(i).charAt(0) == 'b' || lista.get(i).charAt(0) == 'B')
		    {
	            lista.remove(i);
	            dl--;
		    }
		    else
		    {
		        i++;
		    }
		}
		System.out.println("Ostateczna lista: "+lista);
	}
}