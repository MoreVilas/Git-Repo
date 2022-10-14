package com.greatlearning.library.model;

//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@Data
public class GreatLearning {

	private String courseName;
	private String courseType;
	private String instructorName;
	public GreatLearning() {
		super();
	}
	@Override
	public String toString() {
		return "GreatLearning [courseName=" + courseName + ", courseType=" + courseType + ", instructorName="
				+ instructorName + "]";
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public GreatLearning(String courseName, String courseType, String instructorName) {
		super();
		this.courseName = courseName;
		this.courseType = courseType;
		this.instructorName = instructorName;
	}

}
