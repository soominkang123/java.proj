package lab.chap06;

public class Product {
	//1. 필드   
	private long idx ; // 번호
	private String proName ; // 제품명
	private int qty ; // 제품 갯수
	private int year ; // 생산년도
	private String proColor; // 제품 색깔
	
	// 기본 생성자
	Product () {}

	
	// getter / setter 생성
	
	// toString () 메소드 오버라이딩 : 객체 자체를 출력시 필드의 값을 출력 
	
	


	public long getIdx() {
		return idx;
	}


	public void setIdx(long idx) {
		this.idx = idx;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getProColor() {
		return proColor;
	}


	public void setProColor(String proColor) {
		this.proColor = proColor;
	}


	@Override
	public String toString() {
		return "Product [idx=" + idx + ", proName=" + proName + ", qty=" + qty + ", year=" + year + ", proColor="
				+ proColor + "]";
	}
	
	
	
	
}
