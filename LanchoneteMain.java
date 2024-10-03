import java.util.Scanner;

public class LanchoneteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		Lanchonete menu[] = {
				new Lanchonete(100, 1.20),
				new Lanchonete(101, 1.30),
				new Lanchonete(102, 1.50),
				new Lanchonete(103, 1.20),
				new Lanchonete(104, 1.30),
				new Lanchonete(105, 1.00)
		};
		
		double TotalPedido = 0.0;
		boolean ContinuaPedido = true;


		while (ContinuaPedido == true)
		{
			System.out.print("Digite o código do produto (0 para cancelar): ");
			int code = input.nextInt();

			if (code == 0)
			{
				ContinuaPedido = false;
			}

			Lanchonete ItemSelecionado = null;
			for (Lanchonete Item : menu)
			{
				if (Item.getCode() == code)
				{
					ItemSelecionado = Item;
				}
			}

			if (ItemSelecionado != null)
			{
				System.out.print("Quantidade: ");
				int Quantidade = input.nextInt();

				double TotalItem = Quantidade * ItemSelecionado.getPrice();
				TotalPedido += TotalItem;
			}
			
			System.out.println();

		}
		
		System.out.println("Total do pedido: R$ " + TotalPedido);

		input.close();
	}

}
