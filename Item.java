
public class Item {
	private String name;
	private int code;
	private double price;
	
	public Item() {
		name = "";
		code = 000000;
		price = 0.00;
	}
	
	public Item(String name, int code, double price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public String toString() {
		return this.getClass() + name;
	}
}
