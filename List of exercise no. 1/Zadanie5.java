import java.util.Scanner;

public class Zadanie5{
	public static void main(String args[]){
		
		System.out.print("Podaj długość promienia: ");
		Scanner promien = new Scanner(System.in);
		double r = promien.nextFloat();
		
		if(r > 0)
		{
			double obw, pole;
		
			pole = Math.PI * Math.pow(r, 2);
			System.out.println("Pole koła wynosi: "+pole);
		
			obw = 2* Math.PI * r;
			System.out.println("Obwód koła wynosi: "+obw);
		}
		else
		{
			System.out.println("Długość promienia nie może być ujemna!");
		}
}
}