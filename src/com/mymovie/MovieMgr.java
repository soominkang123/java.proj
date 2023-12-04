package com.mymovie;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr {

	private List<Movie> movies; // 영화 리스트
	private int index; // 방번호를 출력하는 변수
	
	// 기본 생성자
	public MovieMgr() {
		movies = new ArrayList<>(); //movies 리스트 초기화
		index = 1; // 방번호 초기값 설정
	}
	
	// 영화 정보를 추가하는 메소드
	public void add(Movie m) {
		movies.add(m); 
		System.out.println("영화 정보가 추가되었습니다. ");
		
	}
	// 모든 영화 정보를 출력하는 메소드
		public void search() {
		System.out.println("===영화 정보를 모두 출력===");
		for (Movie movie : movies ) {
		System.out.println(movie); //각 영화 정보 출력
		}
	}
	// 제목으로 영화 정보를 검색
		public void search(String title) {
		System.out.println("===== '" + title + "' 제목으로 영화 정보를 검색 =====");
		for (Movie movie : movies) {
		if(movie.getTitle().equals(title)) {
		System.out.println(movie); // 각 영화정보 출력
		return;
				}
				
			}
		System.out.println("해당 제목의 영화를 찾을 수 없습니다.");
		}
  

	// 감독명으로 영화 정보를 검색
		public void searchDirector(String name) {
		System.out.println("===== '" + name + "' 감독명으로 영화 정보를 검색 =====");
		for (Movie movie : movies) {
		if(movie.getDirector().equals(name)) {
		System.out.println(movie); // 해당 감독의 영화 정보 출력
				}
					
			}
		}

		// 장르로 영화 정보를 검색하는 매서드
		 public void searchGenre(String genre) {
		 List<Movie> result = new ArrayList<>();
		 for( Movie movie : movies) {
		  if(movie.getGenre().equals(genre)) {
		  result.add(movie); //해당 장르의 영화를 결과 리스트에 추가
			  }
		  }
		  return ;
			
		}
		// 제목으로 영화 정보를 삭제하는 메서드
		    public void delete(String title) {
		    for (Movie movie : movies) {
		    if (movie.getTitle().equals(title)) {
		     movies.remove(movie); // 해당 제목의 영화 삭제
		     System.out.println("영화 정보가 삭제되었습니다.");
		      return;
		           }
		        }
		        System.out.println("해당 제목의 영화를 찾을 수 없습니다.");
		    }
	}
	

	
	
	
	
	
	
	