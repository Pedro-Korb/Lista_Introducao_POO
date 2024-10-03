public class PostoGasolina {

	/*a. Possua uma classe chamada bombaCombustível, com no mínimo
		esses atributos:
		i. tipoCombustivel.
		ii. valorLitro
		iii. quantidadeCombustivel
		b. Possua no mínimo esses métodos:
		i. abastecerPorValor( ) – método onde é informado o valor a ser
		abastecido e mostra a quantidade de litros que foi colocada no
		veículo
		ii. abastecerPorLitro( ) – método onde é informado a quantidade
		em litros de combustível e mostra o valor a ser pago pelo
		cliente.

		iii. alterarValor( ) – altera o valor do litro do combustível.
		iv. alterarCombustivel( ) – altera o tipo do combustível.
		v. alterarQuantidadeCombustivel( ) – altera a quantidade de
		combustível restante na bomba.

		o OBS: Sempre que acontecer um abastecimento é necessário atualizar
		a quantidade de combustível total na*/


	private String TipoCombustivel = "Gasolina";
	private double ValorLitro;
	private double QuantidadeCombustivel;
	private double Total;
	
	public PostoGasolina(String TipoCombustivel, double ValorLitro, double QuantidadeCombustivel, double Total)
	{
		setTipoCombustivel(TipoCombustivel);
		setValorLitro(ValorLitro);
		setQuantidadeCombustivel(QuantidadeCombustivel);
		setTotal(Total);
	}

	public void AbastecerPorValor(double dinheiro)
	{
		QuantidadeCombustivel = (dinheiro / 6);
	}

	public void AbastecerPorLitro(double litros)
	{
		Total = litros * 6;
	}

	public void AlterarValor(double preco)
	{
		ValorLitro = preco;
	}

	public void alterarCombustivel(String tipo)
	{
		TipoCombustivel = tipo;
	}

	public void alterarQuantidadeCombustivel(double alterar_combustivel)
	{
		QuantidadeCombustivel = alterar_combustivel;
	}

	public String getTipoCombustivel() {
		return TipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}

	public double getValorLitro() {
		return ValorLitro;
	}

	public void setValorLitro(double valorLitro) {
		ValorLitro = valorLitro;
	}

	public double getQuantidadeCombustivel() {
		return QuantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(double quantidadeCombustivel) {
		QuantidadeCombustivel = quantidadeCombustivel;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostoGasolina [TipoCombustivel=");
		builder.append(TipoCombustivel);
		builder.append(", ValorLitro=");
		builder.append(ValorLitro);
		builder.append(", QuantidadeCombustivel=");
		builder.append(QuantidadeCombustivel);
		builder.append(", Total=");
		builder.append(Total);
		builder.append("]");
		return builder.toString();
	}

	
}