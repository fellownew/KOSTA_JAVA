//import Student.*;

public class TestStudent{
	public static void main(String[] args) 
	{
		//Student 객체 생성
		//1. 선언
		Student stu1; //Student클래스로부터 생성된 객체 stu1
		//2. 생성-대입
		stu1 = new Student(); //new 클래스이름(); 생성자.
		// 선언 + 생성
		Student stu2 = new Student();
		//객체의 instance 변수에 값 대입
		stu1.name = "홍길동";
		stu1.telNo = "01012345678";
		stu1.email = "1234@naver.com";
		stu1.studentNo = 1;
		stu2.name = "임꺽정";
		stu2.telNo = "01023456789";
		stu2.email = "2345@naver.com";
		stu2.studentNo = 2;

		System.out.println("stu1의 학생번호 : "+stu1.studentNo);
		System.out.println("stu1의 이름 : "+stu1.name);
		System.out.println("stu1의 이메일 : "+stu1.telNo);
		System.out.println("stu1의 전화번호 : "+stu1.email);
		System.out.println(" ");
		System.out.println("stu2의 학생번호 : "+stu2.studentNo);
		System.out.println("stu2의 이름 : "+stu2.name);
		System.out.println("stu2의 이메일 : "+stu2.telNo);
		System.out.println("stu2의 전화번호 : "+stu2.email);

		//메소드 호출 : 메소드(전달할 값)
		stu1.study("수학");
		stu2.study("영어");

		String str = stu1.rest(1);
		System.out.println(str);

		stu1.eat("고기",10);


	}
}
