import java.util.Scanner;

public class TrabalhoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Salário por hora: ");
		double sal = input.nextDouble();
		
		System.out.print("Horas trabalhadas no mês: ");
		double hor = input.nextDouble();
		
		Trabalho t1 = new Trabalho(sal, hor);
		
		System.out.println("\n" + t1);
		
		input.close();
	}

}
