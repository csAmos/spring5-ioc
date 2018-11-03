package lifecycle;

public class MyDataSource {
	public MyDataSource() {
		// TODO Auto-generated constructor stub
		System.out.println("创建对象。。。。。");
	}
	
	public void open() {
		System.out.println("初始化。。。。");
	}
	
	public void dowork() {
		System.out.println("工作。。。。");
	}
	
	public void close() {
		System.out.println("销毁。。。。");
	}
}
