package lab.chap04;

public class For_Statement {

	public static void main(String[] args) {
		
		
		/* 구구단 중에 7단만 출력 : for 문을 사용해서
		 
		  7 * 1 =7
		  7 * 2 =4
		  7 * 3 =21
		  7 * 4 =28
		  7 * 5 =35
		  7 * 6 =42
		  7 * 7 =49
		  7 * 8 =56
		  7 * 9 =63
		 
		 
		 */
//		 for(int i = 7 ; i <= 63 ; i++ ) {
			
//		 if(i % 7 == 0) {
//			  System.out.println(i);  
//		  }
			 
//		 } 
		
		//
		 for(int i = 1 ; i < 10 ; i++ ) {
			 
			 System.out.println("7 *" + i + " = " + ( i * 7));
			 
		 }
		System.out.println("===========================");
		for ( int i = 1 , j = 7 ; i < 10 ; i++) {
			System.out.println( j + " * " + i + " = " + (i * j));
		}
		

	}

}
