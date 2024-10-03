public class Trabalho {
	
	private double SalHora = 0;
	private double HoraMes = 0;
	
	public Trabalho(double SalHora, double HoraMes)
	{
		setSalHora(SalHora);
		setHoraMes(HoraMes);
	}
	
	public double SalarioBruto()
	{
		return SalHora * HoraMes;
	}
	
	public double Inss()
	{
		return (SalHora * HoraMes) * 0.08;
	}
	
	public double Sindicato()
	{
		return (SalHora * HoraMes) * 0.05;
	}
	
	public double IR()
	{
		return (SalHora * HoraMes) * 0.15;
	}
	
	public double inss()
	{
		return (SalHora * HoraMes) * 0.08;
	}
	
	public double SalarioLiquido()
	{
		return (SalHora * HoraMes) - Inss() - Sindicato() - IR();
	}
	
	public double getSalHora() {
		return SalHora;
	}

	public void setSalHora(double salHora) {
		SalHora = salHora;
	}

	public double getHoraMes() {
		return HoraMes;
	}

	public void setHoraMes(double horaMes) {
		HoraMes = horaMes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trabalho [SalarioBruto()=");
		builder.append(SalarioBruto());
		builder.append(", Inss()=");
		builder.append(Inss());
		builder.append(", Sindicato()=");
		builder.append(Sindicato());
		builder.append(", IR()=");
		builder.append(IR());
		builder.append(", inss()=");
		builder.append(inss());
		builder.append(", SalarioLiquido()=");
		builder.append(SalarioLiquido());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}