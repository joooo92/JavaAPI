package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		// 기본적인 날짜의 형식
		Date date = new Date();
		System.out.println(date);
		
		int year = date.getYear();// 현재년도에서 1900년 뺀 값이 나온다. 
		System.out.println(year);
		
		long millis = date.getTime();// 날짜연산을 할때사용 -> '1970년1월1일00시' 기준으로 밀리초로 바꿔주는 클래스
		System.out.println(millis); 
		
		Date date2 = new Date(System.currentTimeMillis() + 1000); 
		System.out.println(date2);
		
		//date - date2 의 연산은 불가능. 숫자형식이 아니기 때문
		long millis2 = date2.getTime();
		System.out.println(millis2 - millis); // 시간의 차이를 확인하기 위해서는 이렇게 get.Time()사용해서 출력
		
		//사람이 보기편한 날짜로 변환(년 월 일 시:분:초) > ("yyyy MM dd hh:mm:ss")
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		String now = sdf.format(date);
		System.out.println(now);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
