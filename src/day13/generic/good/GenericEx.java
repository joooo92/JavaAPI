package day13.generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String 과 String의 자식들
		//제네릭<? super String> = String타입이 될 수 있다면 전달 가능
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		//무엇이든 다 받을 수 있는 애들
		add1(list1);
		add1(list2);
		add1(list3);
		
		//extends String
		add2(list1); // String O
		//add2(list2); // integer X
		//add2(list3); // Object X
		
		//super String
		add3(list1); // String O
		//add3(list2); // integer X
		add3(list3); // Object O
		
		
		
		
		
	}
	
	//
	public static void add1(List<?> list) {
	}

	public static void add2(List<? extends String> list) {
	}
	
	public static void add3(List<? super String> list) {
	}

	
	
	
	
	
	
}
