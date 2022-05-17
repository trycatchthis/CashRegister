public class Vendor {
	private String name;
	private String address;
	private String productName;
	
	public Vendor() {
		name = "";
		address = "";
		productName = "";
	}
	
	public Vendor(String name, String address, String productName) {
		this.name = name;
		this.address = address;
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
