package edu.sc.cse.coursestats;

public class Course {
	 public String dept;
	 public int number;
	 public String instructor;
	 WeekTime starttime;
	 WeekTime finishtime;
	 public Course(String d, int num, String instr,WeekTime st,WeekTime ft){
		 dept = d;
		 number = num;
		 instructor = instr;
		 starttime=st;
		 finishtime=ft;
	 }
	 public String toString(){
		 String  str;
		 //str = "CSCE" + "109" + "Matthews";
		 str = dept + Integer.toString(number)+instructor+starttime.toString()+finishtime.toString();
		 return str;
	 }
	 public String compare(Course c1,Course c2){
			
			int st2=((c2.starttime.hour)*60)+(c2.starttime.minate);
			
			int st1=((c1.starttime.hour)*60)+(c1.starttime.minate);
			
			int ft1=((c1.finishtime.hour)*60)+(c1.finishtime.minate);
			
			int ft2=((c2.finishtime.hour)*60)+(c2.finishtime.minate);
			
			if((c1.starttime.day==c2.starttime.day) && (c1.finishtime.day==c2.finishtime.day)){
				
				if(((st1 <= st2) && (st2<= ft1)) || (ft2 >= st1)&&(ft2<=ft1)){
						return "cannot take the course";
				}
				else{
					return "can take the course";
				}
				
			}
			else{
				return "can take the course";
			}
		}
}
