import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;

public class Zadanie5{
	public static void main(String args[]) throws IOException, InterruptedException{
		
		System.out.print("Podaj długość promienia: ");
		Scanner promien = new Scanner(System.in);
		double r = promien.nextFloat();
		
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		
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