package thread1;

public class Main implements Runnable{
	private Thread t;
	private String threadName;
	Main(String name){
		threadName = name;
		System.out.println(threadName);
	}
	@Override
	public void run() {
		System.out.println("running "+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("thread:"+threadName+","+i);
				Thread.sleep(50);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("thread:"+threadName+" interrupted");
		}
		System.out.println("exiting"+threadName);
	}
	public void  start() {
		System.out.println("Starting thread:"+threadName);
		if(t==null) {
			t  = new Thread(this,threadName);
			t.start();
		}
	}
	public static void main(String args[]) {
		Main m = new Main("Thread 1");
		m.start();
		Main n = new Main("Thread-2");
		n.start();
	}
}
