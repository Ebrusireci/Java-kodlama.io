package kodlama.ioHomePage.business;

import kodlama.ioHomePage.course.JdbcCourseContents;

import java.util.List;

import kodlama.ioHomePage.core.logging.Logger;
import kodlama.ioHomePage.course.Course;
import kodlama.ioHomePage.course.CourseContents;

public class CourseManager {
private CourseContents courseContents;
private Logger[] loggers;


	public CourseManager(CourseContents courseContents,Logger[] loggers) {
	this.courseContents = courseContents;
	this.loggers = loggers;
}
	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		
		}
		courseContents.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
			
		}
		
	}

}
