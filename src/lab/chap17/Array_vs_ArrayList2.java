package lab.chap17;

import java.util.Arrays;

public class Array_vs_ArrayList2 {

	public static void main(String[] args) {
		/*
        //배열 : arr            : 100 번방 , 10의 배수만 저장 , 후 출력 , <== for, Attys.toString
            
        // 컬렉션 : aList        : 20의 배수 100번방까지만 저장, for 문으로 출력 , 
	           
         */
		
		// 배열 : 참조 자료형
		  // 1. 자료형 [] 변수 = new 자료형[방갯수];
		    int[] arr = new int [100] ;
		//  배열 각방에 값을 넣기
			for(int i = 0 ; i <arr.length ; i++ ) {
				i += 10 ;
				arr[i] = i;
			}
		//출력
			
		
		
		
		
		

	}

}
