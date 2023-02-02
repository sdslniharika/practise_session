package assignment.model;

public class Product {

	private int productId;
	private String productName;

	private ProductCategory productCategory;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Product(int productId, String productName, ProductCategory productCategory) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
	}

	public Product() {
	}
}
