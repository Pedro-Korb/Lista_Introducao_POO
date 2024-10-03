
public class Lanchonete {
	// ATRIBUTOS - CONSTRUTORES - SETGET - TOSTRING
	
	private int code;
	private double price;
	
	public Lanchonete(int code, double price) {
		setCode(code);
		setPrice(price);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lanchonete [code=");
		builder.append(code);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
}