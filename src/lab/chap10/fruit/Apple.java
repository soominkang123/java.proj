package lab.chap10.Fruit;

public class Apple extends Fruit {
  // 부모의 필드가 상속
	
	Apple() {}
	Apple(String name , int cnt , int price) {
		//super();
		super.name = name ;
		super.cnt = cnt ;
		super.price = price ;
	}
	
	@Override 
		void totalPrice() {         // 코드 작성 : cnt + price
			                   // 출력 : 000 과일의 전체 가격은 : 000 입니다.
		   System.out.println(super.name+ " 의 전체 가격은 : " + (super.cnt * super.price));
		}
}
