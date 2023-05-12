package day14.api.io.Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		/*
		 * 1. 파일을 쓸때 사용하는 클래스는 FileOutStream입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 경로가 들어갑니다.
		 * 3. io패키지 거의 모든 클래스는 생성자에 throws 가 있기때문에 반드시 예외처리 문장안에서 사용합니다.
		 */
		
		//new FileOutputStream("경로");
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		//FileOutputStream out = new FileOutputStream(path);
		// ^랑 v는 같음 둘다 같으나, 궅이 아래꺼 쓰는이유는 부모클래스를 사용하는게 더 좋아서? 
		
		try {
			OutputStream out = new FileOutputStream(path);
			//1st
			//한글자씩 씀 -> 시간이 아주 오래걸림
//			out.write(65);
//			out.write(66);
//			out.write(67);
			
			//2nd
			// v로 쓰게되면 한방에 쓸 수 있음 -> 배열에 들어있는 데이터를 한번에 씀
			//out.wrait("배열");
//			byte[]arr = {65,66,67,68,69};
//			out.write(arr);
			
			//3nd
			String str = "한글~"; //한글은 2byte라 1byte로 저장하는데 적합하지않습니다
			//str.getBytes() // 문자열을 바이트로 변환해줌
			byte[]arr = str.getBytes();
			out.write(arr);
			
			out.close(); // 자원해제 << 꼭 해야됨. 안그러면 계속 스트림이 열려서? 데이터에 변질이 생길 수도 잇음
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
