package chap04.ex03;

public class For_Statement5 {

	public static void main(String[] args) {
		/*
		     반복문(For, while, do whil) 내에서 continue; break; 키워드 사용  <== if 조건을 넣어서 샤용
		          - continue;  <== 아래 코드는 실행하지 않고 증감식으로 이동
		          - break;     <== 반복문을 빠져 나온다.
		          
		     
		 */

		// continue ;
		for ( int i = 1 ; i < 10 ; i++) {
			
			if ( i % 3 == 0) {    // 3의 배수일때 true 
				continue;
			}    //continue 아래있는 코드 작동X
			
			System.out.println("i 변수의 값 : " + i);		}
		    
		    System.out.println("=============================");
		
		// break; 
		for (int i = 1 ; i < 10 ; i++) {
			
			System.out.println("i 변수값 출력 :" + i);
		
			if (i == 7) break;
		}
		
		
		
		
		
	}

}
