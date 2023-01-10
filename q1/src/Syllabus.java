

import java.util.List;

public class Syllabus {

	/**
	 * 
	 */
	public String CourseDetails;
	/**
	 * 
	 */
	public List<Courses> courses;
	/**
	 * 
	 */
	public String SyllabusDetails;
	/**
	 * Getter of CourseDetails
	 */
	public String getCourseDetails() {
	 	 return CourseDetails; 
	}
	/**
	 * Setter of CourseDetails
	 */
	public void setCourseDetails(String CourseDetails) { 
		 this.CourseDetails = CourseDetails; 
	}
	/**
	 * Getter of courses
	 */
	public List<Courses> getCourses() {
	 	 return courses; 
	}
	/**
	 * Setter of courses
	 */
	public void setCourses(List<Courses> courses) { 
		 this.courses = courses; 
	}
	/**
	 * Getter of SyllabusDetails
	 */
	public String getSyllabusDetails() {
	 	 return SyllabusDetails; 
	}
	/**
	 * Setter of SyllabusDetails
	 */
	public void setSyllabusDetails(String SyllabusDetails) { 
		 this.SyllabusDetails = SyllabusDetails; 
	} 

}