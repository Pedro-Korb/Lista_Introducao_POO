import java.util.Scanner;

public class BancoMain {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Numero da conta: ");
		int n1 = input.nextInt();
		
		input.nextLine();
		System.out.print("Nome do proprietário: ");
		String name = input.nextLine();
		
		System.out.print("Saldo atual: ");
		double sl = input.nextDouble();
		
		Banco b1 = new Banco(n1, name, sl);
		
		boolean escolha = true;
		int saque_deposito;
		while (escolha)
		{
			do
			{
				System.out.print("Deseja sacar ou depositar? [0] Sair [1] Sacar [2] Depositar: ");
				saque_deposito = input.nextInt();
				
				if (saque_deposito == 0)
				{
					escolha = false;
					break;
				}
					
				
				else if (saque_deposito < 0 || saque_deposito > 2)
					System.out.println("ERRO! Resposta inválida");
				
				
			} while (saque_deposito < 0 || saque_deposito > 2);
			
			if (saque_deposito == 1)
			{
				System.out.print("Valor para sacar: ");
				double n2 = input.nextDouble();
				b1.Saque(n2);
			}
			
			else if (saque_deposito == 2)
			{
				System.out.print("Valor para depósito: ");
				double n3 = input.nextDouble();
				
				b1.Deposito(n3);
			}
		}
		
		System.out.println();
		System.out.println(b1);
		
		input.close();
	}
}
