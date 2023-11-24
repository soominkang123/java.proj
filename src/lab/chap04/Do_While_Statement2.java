package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 

		int a ; 	//스캐너로 인풋 받는 변수 

		do {
			System.out.println("========================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의배수 출력 || ");
			System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("5. 프로그램 종료 ");
			System.out.println("========================================================");
			System.out.println("위 의 내용을 정수로 입력 하세요 >>>");
			a = sc.nextInt(); 

			if (a == 1) {
				System.out.println("1. 구구단 출력 ");
				// 구구단 출력 프로그램 
				for (int i = 1; i < 10; i++) {  // i 단을 출력 하는 변수
                for (int j = 1 ; j < 10 ; j++) { //j 각단에서 1~9 곱하는 수
                  System.out.printf("%d * %d = %d \t" , i , j , i*j);
                   }
                  System.out.println();
				}
                
			} else if ( a== 2 ) {
				System.out.println("2. 19단 출력");
				// 19단 출력 프로그램 작성 
				for (int i = 1; i <= 19; i++) {  // i 단을 출력 하는 변수
	                for (int j = 1 ; j <= 19 ; j++) { //j 각단에서 1~9 곱하는 수
	                  System.out.printf("%d * %d = %d \t" , i , j , i*j);
	                   }
	                  System.out.println();
					}				
			
			} else if ( a == 3) {
				System.out.println("3. 1 ~ 1000까지 3의배수 출력 ");
				// for 문, while 문, do while 문 
				System.out.println("== for 문===");
				for ( int i = 1 ; i < 1000; i++) {
					if( i % 3 == 0) System.out.println("3의 배수 : " + i);
				}
				
				System.out.println("== while 문===");
				int b = 3 ;
				while ( b < 1000) {
					 
					   System.out.println("3의 배수(while) : " + b);
					   b +=3;    // b= b+3;
				}
				
				System.out.println("== do while 문===");
				boolean c = true;
				int d = 1 ;
				do {
					
					if( d % 3 == 0) {System.out.println(" 3의 배수(dowhile) : " + d);}
					
					if(d == 1000) c = false ;
					d++;
				} while ( c ) ;
				
			} else if ( a ==4) {
				// "4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램"
				System.out.println("10개의 정수를 공백으로 넣으세요>>>> ");
				int c , count = 0 ;       // c : 스캐너로 정수를 받는 변수 , count : 짝수를 카운트 하는 변수
				for (int i = 1 ; i <= 10 ; i++) {
					c = sc.nextInt();           // 10번 루프 : input 값을 할당 받음
					
					if ( c <= 0 ) {  // 0 이거나 음수는 카운트 하지 않음.
						continue;
					}
					
					if ( c % 2 == 0) { // 짝수만 카운트 변수에 할당 한다. 
						count++ ;
					}
				}
				System.out.println(" 입력한 10개의 정수 중 짝수는  : " + count + "개 입니다."); //카운트 밖에서 찍어야된다
			
				
				
			} else if ( a == 5) {
				System.out.println("4. 프로그램을 종료 합니다. ");
				break; 
			}							
		}while ( true ) ; 


		sc.close();       // 메모리에서 스캐너를 제거 해야함. 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}