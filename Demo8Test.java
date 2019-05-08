package ThreadDemo1;

public class Demo8Test {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable03(),"线程A");
		Thread t2 = new Thread(new MyRunnable03(),"线程B");
		t1.start();
		t2.start();
        System.out.println("github");
	}

}
