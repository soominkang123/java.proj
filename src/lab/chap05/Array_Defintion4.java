package lab.chap05;

import java.util.Arrays;

public class Array_Defintion4 {

	public static void main(String[] args) {
		/*
		  
		      변수 : 1값 만 저장 . Stack : 변수명 ,  변수 값 , == , 기본 자료형
		      배열 : 여러개의 값을 저장. <== 참조 자료형 , Stack : 변수명, 참조주소 , Heap : 값
		                    equals()   <== Heap
		                    초기값 : 정수 : 0 , 실수 : 0.0 , boolean : false
		  		  
		 */
		int a = 10; // 변수
		
		int[] b = new int[10] ; // 배열 선언 , Heap 공간에는 초기 값이 반드시 들어가야 한다.
		         // index : 0 ~ 9
		
//		System.out.println(a);    // 초기값을 반드시 넣어야 사용
		System.out.println(b[0]); // 0번째 값은 0이다
		
		// b 배열에 값을 할당.
		b[0] = 3 ;
		b[1] = 6 ;   // 방 번호는 0번부터 9번까지
		b[9] = 10 ;
		
		// 배열의 각 방의 내용을 출력 
		System.out.println(b[9]);
		
		// for 문을 사용해서 0방 ~ 9
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.println(b[i]);
			
		}
		
		System.out.println(b.length);  // 배열 방의 갯수
		System.out.println("=======================");
		
		for (int i = 0 ; i < b.length ; i ++) {
			System.out.println(b[i]);
		}
		
		// Enhanced for : 배열 0 ~ 마지막 방까지 모두 출력 
		System.out.println("=== Enhanced For===");
		for (int k : b) {
			System.out.println(k);
		}
		
		// Arrays.toString(배열변수)
		System.out.println("===Arrays.toString(b)===");
		
		System.out.println(Arrays.toString(b));

		
		
		
	}

}
