package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 

		int a ; 	//스캐너로 인풋 받는 변수 

		do {
			System.out.println("========================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의배수 출력 || ");
			System.out.println("4. 프로그램 종료 ");
			System.out.println("========================================================");
			System.out.println("위 의 내용을 정수로 입력 하세요 >>>");
			a = sc.nextInt(); 

			if (a == 1) {
				System.out.println("1. 구구단 출력 ");
				// 구구단 출력 프로그램 

			} else if ( a== 2 ) {
				System.out.println("2. 19단 출력");
				// 19단 출력 프로그램 작성 

			} else if ( a == 3) {
				System.out.println("3. 1 ~ 1000까지 3의배수 출력 ");
				// for 문, while 문, do while 문 

			} else if ( a == 4) {
				System.out.println("4. 프로그램을 종료 합니다. ");
				break; 
			}							
		}while ( true ) ; 


		sc.close();       // 메모리에서 스캐너를 제거 해야함. 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}