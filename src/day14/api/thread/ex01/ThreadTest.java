package day14.api.thread.ex01;

public class ThreadTest implements Runnable{
	
	@Override
	public void run() {

		for(int i = 1; i <= 10; i++) {
			System.out.println("작업스레드에서 실행된 for문" + i);
			
			try {
				Thread.sleep(1000); // 1초간 멈춤
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
