package lab.chap04;

import java.util.Scanner;

public class if_Statement2 {

	public static void main(String[] args) {
		/*
		     
		     
		     
		     스캐너로 정수 값을 입력 받으세요. 자신의 가진 자산을 입력 받습니다.
		     
		     0 ~ 1000 만원 : " 버스나 지하철을 타고 다닙니다.
		     1000만원 ~ 10000 : " 택시를 타고 다닙니다. "
		     10000(억) ~      : " 비행기를 타고 다닙니다.
		 
		    
		 */
      
		Scanner sc = new Scanner(System.in) ;
		
		int myMoney ;
		
		System.out.println("자신의 자산을 정수로 만원 단위로 입력 하세요 >>>");
		myMoney = sc.nextInt();
		
		
	
		if (myMoney >= 0 && myMoney < 1000) {
			System.out.println("버스나 지하철을 타고 다닙니다");
		} else if (myMoney >= 1000 && myMoney < 10000) {
             System.out.println("택시를 타고 다닙니다");
		} else if  (myMoney >=10000) {
			System.out.println("비행기를 타고 다닙니다");
		} else  {
			System.out.println("잘못된 값을 입력했습니다. 양수를 입력하세요. ");
		}
		
		
		
		
		
		
		
	}

}
