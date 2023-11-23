package Chap2.ex03.copy;

public class LogicalOperator {

	public static void main(String[] args) {
		/* 논리연산자 : 결과 값으로 true/false 를 리턴(돌려준다)  <== 아주 중요 ★
		          && (AND) : 모두 true 일때 true
		                     true && true => true
		                     true && false => false
		                     false && false => false
		                     false && false => false
		          || (OR)  : 하나라도 true 이면 true
		                     true || true => true
		                     true || false => true
		                     false || true => true
		                     false || false => false
		           ^ (XOR) : 앞뒤가 같을떄 false , 앞뒤의 값이 다를때 true
		                       true ^ true => false
		                       true ^ false => true
		                       false ^ true => true
		                       false ^ false => false                 
		           ! (NOT) : true 일때 false , false 일때 true
		           
		          
		 */
         // && 연산 : 모두 true 일때 true , 
		System.out.println(true && true ); // true
		System.out.println(true && false ); // false
		System.out.println(false && true ); // false
		System.out.println(false && true ); // false
		
		System.out.println("==========================");
		// || (OR) 연산 : 하나라도 true 이면 true
		System.out.println( true || true ); // true
		System.out.println( true || false); // true
		System.out.println( false || true ); // true
		System.out.println( false || false ); // false
		
		System.out.println("==========================");
		//^ (XOR) : 앞뒤가 같을때 false , 앞뒤의 값이 다를때 true
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false^ false); // false
		
		System.out.println("==========================");
		System.out.println(!true);   //false
		System.out.println(!false);   //true
		
		
		//논리 연산자는 숏트 버킷이 발생될 수 있다. 쇼트 서킷을 방지 하기 위해서 비트 연산자를 사용해서 방지 할 수 있다
		  // 앞에 연산자로만 결과 값을 유추 할 수 있는 경우 뒤에 오는 값은 처리하지 않고 결과를 돌려줌 .
		     // AND 연산에서 앞에 false 가 올  경우 쇼트 서킷 이 발생됨.
		     // OR 연산에서 앞에 true 가 올 경우 쇼트 서킷이 발생됨
		   
		
		
	}

}
