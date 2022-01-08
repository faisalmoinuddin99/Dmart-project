package demo;

public class Dmart {
	
	private int productId ;
	private String productName ;
	private double productCost ;
	
	public Dmart() {
		// TODO Auto-generated constructor stub
	}

	public Dmart(int productId, String productName, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

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

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Dmart [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost + "]";
	}
	
	

}
