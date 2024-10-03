
public class Quadrado {
	
	private double TamanhoLado;

	public Quadrado(double TamanhoLado)
	{
		setTamanhoLado(TamanhoLado);
	}
	
	public double CalculoArea()
	{
		return TamanhoLado * TamanhoLado;
	}
	
	public double getTamanhoLado() {
		return TamanhoLado;
	}

	public void setTamanhoLado(double tamanhoLado) {
		TamanhoLado = tamanhoLado;
	}
	
	//Mudar valor do Lado, Retornar valor do Lado e calcular Área;
	
}
