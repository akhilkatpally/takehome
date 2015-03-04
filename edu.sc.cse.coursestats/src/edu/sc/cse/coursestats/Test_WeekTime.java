package edu.sc.cse.coursestats;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.object.HasToString.hasToString;


import org.junit.Test;

public class Test_WeekTime {

	/*@Test
	public void test_WeekTime_compare_equaltime_success() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",1,45,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		WeekTime object_reference= new WeekTime();
				assertThat(0,is(equalTo(object_reference.compare(starttime, finishtime))));
	}
	@Test
	public void test_WeekTime_compare_equaltime_failure() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",1,45,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		WeekTime object_reference= new WeekTime();
				assertThat("failed the test case by keeping the actual value wrong",1,is(equalTo(object_reference.compare(starttime, finishtime))));
	}
	@Test
	public void test_WeekTime_compare_starttimemore_success() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",2,45,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		WeekTime object_reference= new WeekTime();
				assertThat(-1,is(equalTo(object_reference.compare(starttime, finishtime))));
	}
	@Test
	public void test_WeekTime_compare_starttimemore_failure() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",2,45,"pm");
		WeekTime finishtime=new WeekTime("mon",1,45,"pm");
		WeekTime object_reference= new WeekTime();
				assertThat("failed the test case by keeping the actual value wrong",0,is(equalTo(object_reference.compare(starttime, finishtime))));
	}
	@Test
	public void test_WeekTime_compare_finishtimemore_success() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",2,45,"pm");
		WeekTime finishtime=new WeekTime("mon",3,45,"pm");
		WeekTime object_reference= new WeekTime();
				assertThat(1,is(equalTo(object_reference.compare(starttime, finishtime))));
	}
	@Test
	public void test_WeekTime_compare_finishtimemore_failure() {
		//fail("Not yet implemented");
		WeekTime starttime=new WeekTime("mon",2,45,"pm");
		WeekTime finishtime=new WeekTime("mon",3,45,"pm");
		WeekTime object_reference= new WeekTime();
				assertThat("failed the test case by keeping the actual value wrong",-1,is(equalTo(object_reference.compare(starttime, finishtime))));
	}*/
	//WeekTime.toString()
	
	@Test
	public void test_toString_returnsEmptyString(){
		WeekTime weektime = new WeekTime("mon",2,45,"pm");
		assertThat("checking if it is returning empty string","",is(equalTo(weektime.toString())));
	}
	@Test
	public void test_toString_success(){
		WeekTime weektime = new WeekTime("mon",2,45,"pm");
		assertThat("checking if the string returned is having the spaces between the words","mon 2 45 pm",is(equalTo(weektime.toString())));
	}
	@Test
	public void test_toString_failure(){
		WeekTime weektime = new WeekTime("mon",2,45,"pm");
		assertThat("mon245pm",is(equalTo(weektime.toString())));
	}
	/*@Test
	public void test_toString_checking_day_success(){
		
		WeekTime weektime = new WeekTime(day,hours,minate,ampm);
		assertEquals(weektime.toString(),contains("mon 2 45 pm"));
		
		//assertThat(this.hashCode(),equalTo(weektime.hashCode()));
	}*/
	@Test
	public void test_hasToString_returns_emptyString(){
		WeekTime weektime=new WeekTime("mon",2,45,"pm");
		assertThat("checking whether it is returning empty string",weektime,hasToString(""));
	}
	@Test
	public void test_hasToString_success(){
		WeekTime weektime=new WeekTime("mon",2,45,"pm");
		assertThat(weektime,hasToString("mon 2 45 pm"));
	}
	@Test
	public void test_hasToString_failure(){
		WeekTime weektime=new WeekTime("mon",2,45,"pm");
		assertThat(weektime,hasToString("mon245pm"));
	}
}
