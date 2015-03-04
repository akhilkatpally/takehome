package edu.sc.cse.coursestats;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

public class TestCouse_Constructor {

	@Test
	public void testingConstructor_Success_CourseName() {
		//fail("Not yet implemented");
		WeekTime starttime_c1=mock(WeekTime.class);
		WeekTime finishtime_c1=mock(WeekTime.class);
		Course c=new Course("CSCE",747,"Matthews",starttime_c1,finishtime_c1);
		 when(starttime_c1.getDay()).thenReturn("mon");
		//assertTrue(c.coursename=="software testing");
		//assertTrue(c.starttime.ampm==starttime_c1.day);
		assertEquals(c.starttime.day,starttime_c1.getDay());
	}
	@Test
	public void testingConstructor_Success_dept() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both deptartment names are same",c.dept=="CSCE");
	}
	@Test
	public void testingConstructor_failure_dept() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both the deptment name are different",c.dept=="CSE");
	}
	@Test
	public void testingConstructor_Success_number() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both course numbers are same",c.number==747);
	}
	@Test
	public void testingConstructor_failure_number() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both the numbers are different",c.number==715);
	}
	@Test
	public void testingConstructor_Success_instructor() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both instructor names are same",c.instructor=="Matthews");
	}
	@Test
	public void testingConstructor_failure_instructor() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
		assertTrue("both the instructor name are different",c.instructor=="Farkas");
	}
	/*@Test
	public void testingConstructor_Failure_CourseName() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course(starttime,finishtime,"software testing");
		assertFalse("both the Course name are different",c.coursename=="software");
		
	}
	@Test
	public void testingConstructor_gettermethod_Success_CourseName() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course(starttime,finishtime,"software testing");
		assertEquals(c.coursename,c.getCourseName());	
	}
	@Test
	public void testingConstructor_gettermethod_Success_StartTime() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course(starttime,finishtime,"software testing");
		assertEquals(c.starttime,c.getStartTime());	
	}
	@Test
	public void testingConstructor_gettermethod_Success_FinishTime() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		Course c=new Course(starttime,finishtime,"software testing");
		assertEquals(c.finishtime,c.getFinishTime());	
	}*/
}
