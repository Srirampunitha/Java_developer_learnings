package com.Sriram.sprinbootlearning.Springbootlearn;


public class Courses {
   private int id ;
   private String course ;
   private String author ;
   
   public Courses (int id ,String course,String author) {
	   this.id= id ;
	   this.course =course;
	   this.author =author;
   }

public int getId() {
	return id;
}

public String getCourse() {
	return course;
}

public String getAuthor() {
	return author;
}


//public String toString() {
//	return "Courses [id=" + id + ", course=" + course + ", author=" + author + "]";
//}
   
   
}
