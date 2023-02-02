package assignment.model;

public class Phone extends Product {

	private int ram;
	private int storage;
	private String model;
	private int price;
	private int units;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Phone(int productId, String productName, ProductCategory productCategory, int ram, int storage, String model,
			int price, int units) {
		super(productId, productName, productCategory);
		this.ram = ram;
		this.storage = storage;
		this.model = model;
		this.price = price;
		this.units = units;
	}

	public Phone(int ram, int storage, String model, int price, int units) {
		this.ram = ram;
		this.storage = storage;
		this.model = model;
		this.price = price;
		this.units = units;
	}

	public Phone() {

	}
}
