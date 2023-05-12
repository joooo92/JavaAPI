package day12.api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {

		double d = Math.random();
		// int r = (int)(Math.random() * 10) + 1; //1<= r <10
		
		
		//abs 절대값 
		double d2 = Math.abs(-3.14); 
		System.out.println(d2);
		
		//ceil 올림
		double d3 = Math.ceil(3.14);
		System.out.println(d3);
		
		//floor 내림
		double d4 = Math.floor(3.14);
		System.out.println(d4);
		
		//round 반올림
		double d5 = Math.round(3.5);
		System.out.println(d5);
		
		//max 둘중 큰수 (타입은 여러개)
		int a1 = Math.max(3, 5);
		System.out.println(a1);

		//min 둘중 작은수 (타입은 여러개)
		int a2 = Math.min(3, 5);
		System.out.println(a2);
				
		
		
		
		
		
		
	}

}
