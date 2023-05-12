package day13.collection.list;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		/*
		 * LinkedList >> 삽입과 삭제가 좋음 
		 * => 순서O, 중복O
		 * => 노드객체(양방향 연결리스트) - 삽입과 삭제가 좋음
		 * 삽입, 삭제는 ArrayList보다 좋으나 탐색은 느립니다.
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//list와 기능은 동일합니다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(3, 10); //3번째 인덱스에 10 추가
		System.out.println(list.toString());
		
		//값 얻기 get()
		int n = list.get(3);
		System.out.println(n);
		
		//값 삭제 remove()
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("===================================================");
		
		//linklist는 queue의 기능을 구현하기 떄문에 queue기능도 사용이 가능
		list.offer(10);
		list.offer(11);
		
		System.out.println(list.toString());
		
		//선출
		int r = list.poll();
		System.out.println(r);
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
