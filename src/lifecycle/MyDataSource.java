package lifecycle;

public class MyDataSource {
	public MyDataSource() {
		// TODO Auto-generated constructor stub
		System.out.println("�������󡣡�������");
	}
	
	public void open() {
		System.out.println("��ʼ����������");
	}
	
	public void dowork() {
		System.out.println("������������");
	}
	
	public void close() {
		System.out.println("���١�������");
	}
}
