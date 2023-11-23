package lab.chap04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class if_Statement {

	public static void main(String[] args) {
		
		/*
		   // if ~ else if , equals("월요일") 
		    
		     콘솔에서 "월요일" 입력되었을때 출력 " 월요일은 자바를 공부 합니다."
		     콘솔에서 "월요일" 입력되었을때 출력 " 화요일은 데이타베이스를 공부 합니다."
		     콘솔에서 "월요일" 입력되었을때 출력 " 수요일은 html javascript를 공부 합니다. "
		     콘솔에서 "월요일" 입력되었을때 출력 " 목요일은 jsp를 공부 합니다. "
		     콘솔에서 "월요일" 입력되었을때 출력 " 금요일은 Spring를 공부 합니다."
		     콘솔에서 "월요일" 입력되었을때 출력 " 토요일은 운동을 합니다."
		     콘솔에서 "월요일" 입력되었을때 출력 " 일요일은 TV를 시청 합니다. 
		     콘솔에서 "그 외의 값이 입력시" 입력되었을때 출력 " 잘못 입력 했습니다. 요일을 입력하세요 "  
		     
		      // 변수명 한꺼번에 바꾸기 art + shift + r
		         라인의 여러값 한꺼번에 바꾸기 : art + shift + A
		         
		         		         
		       */
		
		// 1. Scanner Import
		Scanner sc = new Scanner(System.in) ;
		
		String str1 ;
		
		//2. 콘솔에서 입력 받아서 변수에 할당
		System.out.println("요일을 한글로 입력하세요. 예) 월요일>>>>>>>");
		str1 = sc.next();
		
		//3. if ~ else if 문을 사용해서 처리
		//ctrl space
		
		if (str1.equals("월요일")) { // 월요일
			System.out.println(str1 + "은 자바를 공부 합니다.");
			System.out.println("월요일 출력 입니다.");
		} else if (str1.equals("화요일")) { //
			System.out.println(str1 + "은 데이타베이스를 공부 합니다");
		} else if (str1.equals("수요일")) { //
			System.out.println(str1 + "은 html javascript를 공부 합니다");
		}else if (str1.equals("목요일")) { //
			System.out.println(str1 + "은 JSP를 공부 합니다");
		}else if (str1.equals("금요일")) { //
			System.out.println(str1 + "은 Spring를 공부 합니다");
		}else if (str1.equals("토요일")) { //
			System.out.println(str1 + "은 토요일은 운동을 합니다");
		}else if (str1.equals("일요일")) { //
			System.out.println(str1 + "일요일은 TV를 시청 합니다");
		}else {
			System.out.println(" 잘못 입력 했습니다. 요일을 입력하세요  ");
		}
			
			
			
					
			
			
			
		
		
		
		
	}
	
	
		
}  
          
          
          
       
		
		
		
		
		
	
