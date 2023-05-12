package day13.collection.list;

import java.util.List;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		
		/*
		 * Stack
		 * -> List in First Out
		 * -> push(), pop()
		 * 
		 */
		
		Stack<String> stack = new Stack<>();
		
		//값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop(); // 가장 나중에 들어간거 먼저 뺌
		System.out.println("pop: " + n);
		System.out.println(stack.toString());
		
		System.out.println("pop: " + stack.pop());
		System.out.println(stack.toString());
		System.out.println("pop: " + stack.pop());
		System.out.println(stack.toString());
		
		
		
		
		
		
		
		
		
		
	}

}
