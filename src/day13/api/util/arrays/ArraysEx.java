package day13.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7};
		
		//sort - 오름차순으로 정렬
		Arrays.sort(arr);
		//배열을 문자열로 확인할 수 있음
		System.out.println(Arrays.toString(arr));
		
		
		//binarySearch - 탐색 (배열명, 찾을값) -> 찾는값이 있으면 인텍스번호로 리턴, 없으면 음수값 리턴 
		//선행조건으로 정렬이 필수로 되어있어야됨!!!!!!!!!
		int result = Arrays.binarySearch(arr, 4);
		System.out.println(result); // 없으니 음수값으로 리턴!!
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); // 있으니 인덱스 번호로 리턴!!
		
		//copyOf배열복사 (복사하고싶은 배열, 새로운 배열의 길이)
		int[] newArr = Arrays.copyOf(arr, arr.length+3);
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr); // 다름. 깊은복사로 완전히 새로운 배열을 만들었기 때문에 주소값이 다름
	
		int[] newArr2 = Arrays.copyOf(arr,arr.length *2);
		System.out.println(Arrays.toString(newArr2));
		
		//copyOfRange (복사하고싶은 배열, 인덱스 이상, 인덱스 미만)
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3); //newArr[1]이상 newArr[3] 미만
		System.out.println(Arrays.toString(newArr3));
		
		//배열의 원소비교
		if(Arrays.equals(newArr, arr)) {
			System.out.println("배열의 원소가 정확히 일치함");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
