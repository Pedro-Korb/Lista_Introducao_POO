import java.util.Scanner;

public class NomeCompletoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);

		NomeCompleto n1 = new NomeCompleto("XXXXXX", "YYYYYYY");

		System.out.print("Nome: ");
		String name = input.nextLine();

		System.out.print("Sobrenome: ");
		String last_name= input.nextLine();

		n1.setNome(name);
		n1.setSobrenome(last_name);

		System.out.println("Seu nome completo é: " + n1.getNome() + " " +  n1.getSobrenome());

		input.close();

	}

}
