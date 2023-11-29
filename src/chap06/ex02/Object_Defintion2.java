package chap06.ex02;

// 외부 클래스 : Public class 는 하나만 올 수 있다.

class Student { // 클래스 : 설계도 ===> 객체화 ( 인스턴스화) , 객체  : RAM
	// 필드 , 메소드 , 생성자, 이너클래스(클래스내부의 클래스)
	
	// 객체 : 보이는 모든 사물, 
	//1. 필드 : 객체가 가지는 속성값
	String name ;     // 이름
	int num ;         // 학번
	int kor ;         // 국어성적
	int eng ;        // 영어성적
	int math ;       // 수학성적
	
	// 2. 기본 생성자 : 다른 생성자가 없을때 생략 가능  
//	Student (){}    // 기본생성자
	
	// 3. 메소드 : 필드의 값을 조작해서 출력 , 인풋 , 출력
	     // 호출시 작동
	void printAll () {  // 필드에 등록된 내용을 출력                  //(객체이름. 메소드 호출)
		System.out.println("이름 :" + name);
		System.out.println("학번 :" + num);
		System.out.println("국어성적 :" + kor);
		System.out.println("영어성적 :" + eng);
		System.out.println("수학성적 :" + math);
		
	}
	
	double avg( ) {
		double avgAll = 0.0;
		//필드의 모든 값을 더해서 평균을 계산해서 리턴 
		avgAll = (kor + eng + math ) / 3.0 ;
		return avgAll;
		
	}
	int plus (int a , int b) {
		int hap =  a + b;
		
		return hap ;
	}
	          // T68 홍길동         이순신
	String abc (String name , String name2) {
		
		return name + " + " + name2 ;
		
	}
	
	
}

class Car {
	
	// 1.  필드 선언
	String carName ;
	String carColor ;
	double carSpeed;
	int carDoor ;
	
	// 2. 생성자 : 리턴타입이 없는 메소드 , 클래스 이름과 동일 , 필드의 값을 초기화
	
	Car() {}
	// 생성자 : 인풋 값이 있는 생성자 
	Car (String carName , String carColor, double carSpeed, int carDoor) {
	     this.carName = carName;
	     this.carColor = carColor;
	     this.carSpeed = carSpeed ;
	     this.carDoor = carDoor ;
	}
	
	// 메소드 : 프로그램의 기능 , 호출시 작동
	void printAll( ) {
		System.out.println(" 자동차이름 : " + carName);
		System.out.println(" 자동차이름 : " + carColor);
		System.out.println(" 자동차이름 : " + carSpeed);
		System.out.println(" 자동차이름 : " + carDoor);
	}
	
}
public class Object_Defintion2 {
	public static void main(String[] args) {
		
		// 1. 객체 생성 테스트 : 반드시  main 메소드에서 실행  // ctrl shift 누르고 spacebar
		Student s1 = new Student();
		
		// 2. 객체의 모든 필드 출력 : s1. printAll();
	
		// 메소드 호출
		s1.printAll();
		
	    System.out.println(s1.plus(20 , 50)); //70 // 리턴 : 호출한 곳으로 값을 돌려줌 
	    
	    System.out.println(s1.abc("홍길동","이순신"));
	    System.out.println("================");
	    
	    // 3. s1 객체의 필드의 값을 주입 // 직접 입력 , 생성자, setter 를 통해서 값을 입력
	    s1.name = "이길동" ;
	    s1.num = 1111;
	    s1.kor = 77;
	    s1.eng = 88 ;
	    s1.math = 99 ;
	    
	    s1.printAll();
	    System.out.println("===========================");
	    System.out.println(" 평균점수 : "+ s1.avg());
	    
	    System.out.println("==========================");
	    Student s2 = new Student();
	    s2.name = "이소라" ;
	    s2.num = 2222;
	    s2.kor = 100;
	    s2.eng = 75 ;
	    s2.math = 55 ;
	    
	    System.out.println("평균출력 :" + s2.avg());
        s2.printAll();
        
        System.out.println("========================"); 
        // Car 객체 생성 
        Car car1 = new Car();        // 오류 발생 
        car1.printAll();
        
        System.out.println("=========================");
        Car car2 = new Car(" 투스카니 " , "빨간색" , 250.0, 4);
        car2.printAll();
        
        System.out.println("======================");
        
        System.out.println("=========================");
        Car car3 = new Car(" 그랜저 " , "검은색" , 300.0, 4);
        car3.printAll();
        
	}

}
