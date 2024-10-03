import java.util.Scanner;

public class PostoGasolinaMain {

	public static void main(String[] args) {

		int metodo_abastecimento = 0;
		int rs1 = 0;
		int rs2 = 0;
		
		double valor_abastecer = 0;
		double litros = 0;
		double novo_valor = 0;
		
		Scanner input = new Scanner(System.in);
		PostoGasolina pg = new PostoGasolina("Gasolina", 6, litros, valor_abastecer);
		
		System.out.println(pg);
		System.out.println();
		
		do
		{
			System.out.print("Alterar o valor da gasolina [1] Sim [2] Não: ");
			rs1 = input.nextInt();
			if (rs1 < 1|| rs1 > 2)
			{
				System.out.println("ERRO! Valor inválido");
				System.out.println();
			}
			
		} while (rs1 < 1|| rs1 > 2);
		
		if (rs1 == 1)
		{
			do
			{
				System.out.print("Novo valor da gasolina: R$ ");
				novo_valor = input.nextDouble();
				if (novo_valor <= 0 || novo_valor > 10000)
				{
					System.out.println("ERRO! Digite um valor válido");
					System.out.println();
				}
			} while (novo_valor <= 0 || novo_valor > 10000);
			
			
			pg.AlterarValor(novo_valor);
		}
		
		do
		{
			System.out.print("Método de abastecimento [1] Por valor [2] Por litros: ");
			metodo_abastecimento = input.nextInt();
			if (metodo_abastecimento < 1 || metodo_abastecimento > 2)
			{
				System.out.println("ERRO! Digite uma resposta válida.");
				System.out.println();
			}
		} while (metodo_abastecimento < 1 || metodo_abastecimento > 2);

		if (metodo_abastecimento == 1)
		{
			do
			{
				System.out.print("Valor para abastecer (R$ " + pg.getValorLitro() +" Litro): R$ ");
				valor_abastecer = input.nextDouble();
				litros = valor_abastecer / pg.getValorLitro();
				
				pg.setTotal(valor_abastecer);
				pg.setQuantidadeCombustivel(litros);

				if (valor_abastecer <= 0 || valor_abastecer > 100000)
				{
					System.out.println("ERRO! Valor inválido");
					System.out.println();
				}

			} while (valor_abastecer <= 0 || valor_abastecer > 100000);

		}

		else if (metodo_abastecimento == 2)
		{
			do
			{
				System.out.print("Quantidade de litros:  ");
				litros = input.nextDouble();
				valor_abastecer = litros * pg.getValorLitro();
				
				pg.setTotal(valor_abastecer);
				pg.setQuantidadeCombustivel(litros);

				if (litros <= 0 || litros > 100000)
				{
					System.out.println("ERRO! Valor inválido");
					System.out.println();
				}

			} while (litros <= 0 || litros > 100000);
		}
		
		do
		{
			System.out.print("Alterar a quantidade da gasolina [1] Sim [2] Não: ");
			rs2 = input.nextInt();
			if (rs2 < 1|| rs2 > 2)
			{
				System.out.println("ERRO! Valor inválido");
				System.out.println();
			}
			
		} while (rs2 < 1|| rs2 > 2);
		
		
		if (rs2 == 1)
		{
			System.out.print("Quantidade de gasolina: ");
			double qt = input.nextDouble();
			
			pg.alterarQuantidadeCombustivel(qt);
		}
		
		System.out.println();
		System.out.println(pg);

		input.close();

	}
}
