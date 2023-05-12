package day12.api.lang.system;

public class MainClass {
	
	public static void main(String[] args) {
	
		//System 클래스는 전부 static메서드로 선언되어 있습니다. 
		
		//System.exit(0); <- 프로그램 강제종료
		
		//1970년 1월 1일~~ 현재까지 시간을 밀리초 반환
		//간단한 프로그램 시간 체크
		long start = System.currentTimeMillis();
		
		int sum = 0;
		for(long i = 0; i < 1000000; i++) {
			sum += i;
			System.out.println(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) * 0.001);
		
		
		
		
		
		
		
	}

}
