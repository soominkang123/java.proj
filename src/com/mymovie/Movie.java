package com.mymovie;

public class Movie {

	
		private String title;   // 영화 제목 
		private String director; // 영화 감독
		private int grade;  // 영화 등급
		private String genre; // 영화 장르
	
		// 기본생성자
		 Movie(){}
		
		 Movie(String title, String director, int grade, String genre) 
		{
			this.title = title;
			this.director = director;
			this.grade = grade;
			this.genre = genre;
		}

		// getter 및 setter 메소드
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		@Override
		public String toString() {
			return "Movie [title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre + "]";
		}

		

	
	
		

   
      
    
	
	
}
