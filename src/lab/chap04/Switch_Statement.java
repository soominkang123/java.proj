package lab.chap04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Switch_Statement {

	public static void main(String[] args) {
		/*
		   
		    switch 문을 사용 해서 출력 / if ~ else if
		    
		    스캐너로 정수를 입력 받으세요.
		    1   "당신은 금메달을 획득했습니다.
		    2   "당신은 은메달을 획득했습니다.
		    3   "당신은 동메달을 획득했습니다.
		    그외    " 정수 1 ~ # 중 하나의 값을 넣으세요"
		  
		    
		    
		    
		    
		    
		 */
		Scanner sc = new Scanner(System.in) ;
		
		int medal ;
		
		System.out.println("정수로 1 ~ 사이의 값을 입력하세요 >>>>");
		medal = sc.nextInt();
		System.out.println("=========swit 문으로 출력=======");
		switch (medal) {
		case 1: case 10 : case 100:
			System.out.println("당신은 금메달을 획득 했습니다.");
			break;
		case 2: case 20 : case 200: 
			System.out.println("당신은 은메달을 획득했습니다.");
			break;
		case 3: case 30 : case 300:
			System.out.println("당신은 동메달을 획득했습니다.");
			break;	
		default :
			System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요");
		}
		
        System.out.println("=======if문으로 출력======");
        
        if(medal == 1 || medal == 10 || medal == 100) {
        	System.out.println("당신은 금메달을 획득 했습니다.");
        }else if (medal == 2 || medal ==20 || medal == 200) {
        	System.out.println("당신은 은메달을 획득했습니다.");
        }else if (medal == 3 || medal == 30 || medal ==300) {
        	System.out.println("당신은 동메달을 획득했습니다.");
        }else {
        	System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요");
        }
	


		
		
		
		
		
	}

}
