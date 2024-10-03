import java.util.Scanner;

public class IntervaloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Intervalo i1 = new Intervalo(1, 2);
		
		System.out.print("Primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.print("Segundo número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2)
		{
			System.out.println("Os valores serão invertidos");
			int num3 = 0;
			num3 = num1;
			num1 = num2;
			num2 = num3;
		}
		
		i1.setPrimeiroNumero(num1);
		i1.setSegundoNumero(num2);
		
		System.out.println();
		System.out.println("Números que estão entre " + i1.getPrimeiroNumero() + " " + i1.getSegundoNumero() + " são:");
		for (int i = num1+1; i < num2; i++)
		{
			System.out.print(i + " ");
		}
		
	
		input.close();
	}

}