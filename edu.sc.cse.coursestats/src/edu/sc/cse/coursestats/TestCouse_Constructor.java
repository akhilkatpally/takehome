package edu.sc.cse.coursestats;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestCouse_Constructor {

	
	@Test
	public void testingConstructor_Success_dept() {
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both deptartment names are same",c.dept=="CSCE");
	}
	@Test
	public void testingConstructor_failure_dept() {
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both the deptment name are different",c.dept=="CSE");
	}
	@Test
	public void testingConstructor_Success_number() {
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both course numbers are same",c.number==747);
	}
	@Test
	public void testingConstructor_failure_number() {
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both the numbers are different",c.number==715);
	}
	@Test
	public void testingConstructor_Success_instructor() {
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both instructor names are same",c.instructor=="Matthews");
	}
	@Test
	public void testingConstructor_failure_instructor() {
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both the instructor name are different",c.instructor=="Farkas");
	}
	
}
