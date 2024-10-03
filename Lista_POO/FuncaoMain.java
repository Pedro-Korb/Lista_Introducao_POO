import java.util.Scanner;

public class FuncaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Primeiro valor: ");
		int num1 = input.nextInt();
		
		System.out.print("Segundo valor: ");
		int num2 = input.nextInt();
		
		Funcao fun = new Funcao(num1, num2);
		
		System.out.println("\n" + fun);
		
		input.close();
	}
}
