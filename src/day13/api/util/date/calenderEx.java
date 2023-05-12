package day13.api.util.date;

import java.util.Calendar;

public class calenderEx {
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); < 이렇게는 사용 못함
		
		//static메서드를 사용해서 객체를 반환하는 모형(변수가 객체를 가지고 있는 모형)
		Calendar cal = Calendar.getInstance(); 
		
		System.out.println(Calendar.YEAR); //1
		System.out.println(Calendar.MONTH); //2
		System.out.println(Calendar.DATE); //5
		
		int year = cal.get(Calendar.YEAR); //년
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH + 1); //월  << Calendar.MONTH의 경우 1작게나와서 +1을 해줘야됨
		System.out.println(month);
		
		int day = cal.get(Calendar.DATE); //일
		System.out.println(day);
		
		int hour = cal.get(Calendar.HOUR); //시
		int min = cal.get(Calendar.MINUTE); //분
		int sec = cal.get(Calendar.SECOND); //초
		System.out.println(hour + ":" + min + ":" + sec);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
