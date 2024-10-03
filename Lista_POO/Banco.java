
public class Banco {
	
	/*Crie uma classe para implementar um sistema bancário básico, ele deve conter
	os seguintes items:
	Atributos
	 número da conta;
	 nome;
	 saldo;
	Métodos
	 incluir conta;
	 alterar nome;
	 depósito;
	 saque;
	 deve existir métodos para validar os métodos acima;
	 crie um construtor para padronizar os parâmetros inicias na criação
	do objeto;*/
	
	private int NumeroConta;
	private String Nome;
	private double Saldo;
	
	public Banco(int NumeroConta, String Nome, double Saldo)
	{
		setNumeroConta(NumeroConta);
		setNome(Nome);
		setSaldo(Saldo);
	}
	
	public void MudarNumeroConta(int num)
	{
		NumeroConta = num;
	}
	
	public void AlterarNome(String nome)
	{
		Nome = nome;
	}
	
	public void Deposito(double valor)
	{
		Saldo += valor;
	}
	
	public void Saque(double valor)
	{
		Saldo -= valor;
	}
	
	public int getNumeroConta() {
		return NumeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [NumeroConta=");
		builder.append(NumeroConta);
		builder.append(", Nome=");
		builder.append(Nome);
		builder.append(", Saldo=");
		builder.append(Saldo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
