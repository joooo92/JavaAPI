package day14.api.io.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {
	
	public static void main(String[] args) {
		/*
		 * FileInputStream, FileOutputStream은 
		 * 동영상, 이미지파일을 읽거나 쓸때 사용합니다. 
		 */
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\메서드_copy.mp4";
		
		InputStream is = null;
		OutputStream out = null;
		
//////////////////////////////////////////////////////////////////////		
		//향상된 try_catch문 -> Closeable 인터페이스를 상속받은 클래스만 사용이 가능.
		// -> close작업을 대신함 >>finally 구문을 삭제할 수 있음
		
/*		try(InputStream is = new FileInputStream(readPath);
		OutputStream out = new FileOutputStream(writePath)){
			try {
				//읽음
				byte[] arr = new byte[2048]; //1024byte = 1kb
				
				int result;
				while((result = is.read(arr)) != -1) {
					//쓰기
					out.write(arr, 0, result); //arr데이터를 0~바이트배읠의 result까지만 씀
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
*/		
//////////////////////////////////////////////////////////////////////		
		
		
		try {
			is = new FileInputStream(readPath);
			out = new FileOutputStream(writePath);
			
			//읽음
			byte[] arr = new byte[2048]; //1024byte = 1kb
			
			int result;
			while((result = is.read(arr)) != -1) {
				//쓰기
				out.write(arr, 0, result); //arr데이터를 0~바이트배읠의 result까지만 씀

				
				//v while에 true를 넣고 아래처럼 해도 되지만, 깔끔하게 쓰기위해선 ^ 추천
//				int result = is.read(arr);
//				System.out.println(result);
//				if(result == -1) break;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //close가 while과 함께 있을경우, 문제가 있어서 중도에 실행이 멈추면 해당 파일이 이상해짐?
			try {
				is.close();
				out.close();
			} catch (Exception e2) {

			}
		}
		
		System.out.println("프로그램 정상종료");
		
		
	}
	

}
