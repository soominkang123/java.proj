package chap10.ex01;

public class Student extends Human{  // 자식 클래스    사람 : 부모 ( super class )
	
	// Human 클래스의 필드와 메소드가 Student 클래스로 상속
	
	// 기본 생성자 생략됨
	Student () {
		super();  // 부모클래스의 () 생성자를 호출
	}
	Student(int studentID) {
		super("김똘똘", 20);  // 부모클래스의 인풋이 2개인 생성자 호출
		this.studentID= studentID;
		this.stuName = super.name;
		super.eat();
	}
	
	// 필드 : 
	String stuName ;
	int studentID ;
	
	//메소드 :
    void goToSchool () {
   	System.out.println(" 모든 학생은 학교를 갑니다. ");
    }
	
    void stuinfo () {
    	System.out.println(" 학생이름은 " + name + " 이고, 나이는 " + age + " 입니다. " );
    }
	
	
	

}
