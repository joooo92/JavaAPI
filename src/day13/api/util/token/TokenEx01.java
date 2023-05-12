package day13.api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {
	public static void main(String[] args) {
		
		//빠른 문자열 분리 
		//split() > 특정 문자를 기준으로 배열형태로 자름
		//toCharArray() > 한글자 분리
		
		
		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";
		//공백 기준으로 분리된건가????????????????????????????
		StringTokenizer token1 = new StringTokenizer(str1);
		
		//토큰의 개수 확인
		int cnt = token1.countTokens(); // 잘라진 토큰이 몇개인지 알 수 있음
		System.out.println("나눠진 문자열 개수: " + cnt);

		//다음 토큰의 확인
		//System.out.println(token1.nextToken()); // 한번 전진하면 끝 후진은 없음 < 단독으로는 사용 안하는 것이 좋음
		
		//다음 토큰의 여부확인
		System.out.println(token1.hasMoreTokens());
		
		while(token1.hasMoreTokens() != false) {
			
			System.out.println(token1.nextToken());
			
		}
		
		System.out.println("=========================================================");
		
		//다양한 구분자들 한번에 지정해서 토큰화 가능 
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		// 특정 문자(특수문자 포함)기준_구분자_ 으로 자름. 한개 뿐만 아니라 여러개도 사용가능v 
		// 구분자는 삭제됨
		StringTokenizer token2 =  new StringTokenizer(str2, "-/.");
		
		while(token2.hasMoreTokens() != false) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("=====================================================");
		
		//구분자를 토큰에 포함시킴
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);
		
		for(int i = 1 ; token3.hasMoreTokens() ; i++) {
			System.out.println(token3.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
