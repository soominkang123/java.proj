package lab.chap03;

import java.util.Scanner;

public class ConditonalOperator2 {

	public static void main(String[] args) {
		// Scanner 로 "안녕" 문자열을 입력, "안녕" 문자열이 입력되었을때 "안녕하세요" "안녕 못합니다."
		    // == , .equals("안녕") ?
		    // 삼항 연산자 사용
		
		
		Scanner sc = new Scanner(System.in); // ctrl shift o
		
		String str1 ;  // 기본 자료형이 아니다. 참조 자료형이다. 변수(str1) 변수의 값이 Heap에 저장 
		
		System.out.println("단어 하나를 입력하세요>>>");
		str1 = sc.next() ;
		
//		System.out.println( (str1 == "안녕") ? "안녕하세요" : "안녕 못합니다");
		System.out.println( (str1.equals("안녕") ) ? "안녕하세요" : "안녕 못합니다");
		
		// 참조 자료형일때 변수의 값은 Heap 공간에 저장됨. stack 에는 변수명과 Heap 에 저장된 값의 번지가 저장
		
		
		
		
		
		
		
		
		
		
	}

}
