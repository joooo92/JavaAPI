package day12.api.lang.sb;

public class StringBuilderEx02 {
	public static void main(String[] args) {
		
		// 문자열과 향상된문자열 의 차이
		
		long start = System.currentTimeMillis();
		
		/*
		String str = "A";  >>>>>>>>>>>>> 오래걸림  ;; 7초
		for(int i = 1; i <= 300000; i++) {
			str = str + "A";
		}
		 */

		StringBuilder sb = new StringBuilder("A"); // >>>>호다닥 됨 ;; 0.006초
		for(int i = 1; i <= 300000; i++) {
			sb.append("A");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("수행시간: " + (end-start) * 0.001);
		
		
		
		
	}

}
