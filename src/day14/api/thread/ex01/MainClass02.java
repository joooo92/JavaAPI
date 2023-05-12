package day14.api.thread.ex01;

public class MainClass02 {
	
	public static void main(String[] args) {
	
		//쓰레드를 상속받은클래스는 직접사용
		ThreadTest02 thread = new ThreadTest02();
		thread.setName("Thread_B");
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
