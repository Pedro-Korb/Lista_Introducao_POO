
public class Funcao {

	private int PrimeiroNum = 0;
	private int SegundoNum = 1;


	public Funcao(int PrimeiroNum, int SegundoNum)
	{
		setPrimeiroNum(PrimeiroNum);
		setSegundoNum(SegundoNum);
	}

	public int Soma() {
		return PrimeiroNum + SegundoNum;
	}

	public int Subtracao()
	{
		return PrimeiroNum - SegundoNum;
	}

	public int Multiplicacao()
	{
		return PrimeiroNum * SegundoNum;
	}

	public double Divisao()
	{
		if (SegundoNum != 0)
			return PrimeiroNum / SegundoNum;
		else
		{
			System.out.println("ERRO! Divisão por 0");
			return 0;
		}

	}

	public int getPrimeiroNum() 
	{
		return PrimeiroNum;
	}

	public void setPrimeiroNum(int primeiroNum) 
	{
		PrimeiroNum = primeiroNum;
	}
	public int getSegundoNum() 
	{
		return SegundoNum;
	}
	public void setSegundoNum(int segundoNum) 
	{
		SegundoNum = segundoNum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcao [Soma()=");
		builder.append(Soma());
		builder.append(", Subtracao()=");
		builder.append(Subtracao());
		builder.append(", Multiplicacao()=");
		builder.append(Multiplicacao());
		builder.append(", Divisao()=");
		builder.append(Divisao());
		builder.append("]");
		return builder.toString();
	}
	
}
