package day13.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		//double d = Math.random();
		
		Random r = new Random();
		
		double d = r.nextDouble(); //0이상 ~ 1미만 사이의 랜덤값 
		System.out.println(d);
		
		int x = r.nextInt(); //정수범위의 랜덤값 (음수, 양수 다 나옴)
		System.out.println(x);
		
		int y = r.nextInt(10); // 0이상 ~ 10미만의 랜덤값
		System.out.println(y);
		
		
	}
}
