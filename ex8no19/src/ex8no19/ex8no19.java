package ex8no19;

public class ex8no19 {  //  435p
	public static void main(String[] args) {
		ex8no19.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	}

}
