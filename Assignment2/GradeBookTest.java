package com.ctu.dietel.chapter3;

public class GradeBookTest {
	// main method begins program execution
	public static void main(String[] args) {
		// create GradeBook object
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming", "Madhava Bhima");
		GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java", "Madhava Bhima");

		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
		
	} // end main
} // end class GradeBookTest