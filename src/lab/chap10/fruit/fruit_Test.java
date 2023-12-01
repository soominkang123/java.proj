package lab.chap10.Fruit;

import java.util.ArrayList;
import java.util.List;

public class fruit_Test {

	public static void main(String[] args) {
		/*
		1.   자식 객체를 생성후
		   Apple("사과" , 30 , 5000) fruit 타입으로 정의
		   banana("바나나" , 44 , 6000)
		   StrawBerry ( "딸기",55,7000)
		   
		2. ArrayList 객체 3개를 저장 
		3. For문 으로 ArrayList의 객체를 끄집어내서 totalPrice() 호출시
		4. 출력 : "000 의 전체 가격은 : 000 입니다.
		
		자식 객체를 생성하면서 부모타입으로 지정하면 , 배열이나 클래스에 동일한 타입으로 저장
		   
		 */
		
		//1. 자식 객체를 생성하면서 부모 타입으로 지정함. <== 배열, 컬렉션 동일한 타입으로 저장 
		Fruit a = new Apple("사과" , 30 , 5000);      // a : Fruit , Apple
		Fruit b = new Banana("바나나" , 44 , 6000);    // b : Fruit , Banana
		Fruit s = new Strawberry("딸기" , 55 , 7000); // c : Fruit , Strawberry
		
		Apple a1 = new Apple();
		
		// 2. ArrayList<Fruit>
		List<Fruit> aList = new ArrayList<>();
		
		aList.add(a);
		aList.add(b);
		aList.add(s);
	    aList.add(a1); // Upcast 이 자동으로 이루어 져서 저장됨 
	    
	    // 3. aList의 각 방의 저장된 객체를 끄집어 내서 출력
	    for(int i = 0 ; i < aList.size(); i++) {
	    	aList.get(i).totalPrice();
	    }
		// 자바의 꽃 : 상속을 사용한 다형성 
	    // 다형성 : 상속, 부모의 메소드를 출력시 자식의 오버라이딩된 메소드를 출력
			    		
	}

}
