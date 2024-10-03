public class NomeCompleto {

	// ATRIBUTOS - CONSTRUTORES - SETGET - TOSTRING

	private String nome = " ";
	private String sobrenome = " ";


	public NomeCompleto (String nome, String sobrenome)
	{
		setNome(nome);
		setSobrenome(sobrenome);
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getSobrenome() 
	{
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) 
	{
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ex001 [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}
}