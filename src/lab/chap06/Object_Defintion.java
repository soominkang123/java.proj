package lab.chap06;

class Animal {
	
	// 1. 필드
	String animalName;
	String aColor;
	int aLeg ;              // 팔다리 갯수
	int aSpeed ;
    String aCry ;
    
    
    // 생성자 : 필드의 기본 값을 입력 하는 생성자
    Animal (String aName , String aColor , int aLeg ,int aSpeed, String aCry) {
		this. animalName = aName;
		this. aColor = aColor;
		this. aLeg = aLeg;
		this. aSpeed = aSpeed;
		this. aCry = aCry;
		}
    // 메소드 : 필드의 모든 값을 출력 하는 메소드
    void printAll() {
		System.out.println("동물이름 : " + animalName);
		System.out.println("동물색 : " + aColor);
		System.out.println("동물속도 : " + aSpeed);
		System.out.println("동물다리수 : " + aLeg);
		System.out.println("동물울음소리 : " + aCry);
	}
       
    // 메소드 : int abc() { return aLeg + aSpeed ;}
    int legSpeed() {
		return aLeg + aSpeed;
	}
   
    //메소드 :  다리의 개수와 속도를 출력
  	void lS() {
  	System.out.println(animalName + "의 다리는 " + aLeg + " 개 이고, " + "속도는 " + aSpeed + " 입니다.");
  	}
    
    
}

public class Object_Defintion {

	public static void main(String[] args) {
		// 객체 생성 및 테스트 
		
		// 호랑이 , 독수리 , 사자 개,
		// 호랑이 
				Animal a1 = new Animal("호랑이", "노랑", 4, 100 , "어흥");
				a1.printAll();
				System.out.println("다리의 개수와 속도는 : " + a1.legSpeed());
				a1.lS();
				System.out.println("=========================================");
				
				// 독수리
				Animal a2 = new Animal("독수리", "검정", 2, 130 , "끽");
				a2.printAll();
				System.out.println("다리의 개수와 속도는 : " + a2.legSpeed());
				a2.lS();
				
				System.out.println("=========================================");
				
				// 사자
				Animal a3 = new Animal("사자", "노랑", 4, 100 , "어흥");
				a3.printAll();
				System.out.println("다리의 개수와 속도는 : " + a3.legSpeed());
				a3.lS();
				
				System.out.println("=========================================");
				
				// 개
				Animal a4 = new Animal("개", "노랑", 4, 80 , "왈왈");
				a4.printAll();
				System.out.println("다리의 개수와 속도는 : " + a4.legSpeed());
				System.out.println("=========================================");
				a4.lS();
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
}
