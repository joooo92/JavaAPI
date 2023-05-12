package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderUTF8 {
	public static void main(String[] args) {
		/*
		 * 인코딩 = 파일 or 텍스트문서가 저장될 때 => 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 * 디코딩 = 컴퓨터가 아는 이진수 형태 => 인간이 알고있는 문자형식으로 변경
		 * 
		 * InputStreamReader = 1byte기반 파일을 => 2byte 기반으로 변경
		 * 파일을 읽을때 인코딩 형식을 같이 지정할 수 있습니다.
		 * 
		 * 인코딩 대표형식
		 * 문자인코딩 보통 UTF-8(유니코드) vs EUC-KR
		 * 파일인코딩 Base64(아스키코드)
		 * 
		 * 
		 * 
		 * 2가지방법
		 * 1. 원본파일의 인코딩을 UTF-8로 변경 -> 근본적인 방법!!!!!
		 * 2. 파일의 인코딩 형식이 다르면, (한글)이 꺠지게 되는데 인코딩을 동일한 형태로 맞춰서 가지고 오면 됩니다 -> 임시방편!!!!!!
		 * 
		 *  
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
//		vInputStream fis = new FileInputStream(path); //1바이트 기반
//		
//		//Reader rd = new InputStreamReader(System.in); << 시스템으로의 호출
//		// v file로의 호출, UTF-8 형식으로 가져올 것이다
//		vReader rd = new InputStreamReader(fis, "UTF-8"); // 1바이트기반 => 2바이트형식 변경 
//		
//		vBufferedReader br = new BufferedReader(rd); //2바이트 기반 빠른읽기
		//v ^의 v3개를 한번에 쓸 수 있음
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) { 
			String str;
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
