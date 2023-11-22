package chap03.ex02;

import java.util.Scanner;

public class bitWiseOperator {
	public static void main(String[] args) {
		// 다양한 진법 표현 , 비트연산자
		
		// 1. 다양한 진법 표현 : 10 진수, 8 진수 , 16진수 , clac (계산기)
		
		int data = 13;
		
		// 정수를 2진수로 변환 : Integer.toBinaryString(정수); ===> 2진수로 출력 
		System.out.println(Integer.toBinaryString(data)); // 1101 2진수로 출력 
		    //1101
		// 정수를 16진수로 변환 : Integer . toHexString(정수); ===> 16진수로 출력
		System.out.println(Integer.toHexString(data));   // d 16진수
		
		 // 정수를 8진수로 변환 : Integer .toOctalString(정수); ===> 8진수로 출력
		System.out.println(Integer.toOctalString(data)); // 15 
		
		// 문자열로 된 숫자를 정수 타입으로 변환  <=== 중요 , 많이 사용됨 ★
		System.out.println( "3" + "5");   // 문자열 + 문자열 = 문자열 연결
		
		// Integer. parseInt("숫자정수"); ===> 정수 타입으로 저장됨 <== 많이 사용됨 ★
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5"));   // 8
		
		// 문자열로된 실수를 실수 타입으로 변환 <=== 실수 타입으로 저장 ★
		// Double.perseDouble('13.5") ==> 실수로 변환
		System.out.println("13.5" + "17.77"); //13.517.77 +가아닌 이어지는것
		
		System.out.println(Double.parseDouble("13.5") + Double.parseDouble("17.77")); //31.27
		
		System.out.println("=============================");
		//스캐너에서 숫자가 문자열로 들어왔을때 정수로 변환, 실수로 변환후 연산
		
		Scanner sc = new Scanner (System.in);  // ctrl + shift + o
		
		String kor ;
		String eng ;
		String avg ;
		
		System.out.println(" 국어점수(정수) 영어점수(정수) 평균(실수) 로 입력해 주세요>>>");
		
		kor = sc.next();
		eng = sc.next();
		avg = sc.next();
		
//		int hap = kor + avg ;  //오류 발생 , 타입이 맞지 않는다.
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng) ;
		
		
		System.out.println("국어점수 + 영어 점수 : " + hap);
		System.out.println("평균 출력 : " + Double.parseDouble(avg));
		// 77 88 55 .777
		
		
}
}