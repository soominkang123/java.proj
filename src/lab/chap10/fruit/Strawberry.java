package lab.chap10.Fruit;

public class Strawberry extends Fruit { // 딸기

	Strawberry() {}
	Strawberry(String name , int cnt , int price) {
		//super();
		super.name = name ;
		super.cnt = cnt ;
		super.price = price ;
	}
	
	@Override
	void totalPrice() {
		 System.out.println(super.name+ " 의 전체 가격은 : " + (super.cnt * super.price));
	}
	
	
	
	
	}

