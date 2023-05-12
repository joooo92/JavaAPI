package day14.api.thread.ex01;

public class ThreadTest02 extends Thread{

	@Override
	public void run() {

		for(int i = 0; i <= 10; i++) {
			System.out.println("쓰레드를 상속받은 클래스 실행: " + i);
			System.out.println("쓰레드의 이름: " + getName());
			
			try {
				sleep(1000); // 상속받은 sleep
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
		}
		
		
		super.run();
	}

	
}
