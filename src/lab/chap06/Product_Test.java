package lab.chap06;

import chap06.ex03.Member;

public class Product_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. Product 객체 4개 생성
		
		// 2. Setter를 사용해서 객체의 필드의 값을 주입
		
		// 3. 배열 arr , 방크기는 10개 : 0 ~ 9 , 각 방에 4의 객체를 배열 방에 넣음.
		
		// 4. 배열의 값을 끄집어내서 Product 변수 p 에 담고 출력 : for
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		p1.setIdx(1);
		p1.setProName("개발");
		p1.setQty(1);
		p1.setYear(1995);
		p1.setProColor("파란색");
		
		p2.setIdx(2);
		p2.setProName("칫솔");
		p2.setQty(2);
		p2.setYear(1996);
		p2.setProColor("빨간색");
		
		p3.setIdx(3);
		p3.setProName("물통");
		p3.setQty(3);
		p3.setYear(1997);
		p3.setProColor("초록색");
		
		p4.setIdx(4);
		p4.setProName("핸드크림");
		p4.setQty(4);
		p4.setYear(1998);
		p4.setProColor("검은색");
		
		Product[] arr = new Product[10];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
		
		for ( int i = 0; i < 4; i++) {
			Product p = arr[i]; 
			System.out.println(p);
			
			
			
			
		}
        
        
        
		
	}

}
