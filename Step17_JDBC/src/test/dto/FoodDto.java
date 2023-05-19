package test.dto;

public class FoodDto {
	private int num;
	private int price;
	private String fName;
	private String poo;
	
	public FoodDto(){}
	
	public FoodDto(int num, String fname, int price, String poo) {
		super();
		this.num = num;
		this.fName = fname;
		this.price = price;
		this.poo = poo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFname() {
		return fName;
	}

	public void setFname(String fname) {
		this.fName = fname;
	}

	public String getPoo() {
		return poo;
	}

	public void setPoo(String poo) {
		this.poo = poo;
	}
}