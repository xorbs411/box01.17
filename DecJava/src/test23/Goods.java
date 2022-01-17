package test23;

public class Goods {
	
	String name;
	String price;
	int quantity;
	Goods(String name, String price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}   //tttt
	@Override
	public String toString() {
		return name + " ," + price + "원,"+ quantity +"개";	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	
	
	
	
	

}
