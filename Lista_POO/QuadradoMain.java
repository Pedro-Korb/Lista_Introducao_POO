import java.util.Scanner;

public class QuadradoMain {
	public static void main(String[] Args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lado do quadrado: ");
		double lado = input.nextDouble();
		
		Quadrado q1 = new Quadrado(lado);
		
		System.out.println("Área do quadrado: " + q1.CalculoArea() + "m²");
		
		input.close();
	}
}
