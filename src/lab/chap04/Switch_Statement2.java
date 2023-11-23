package lab.chap04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPopupMenuUI;

public class Switch_Statement2 {


public static void main(String[] args) {
	      /*
	       
	         switch ~ case 문으로 프로그램을 작성
	         월을 입력해서 해당 월은 00일 입니다.
	        
	         31을 출력되는 월 : 1, 3, 5, 7, 8, 10, 12
	         30을 출력 되는 달 : 4, 6, 9 , 11
	         28 일 출력되는 달 2
	         
	         스캐너로 달을 입력 받고, 해당 달에 대한 일을 출력함
	           출력내용 : "해당월은 OO(떙땡)월이고, OO 일까지 존재 합니다.
	       */
	int month ; // 스캐너로 input 을 받습니다.
	int day = 30; // 
	
	Scanner sc = new Scanner(System.in) ;  //syso
	
	System.out.println("(1월 ~ 12월)을 입력하세요>>" );
	month =sc.nextInt();
	
	switch(month) {
	case 1: case 3 :case 5:case 7:case 8:case 10: case 12:
		day += 1 ;  // day = day +1;
		System.out.printf("해당월은 %d월이고, %d 일까지 존재 합니다. \n\n", month, day);
		break;
	case 2:
		day -= 2 ;  // day = day - 2;
		System.out.printf("해당월은 %d월이고, %d 일까지 존재 합니다. \n\n", month, day);
		break;
	default :
		System.out.printf("해당월은 %d월이고, %d 일까지 존재 합니다. \n\n", month, day);
		break;
	}
	
	
	
	
	
	
	
}
}