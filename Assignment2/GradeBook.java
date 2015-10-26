package com.ctu.dietel.chapter3;

//GradeBook class with a constructor to initialize the course name and Instructor name

public class GradeBook {
	private String courseName; // course name for this GradeBook
	private String courseInstructor; // course Instructor name for this GradeBook

	// constructor initializes courseName and Instructor name with String arguments
	public GradeBook(String name, String courseInstructorName) // constructor name is class name 
	{
		courseName = name; // initializes courseName
		courseInstructor = courseInstructorName; // initializes course Instructor name
	} // end constructor

	// method to set the course name
	public void setCourseName(String name) {
		this.courseName = name; // store the course name
	} // end method setCourseName

	// method to retrieve the course name
	public String getCourseName() {
		return courseName;
	} // end method getCourseName

	// method to retrieve the course Instructor name
	public String getCourseInstructor() {
		return courseInstructor;
	} // end method getCourseInstructor

	// method to set the Course Instructor name
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	} // end method setCourseInstructor

	// display a welcome message to the GradeBook user
	public void displayMessage() {
		// this statement calls getCourseName to get the name of the course this GradeBook represents
		System.out.printf("Welcome to the grade book for %s!\n ", getCourseName());
		// this statement calls getCourseInstructor to get the course Instructor name
		System.out.println("This course is presented by: " + getCourseInstructor());
	} // end method displayMessage
} // end class GradeBook
