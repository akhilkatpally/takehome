package edu.sc.cse.coursestats;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;




public class TestClass {
	@Test
	public void testsucess_returnEmpty() {
		//fail("Not yet implemented");
		WeekTime starttime_c1=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime_c1=new WeekTime("mon",1,45,"pm");
		WeekTime starttime_c2=new WeekTime("tue",2,30,"pm");
		WeekTime finishtime_c2=new WeekTime("tue",3,15,"pm");
		
		Course c1=new Course("CSCE",747,"Matthews",starttime_c1,finishtime_c1);
		Course c2=new Course("CSCE",727,"Farkas",starttime_c2,finishtime_c2);
		//Course c=new Course();
		assertThat("Checking whether it is returning empty string or not","",is(equalTo(c1.compare(c1,c2))));
	}
	@Test
	public void testsucess_canTakeTheCourse() {
		//fail("Not yet implemented");
		WeekTime starttime_c1=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime_c1=new WeekTime("mon",1,45,"pm");
		WeekTime starttime_c2=new WeekTime("tue",2,30,"pm");
		WeekTime finishtime_c2=new WeekTime("tue",3,15,"pm");
		
		Course c1=new Course("CSCE",747,"Matthews",starttime_c1,finishtime_c1);
		Course c2=new Course("CSCE",727,"Farkas",starttime_c2,finishtime_c2);
		//Course c=new Course();
		assertThat("can take the course",is(equalTo(c1.compare(c1,c2))));
	}
	@Test
	public void testfailure_canTakeTheCourse(){
		WeekTime starttime_c1=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime_c1=new WeekTime("mon",1,45,"pm");
		WeekTime starttime_c2=new WeekTime("tue",2,30,"pm");
		WeekTime finishtime_c2=new WeekTime("tue",3,15,"pm");
		
		Course c1=new Course("CSCE",747,"Matthews",starttime_c1,finishtime_c1);
		Course c2=new Course("CSCE",727,"Farkas",starttime_c2,finishtime_c2);
		assertThat("cannot take the course",is(equalTo(c1.compare(c1,c2))));
	}
	@Test
	public void testsucess_cannotTakeTheCourse() {
		//fail("Not yet implemented");
		WeekTime starttime_c1=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime_c1=new WeekTime("mon",1,45,"pm");
		WeekTime starttime_c2=new WeekTime("mon",1,30,"pm");
		WeekTime finishtime_c2=new WeekTime("mon",2,45,"pm");
		
		Course c1=new Course("CSCE",747,"Matthews",starttime_c1,finishtime_c1);
		Course c2=new Course("CSCE",727,"Farkas",starttime_c2,finishtime_c2);
		//Course c=new Course();
		assertThat("cannot take the course",is(equalTo(c1.compare(c1,c2))));
	}
	@Test
	public void testfailure_cannotTakeTheCourse() {
		//fail("Not yet implemented");
		WeekTime starttime_c1=new WeekTime("mon",00,30,"pm");
		WeekTime finishtime_c1=new WeekTime("mon",1,45,"pm");
		WeekTime starttime_c2=new WeekTime("mon",00,45,"pm");
		WeekTime finishtime_c2=new WeekTime("mon",2,00,"pm");
		
		Course c1=new Course("CSCE",747,"Matthews",starttime_c1,finishtime_c1);
		Course c2=new Course("CSCE",727,"Farkas",starttime_c2,finishtime_c2);
		//Course c=new Course();
		assertThat("can take the course",is(equalTo(c1.compare(c1,c2))));
	}

}
