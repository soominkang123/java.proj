package Chap02.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 삼항 연산자 : if ~ else 의 축약 구약
		
		//        (참 or 거짓) ? 참일때 실행 : 거짓일때 실행 ;
		
		// 삼한 연산자를 사용 함.
		int val1 = (3 > 5) ? 6 : 9 ; // true 6 false 9      1라인으로 처리됨
				
		System.out.println(val1);
		
		//if
		int val2 ;
		
		if (true) {
			val2 = 6;   // (조건) : true 일때
		}else {	
			val2 = 9;  // (조건) : false
			}
		
	     System.out.println(val2);
	     
	     
	}

}
