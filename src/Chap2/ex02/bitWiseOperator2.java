package Chap2.ex02;

import java.net.MulticastSocket;

public class bitWiseOperator2 {
	public static void main(String[] args) {
		// 2. 비트 연산자 : & (AND) , | (OR) , ^ (XOR) , ~ (NOT)
		      // 2진법으로 변환 해서 연산됨
		// & (AND) 연산 : 0 & 0 = 0, 0 & 1= 0 , 1 & 0 = 0 , 1 & 1 = 1
		    // 모든 비트가 1일때 결과 1
		
		System.out.println(3 & 10);  // 2
		
		/*       10진수 2진수
		          3   0011
		          10  1010
		 AND      ==================== 
		           2   0010
		 */
		
		// | (OR) : 연산 : 0 or 0 = 0 , 0 or 1 = 1 , 1or 0 =1 , 1 or 1 =1
		   // 하나라도 1이 있으면 결과 1 , 
		System.out.println( 3 | 10); //11
		
		/*       10진수 2진수
		         3     0011
		         10    1010
		OR      ==================== 
		         11  1011
		*/
		
		// ^ (XOR) 연산 : 0 XOR 0 = 0, 0 XOR 1 = ,   1 XOR 0 = 1, 1 XOR 1 = 0
		      //두 비트가 같을때 : 0 , 두 비트가 다른 값일때 : 1
		System.out.println( 3 ^ 10);  //9
		
		/*        10진수 2진수
	              3     0011
	              10    1010
	     XOR      ==================== 
	               9    1001
	    */
		
		// ~ (NOT)  :  0 일때 1 , 1일때 0
		System.out.println(~3); //-4
		
			/*    10진수 2진수
	              3     0011    10011    <== +3    
	   	NOT      ==================== 
	                     1100   01100    <== -4
	        */
	    
		System.out.println(~10); // -11
		
	}
}
