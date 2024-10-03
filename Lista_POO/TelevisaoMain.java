import java.util.Scanner;

public class TelevisaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*10. Faça um programa que simule um televisor criando-o como um objeto. O
		uusário deveria ser capaz de informar o número do canal e aumentar ou
		diminuir o volume. Certifique-se de que o número do canal e o nível do
		volume permanecem dentro de faixas válidas.*/

		Scanner input = new Scanner(System.in);

		int canal = 0;
		int volume = 0;
		int con = 0;
		int rs = 0;
		int canal1 = 0;


		boolean continuar = true;

		do 
		{
			System.out.print("Número do canal (1 - 100): ");
			canal = input.nextInt();
			if (canal < 0 || canal >= 100)
			{
				System.out.println("ERRO! Digite um valor válido\n");
			}

		} while (canal < 0 || canal >= 100);

		do 
		{
			System.out.print("Volume (1 - 100): ");
			volume = input.nextInt();
			if (volume < 0 || volume >= 100)
			{
				System.out.println("ERRO! Digite um valor válido\n");
			}

		} while (volume < 0 || volume >= 100);

		Televisao tv = new Televisao(canal, volume);

		while (continuar)
		{
			do
			{
				System.out.print("Deseja aumentar ou diminuir o volume? [1] aumentar [2] diminuir [3] sair: ");
				rs = input.nextInt();

				if (rs < 1 || rs > 3)
				{
					System.out.println("ERRO! Digite uma resposta válida\n");
				}
			} while (rs < 1 || rs > 3);

			if (rs == 1)
			{
				System.out.print("Aumentar o volume para quanto? ");
				int aumento_volume = input.nextInt();
				tv.AumentarVolume(aumento_volume);
			}

			else if (rs == 2)
			{
				System.out.print("Aumentar o volume para quanto? ");
				int diminuir_volume = input.nextInt();
				tv.DiminuirVolume(diminuir_volume);
			}
			
			do
			{
				System.out.print("Deseja mudar de canal? [1] mudar [2] sair: ");
				rs = input.nextInt();

				if (rs < 1 || rs > 2)
				{
					System.out.println("ERRO! Digite uma resposta válida\n");
				}
			} while (rs < 1 || rs > 2);
			
			if (rs == 1)
			{
				do 
				{
					System.out.print("Número do canal (1 - 100): ");
					canal1 = input.nextInt();
					if (canal1 < 0 || canal1 >= 100)
					{
						System.out.println("ERRO! Digite um valor válido\n");
					}

				} while (canal1 < 0 || canal1 >= 100);
				
				tv.MudarCanal(canal1);
			}

			do
			{
				System.out.print("Continuar [0] Não [1] Sim: ");
				con = input.nextInt();

				if (con < 0 || con > 1)
				{
					System.out.println("ERRO! Digite uma resposta válida\n");
				}
			} while (con < 0 || con > 1);
			
			if (con == 0)
			{
				continuar = false;
			}
		}

		System.out.println();
		System.out.println(tv);

		input.close();
	}

}
