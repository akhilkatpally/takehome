package edu.sc.cse.coursestats;
//import static org.junit.Assert.*;
//import static org.hamcrest.MatcherAssert.assertThat;
//import org.junit.Test;
//import static org.hamcrest.object.HasToString.hasToString;;

public class WeekTime {
	public String day;
	public int hour;
	public int minate;
	public String ampm;
	public WeekTime(){
		
	}
	public  WeekTime(String day,int hour,int minate,String ampm){
		this.day=day;
		this.hour=hour;
		this.minate=minate;
		this.ampm=ampm;
		if(this.ampm=="pm"){
			this.hour=this.hour+12;
		}
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinate() {
		return minate;
	}
	public void setMinate(int minate) {
		this.minate = minate;
	}
	public String getAmpm() {
		return ampm;
	}
	public void setAmpm(String ampm) {
		this.ampm = ampm;
	}
	public String toString(){
		String str;
		str=day+" "+Integer.toString(hour)+" "+Integer.toString(minate)+" "+ampm;
		return str;
	}
	public int compare(WeekTime starttime,WeekTime finishtime){
		int result;
		if(((starttime.hour*60)+starttime.minate)==((finishtime.hour*60)+(finishtime.minate))){
				result=0;//returns 0 if the start time and finish time are equal
		}else if(((starttime.hour*60)+starttime.minate)<((finishtime.hour*60)+(finishtime.minate))){
			result=1; // returns 1 if start time is less finish time
		}else{
			result=-1; // returns -1 if start time is more than finish time
		}
		return result;
	}
	
	
}
