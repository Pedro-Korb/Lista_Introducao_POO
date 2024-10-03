import java.util.Scanner;

public class Bola {

	private int tamanho = 20;

	// ATRIBUTOS - CONSTRUTORES - SETGET - TOSTRING

	public Bola(int tamanho)
	{
		setTamanho(tamanho);
	}
	
	public void setTamanho(int tamanho) 
	{
		if (tamanho > 0)
			this.tamanho = tamanho;
	}
	
	public int getTamanho() 
	{
		return tamanho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bola [tamanho=");
		builder.append(tamanho);
		builder.append("]");
		return builder.toString();
	}
}


class BolaMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Bola b1 = new Bola(1);
		
		System.out.print("Tamanho da bola: ");
		int num = input.nextInt();
		
		b1.setTamanho(num);
		
		System.out.println();
		System.out.println(b1.getTamanho());
		
		input.close();
	}

}
