//import Student.*;

public class TestStudent{
	public static void main(String[] args) 
	{
		//Student ��ü ����
		//1. ����
		Student stu1; //StudentŬ�����κ��� ������ ��ü stu1
		//2. ����-����
		stu1 = new Student(); //new Ŭ�����̸�(); ������.
		// ���� + ����
		Student stu2 = new Student();
		//��ü�� instance ������ �� ����
		stu1.name = "ȫ�浿";
		stu1.telNo = "01012345678";
		stu1.email = "1234@naver.com";
		stu1.studentNo = 1;
		stu2.name = "�Ӳ���";
		stu2.telNo = "01023456789";
		stu2.email = "2345@naver.com";
		stu2.studentNo = 2;

		System.out.println("stu1�� �л���ȣ : "+stu1.studentNo);
		System.out.println("stu1�� �̸� : "+stu1.name);
		System.out.println("stu1�� �̸��� : "+stu1.telNo);
		System.out.println("stu1�� ��ȭ��ȣ : "+stu1.email);
		System.out.println(" ");
		System.out.println("stu2�� �л���ȣ : "+stu2.studentNo);
		System.out.println("stu2�� �̸� : "+stu2.name);
		System.out.println("stu2�� �̸��� : "+stu2.telNo);
		System.out.println("stu2�� ��ȭ��ȣ : "+stu2.email);

		//�޼ҵ� ȣ�� : �޼ҵ�(������ ��)
		stu1.study("����");
		stu2.study("����");

		String str = stu1.rest(1);
		System.out.println(str);

		stu1.eat("���",10);


	}
}
