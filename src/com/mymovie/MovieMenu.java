package com.mymovie;

import java.util.Scanner;

public class MovieMenu {
	
	Scanner sc = new Scanner(System.in) ;
	MovieMgr mg = new MovieMgr(); 
	
	// 기본 생성자
	public MovieMenu() {}
	
	int select; 	// 선택 
	
	// 영화 정보 출력
	public void movieMenu() 
	{
		System.out.println("영화 정보를 출력합니다.");
		
		boolean flag = true; 
	out:	do {
			System.out.println("============================");
			System.out.println("1. 영화정보 입력 ");
			System.out.println("2. 영화정보 전체 출력");
			System.out.println("3. 영화 제목으로 출력");
			System.out.println("4. 영화 감독명으로 출력");
			System.out.println("5. 영화 장르명로 출력 ");
			System.out.println("6. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("============================");
			System.out.println("위의 번호를 선택하세요>>>>");
			select = sc.nextInt(); 
			
			switch (select) {
			case 1:
				System.out.println("영화명을 입력하세요>>>");
				String title = sc.next(); 
				System.out.println("감독명을 입력하세요>>>");
				String director = sc.next(); 
				System.out.println("등급을 입력하세요>>>");
				int grade = sc.nextInt(); 
				System.out.println("장르를 입력하세요>>>");
				String genre = sc.next(); 
				
				mg.add(new Movie(title, director, grade, genre));
				System.out.println("성공적으로 추가되었습니다.");
				System.out.println("============================");
				break; 
				
			case 2:
				System.out.println(" 추가된 영화의 정보입니다.");
				mg.search();
				System.out.println("======================");
				break; 
				
				
			case 3:
				System.out.println("검색할 영화 명을 입력하세요:");
				String sTitle = sc.next();
				mg.search(sTitle);
				System.out.println("=======================");
				break; 
				
			case 4:
				System.out.println("검색할 감독 명을 입력하세요: ");
				String sDirector =sc.next();
				mg.searchDirector(sDirector);
				System.out.println("======================");
				break; 
			
			case 5:
				System.out.println("검색할 영화 장르를 입력하세요 :");
				String sGenre = sc.next();
				System.out.println("========================");
				break; 
				
			case 6:
				System.out.println("삭제할 영화 명을 입력하세요: ");
				String dTitle = sc.next();
				mg.delete(dTitle);
				System.out.println("==================");
				break;
				
			case 0:	
				
				break out; 
			
			}
			
			
			
		}while (flag); 
	System.out.println("프로그램을 종료 합니다. ");
	sc.close();
	}
	
	
	
	 
	
}
