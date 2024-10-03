
public class Televisao {

	private int Canal = 0;
	private int Volume = 0;

	public Televisao(int Canal, int Volume)
	{
		setCanal(Canal);
		setVolume(Volume);
	}
	public Televisao()
	
	{

	}
	

	public void AumentarVolume(int valor_volume)
	{
		if (valor_volume > 0 && valor_volume <= 100)
			Volume = valor_volume;
	}

	public void DiminuirVolume(int valor_volume)
	{
		if (valor_volume > 0 && valor_volume <= 100)
			Volume = valor_volume;
	}

	public void MudarCanal(int valor_canal)
	{
		if (valor_canal > 0 && valor_canal <= 100)
			Canal = valor_canal;
	}	

	public int getCanal() {
		return Canal;
	}

	public void setCanal(int canal) {
		if (canal > 0 && canal <= 100)
			Canal = canal;
	}

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		if (volume > 0 && volume <= 100)
			Volume = volume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Televisao [Canal=");
		builder.append(Canal);
		builder.append(", Volume=");
		builder.append(Volume);
		builder.append("]");
		return builder.toString();
	}

}
