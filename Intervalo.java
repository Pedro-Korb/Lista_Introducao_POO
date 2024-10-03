public class Intervalo {

	// ATRIBUTOS - CONSTRUTORES - SETGET - TOSTRING

	private int PrimeiroNumero = 0;
	private int SegundoNumero = 0;


	public Intervalo (int PrimeiroNumero, int SegundoNumero)
	{
		setPrimeiroNumero(PrimeiroNumero);
		setSegundoNumero(SegundoNumero);
	}

	public int getPrimeiroNumero() 
	{
		return PrimeiroNumero;
	}

	public void setPrimeiroNumero(int primeiroNumero) 
	{
		PrimeiroNumero = primeiroNumero;
	}

	public int getSegundoNumero() 
	{
		return SegundoNumero;
	}

	public void setSegundoNumero(int segundoNumero) 
	{
		SegundoNumero = segundoNumero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Intervalo [PrimeiroNumero=");
		builder.append(PrimeiroNumero);
		builder.append(", SegundoNumero=");
		builder.append(SegundoNumero);
		builder.append("]");
		return builder.toString();
	}
}
