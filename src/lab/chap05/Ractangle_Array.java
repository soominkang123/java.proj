package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) {
		/*
		 1. 선언
		   arr[3][10] : 행의 방번호 : 0 ~ 2 , 방의 갯수 : 3  , arr.length
		                열의 방번호 : 0 ~ 9, 방의 갯수 : 10 , arr[0]. length
		 2. 배열 방에 저장 
		   <2중 for 문을 사용해서 값을 저장 >
		                0행에는 1 부터 시작해서 1씩 증가 
		                1행에는 3의 배수를 저장
		                2행에는 7의 배수, 8의 배수 저장
		 3. 출력               
		     2중 for 문을 사용해서 출력
		     Enhanced for 문을 사용해서 출력
		     Arrays. toString () 으로 출력 , <== 1차원 배열을 출력           
		                
		  
		 */

//		int[][] arr= new int [3][10] ; //선언
//	   for( int i = 0 ; i < arr.length ; i++) {
//		 for (int j = 0; j < arr[i].length; j++) {
//			   if (i == 0) {
//				   arr[i][j] = j+ 1 ;
//			   } else if ( i ==1 ) {
//				   arr[i][j] =( j + 1) * 3 ;
//			   } else if (i == 2) {
//				   if ((j + 1) % 7 == 0 || ( j + 1) % 8 == 0 ) {
//					   arr[i][j] = j + 1;
//				   }
//			   }
//		   }
//	   }
//		 System.out.println("2중 for 문을 사용해서 출력");
//		 for ( int i = 0 ; i < arr.length ; i++) {
//			 for ( int j = 0 ; j < arr[i].length ; j++ ) {
//				 
//			 }
//		 }
	   
    //답안

	   // 1. 배열 선언 
		int[][] arr = new int[3][10] ; // 각방에 0이 들어가있음
		
		System.out.println(arr.length);    // 행의 갯수 : 3
		System.out.println(arr[0].length); // 열의 갯수 : 10
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		// 2. 이중 for 문을 사용해서 값을 입력 
		System.out.println("===2. 값을 입력===");
		for ( int i = 0 ; i <arr.length; i++) { // 행을 반복 < == 1차원 배열
		//	System.out.println(" 행의 방번호 :" + i);
			
			if ( i == 0) {
				// 배열의 각방에 : 1 씩 증가
				int a = 1; 
				for (int j = 0 ; j < arr[i].length; j++) {
					arr[i][j] = a ; 
					a++; 
				}

			}else if (i == 1) {
				// 각 방에 3의 배수 저장 
				int a = 3 ; 
				for (int j = 0 ; j < arr[i].length; j++) {
					arr[i][j] = a ; 
					a += 3; 
				}
			}else if (i == 2) {
				// 7 , 8의 배수 저장
				int a = 1; 
				for (int j = 0 ; j < arr[i].length; a++) {
					if ( a % 7 == 0 || a % 8 == 0  ) {  // 7의 배수 , 8의 배수
						arr[i][j] = a ; 
						j++; 
					}
				}
			}
		}

	System.out.println("==============");
	for ( int i = 0 ; i < arr.length ; i++) {
		System.out.println(Arrays.toString(arr[i]));
	}	


}
}
				
				