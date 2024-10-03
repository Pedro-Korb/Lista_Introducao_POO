
public class Pessoa {
	/* 7. Crie uma classe que modele uma pessoa:
	Atributos: nome, idade, peso e altura
	Métodos: Envelhercer, engordar, emagrecer, crescer.
	Obs: Por padrão a cada ano que nossa pessoa envelhece e se a idade dela
	for menor que 21 anos ela deve crescer 0,5 cm por ano. */
	
	private String nome;
	private int idade;
	private float altura;
	private double peso;

	public Pessoa(String nome, int idade, float altura, double peso)
	{
		setNome(nome);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
	}
	
	public void Envelhecer()
	{
		idade ++;
		
		if (idade < 21)
		{
			Crescer(0.5);
		}
	}
	
	public void Engordar(double kg)
	{
		peso += kg;
	}
	
	public void Emagrecer(double kg)
	{
		peso -= kg;
	}
	
	public void Crescer(double cm)
	{
		altura += cm;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", peso=");
		builder.append(peso);
		builder.append("]");
		return builder.toString();
	}
}
