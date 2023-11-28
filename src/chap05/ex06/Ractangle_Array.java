package chap05.ex06;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) {
		/*
		    다차원 배열 : 2차원 정방형 배열
		    
		 */ 

		 // 1. 2차원 정방형 배열 선언 
	     //  첫번째 대괄호 [] : 행의 방번호    두번째 대괄호 [] : 열의 방번호
		int[][] arr1 = new int [3][4] ;  // Heap 에 값을 저장할 방을 만들어라. 행: 3 열: 4
		
		// 2. 각 index (방번호) 에 값을 넣음
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4;

		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40;
		
		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400;
		
//		arr1[2][4] = 500;     // 컴파일 단계의 오류 : 이클립스에서 오류를 확인
		                      // 실행 단계의 오류 : 실행시에 오류가 발생
		                      // 배열의 방번호를 넘길때 발생되는 오류 :ArrayIndexOutOfBoundsException
		
		// 3. 출력 : 방번호를 직접 출력
		System.out.println(arr1[0][0]); //1
		System.out.println(arr1[1][0]); // 10
		System.out.println(arr1[2][3]); // 400
		
		// 4. 출력 : for 문을 사용해서 출력 ★ <===== A111
		       // arr1.length <== 1차원 배열일때는 열의 개수를 출력
		       //             <== 2차원 배열일때는 행의 갯수를 출력
		System.out.println(arr1.length); //3 출력  //arr1 (행의 갯수) : 3 
		System.out.println(arr1[0].length);//4 출력 // 열의 갯수를 출력

		// 2차원 배열은 2중 for 를 사용해서 출력
		for ( int i = 0 ; i < arr1.length ; i++) { // 행을 루프돌린다 : i <== 행의 방번호
			for ( int j = 0 ; j < arr1[i].length; j ++) { // 열을 반복 : j <== 열의 방번호
				System.out.print("arr[" + i + "]" + "[" + j + "] = " + arr1[i][j]);
				System.out.println("\t");
				
			}
			System.out.println();
		}
		
		
		// 5. 출력 : Enhanced For 문으로 출력 : 이중 For 문으로 작동  하
		System.out.println("=== Enhanced For ===");
		for (int[] a : arr1) {                  // 행을 반복 : 배열
			for (int b : a) {                   // a q 배열의 0 ~ 마기막 방까지의 값 b변수에 담음.
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		// 6. 출력 : Arrays. to String(배열변수명)
		System.out.println("=== Arrays.toString==");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println("===for 문을 사용해서 ARRays,toString 출력===");
		for ( int i = 0 ; i <arr1.length ; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
	}

}
