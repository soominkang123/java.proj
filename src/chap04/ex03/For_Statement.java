package chap04.ex03;

public class For_Statement {

	public static void main(String[] args) {

		/*
		     제어문 : 프로그램의 조건에 따라서 순서를 바꾸어 줌, if( if, if ~ else, if ~else if) , switch
		     반복문 : 프로그램을 계속 반복 하도록 하는 구문
		          * 주의 : 조건이 무한 루프에 빠지지 않도록 처리
		            for , while , do while
		            
		            for ( 변수의 초기값; 조건 ; 증감식 {
		                // 반복될 구문 ;
		           }
		 	 	 
		 		 
		 */
		        
		     // i가 0일때 조건 확인 
		for(int i = 0 ; i <= 10 ; i++ ) {       //10번 반복 오늘 날씨는 춥습니다
		   System.out.println("오늘 날씨는 춥습니다 : " + i );
		}
		
		System.out.println("===========================");
		
		// * for 문에서 주의 : 무한 루프 에 빠지지 않도록 조건을 처리
		int a ;  // 블락 밖에서 선언된 변수
//		for( a = 0 ; a >= 0 ; a++) {      //조건이 true , <== 무한 루프
		for( a = 0 ; a < 0 ; a++) {       
			System.out.println(a); 
		}
		
		// for 문 블락 밖에서 선언, for 블락 내에서 선언 ( 변수를 새로 사용 가능하다)
		
        for( a = 10 ; a <= 100 ; a += 2) { //int 넣을시 오류발생
        	System.out.println(a);
        }

        System.out.println("마지막 a 변수의 값을 출력 :" + a);   // 102
        
     //  System.out.println("마지막 i 변수의 값을 출력 : " + i); // for 블락내에서 초기화 , 블락 밖에서는 오류가 뜬다
        
        System.out.println("======= 무한루프 ==========");
        
 //       for ( int i = 0 ; i >= 0 ; i ++){       // 무한 루프
          for ( int i = 0 ; i < 100 ; i ++) {     // 정상 코드
        	  
        	System.out.println("무한 루프 :" + i);
       
        }
        
//          for (int i = 0 ; true ; i++) {        //조건
            for (int i = 0 ; i < 100 ; i++) {
            	  System.out.println("무한 루프 2 :" + i);
          }
        
 //            for ( int i = 0 ; ; i++) {          // 조건이 생략 된 경우 : JVM 에서 true 를 자동으로 넣음
               for ( int i = 0 ; i < 100 ; i++) {
                System.out.println("무한 루프 3 :" + i);
            	 
             }
            
          //  도달 할 수 없는 코드  
//          for (int i = 0 ; false ; i++ ) {
//        	   System.out.println("a");
//        	            }       
       
          
          
	}

}
