package chap10.ex01;

public class Inheritance01 {

	public static void main(String[] args) {
		/*
		   상속 ( Inheritance) : OOP 의 특징
		        - 자바는 하나 부모 클래스만 상속 할 수 있다. 다중 상속을 지원하지 않는다.
		        - 중복된 방지 할 수 있다.
		        - OOP 의 꽃
		        - 부모 클래스의 필드, 메소드, 이너클래스가 그대로 자식 클래스에게 상속된다. 
		                 <== 생성자는 상속되지 않는다.
		        - 자식 클래스를 생성하면 자식 클래스 생성자 내부에 super() 가 생략 되어있다. 
		               super() - 부모 클래스의 생성자를 호출 
		        - 자식 클래스를 생성하면 부모 클래스가 먼저 만들어지고 자식 클래스가 생성 
		        - 자식클래스명 extends 부모클래스명 
		   		   
		 */
		
		// 1. Student 객체 생성 :
		Student s1 = new Student();
		
		// 부모 클래스에서 정의한 필드와 메소드
		s1.name = "홍길동" ;
		s1.age = 30 ;
		
		s1.eat();
		s1.sleep();
		
		// Student 클래스의 필드와 메소드
		s1.studentID = 1111 ;
		s1.goToSchool();
		
		s1.stuinfo();
		
		// 2. Professor 
		Professor p1 = new Professor () ;
		
		// 부모의 필드와 메소드
		p1.name = " 김교수님 ";
		p1.age = 50 ;
		
		p1.eat();
		p1.sleep();
		
		// 자식의 
		p1.prfessorId = 2222;
		p1.teach();
					
		System.out.println("=== super vs super ===");
		// this 키워드      : 자기 자신의 객체, this.필드 this.메소드
		// this () 메소드   : 생성자 실행 블락에서 사용됨. 반드시 첫 라인에 와야함.
		                       // 다른 생성자를 호출 
		// super 키워드 :   부모의 필드 메소드 호출 , super.필드명 , super.메소드명
		// super() 메소드 : 생성자 실행 블락에서만 사용됨. 반드시 첫 라인에 와야함.
		                    // 부모 클래스의 생성자를 호출
		                    // 자식클래스 생성자 내부에는 실행블락 첫 라인에 super() 생략되어 있다.
		                    // 자식 클래스를 생성하면 super()에 의해서 부모 클래스가 먼저 만들어진다.
		
		Student s2 = new Student();
		
		// Student 클래스의 input 1개인 생성자 호출
		
		System.out.println("===========================");
		Student s3 = new Student(9999) ;
		// 1. Student(9999) 생성자 호출 ==> Human, super("김똘똘", 20); 호출
        // 3. Object 가 생성 ==> Human 생성 => Student 생성 
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println(s3.stuName);
		
		System.out.println("========================================");
		
		//Type Casting :
		/*
		    Upcasting : 자동 적용 될 수 있다. 자식 타입 ==> 부모 타입
		         부모의 필드와 메소드 만 사용가능
		    DownCasting : 부모 => 자식 , 명시가 필요. 
		         부모, 자식 의 필드와 메소드를 모두 사용 가능
		*/
		
		// 자식 객체를 생성해서 부모 타입으로 지정함. : 부모의 필드와 메소드만 사용 가능
		// 호출 : 1. Chird 호출 => 2. Professor 호출 => 3. Human 호출
		// 생성 : 4. Human 생성 => 5. professor 생성 => 6. Chird
		// Type : Human <== Human의 필드와 메소드만 사용가능 함.
		Human ch01 = new Chird(); // ch01 : Human, Professor , Chird 를 내포하고 있고,
		
		//Human 의 필드와 메소드만 사용가능
	    ch01.name = "홍길동";
	    ch01.eat();
	    
	    //다운 캐스팅 : Human, Professor 의 필드와 메소드를 사용 가능
	    Professor pp1 = (Professor) ch01;
	    
	    pp1.age = 10 ;
	    
	    //professor
	    pp1.prfessorId= 30;
	    
	    // 다운캐스팅 : chird : Human , Professor , Chird 를 내포하고 있고,
	    Chird ch05 = (Chird) pp1;
	    
	    // Human
	    ch05.name = "이순신";
	    // Professor
	    ch05.prfessorId = 333;
	    //Chird
	    ch05.chirdName = "아기";
	    
	    // 업캐스팅 : 명시를 하지 않더라도 자동으로 작동됨
	    // h01 : Human , Professor, Chird 
	    Human h01 = (Human) ch05;
	    
	    // Human 클래스를 객체화 해서 Human 타입  : Human
	    // hh01 : Human 
	    Human hh01 = new Human();
	    
	    // Human
	    hh01.age = 40;
	    
//	    Professor pp02 = (Professor) hh01 ; // 실행시 오류
	    
	    // Professor 를 객체화 해서 Human 타입으로 지정 :
	    // ppp01 : Human , Professor 
	    Human ppp01 = new Professor () ;
	   
	    //Human
	    ppp01.name = "김길동" ;
	    
	    // 다운 캐스팅 : Human ==> Professor 
	    Professor ppp02 = (Professor) ppp01;
	    
	    //Human
	    ppp02.name = "김";
	    
	    //Human
	    ppp02.prfessorId= 11;
	    
//	    Chird ch33 = (Chird) ppp02; // 실행시 오료 발생 해당 타입없음 실행은됨
	    
	    Chird ch44 = (ppp02 instanceof Chird ) ? (Chird) ppp02 : null ;  
	    
	    // 객체 instanceof 타입 : 객체에 타입이 존재하면 true
	    
	    System.out.println(ch44);
	    
	    
	    // Chird 를 객체화 해서 Chird 타입으로 지정 : 자신과 부모의 모든 필드와 메소드를 사용 할 수 있다.
	    // Human , Professor , Chird 
	    
	    Chird cc01 = new Chird();
	    
	    cc01.name = "김" ; //Human
	    cc01.prfessorId = 222; // Professor
	    cc01.chirdName = "손자" ; // Chird
	    
	    Professor p100 = cc01;  // 업캐스팅 : Chird ==> Professor
	    
	    Human hh100 = p100;    // 업캐스팅 : Professor ==> Human
	    
	    Chird cc100 = (Chird) hh100; // 다운캐스팅 : Human ==> Chird
	    cc100.age = 90 ;
	    
	    System.out.println(cc100.age);		
	    
	    
	  
	}

}
