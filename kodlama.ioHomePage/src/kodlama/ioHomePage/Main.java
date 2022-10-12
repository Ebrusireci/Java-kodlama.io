package kodlama.ioHomePage;

import java.util.List;

import kodlama.ioHomePage.business.CourseManager;
import kodlama.ioHomePage.core.logging.DatabaseLogger;
import kodlama.ioHomePage.core.logging.FileLogger;
import kodlama.ioHomePage.core.logging.Logger;
import kodlama.ioHomePage.course.Course;
import kodlama.ioHomePage.course.HibernatesCourseContents;
import kodlama.ioHomePage.course.JdbcCourseContents;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Java", 2000);
	    Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		CourseManager courseManager = new CourseManager(new JdbcCourseContents(), loggers);
		courseManager.add(course1);

	}

}
 