package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	
	public static void main(String[] args) {
		
		//ArrayDeque<Integer> que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		//뒤에서 추가
		que.offer(1);
		que.offer(2);
		que.offer(3);
		que.offer(4);
		
		System.out.println(que.toString());
		
		//앞에서 꺼내기
		int n = que.pollFirst();
		System.out.println("반환된 원소: " + n);
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println(que.toString());
		
		System.out.println("===========================================");
		
		//앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println(que.toString());
		
		//뒤에서 꺼내기
		que.pollLast();
		System.out.println(que.toString());
		
		
		//[4,3,2]
		//list의 get처럼 "앞에서 or 뒤에서" 값 확인만 하기 
		System.out.println(que.peekFirst());
		System.out.println(que.peekLast());
		// ^큐는 변함이 없음. 그냥 구경만 한거임
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
