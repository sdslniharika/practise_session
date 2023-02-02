package assignment.model;

public class Grocery extends Product {

	private double quantityInKg;
	private double quantity;

	private int pricePerKg;

	public double getQuantityInKg() {
		return quantityInKg;
	}

	public void setQuantityInKg(double quantityInKg) {
		this.quantityInKg = quantityInKg;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public Grocery(int productId, String productName, ProductCategory productCategory, double quantityInKg,
			double quantity, int pricePerKg) {
		super(productId, productName, productCategory);
		this.quantityInKg = quantityInKg;
		this.quantity = quantity;
		this.pricePerKg = pricePerKg;
	}

	public Grocery(double quantityInKg, double quantity, int pricePerKg) {
		this.quantityInKg = quantityInKg;
		this.quantity = quantity;
		this.pricePerKg = pricePerKg;
	}

	public Grocery() {
	}
}
