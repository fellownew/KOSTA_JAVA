import java.util.Random;

public class VariableTest{


	public static void main(String[] args){ //자바 프로그램의 시작점 - main 메소드
		//변수 선언 - DataType 식별자(이름);
		int age = 20;

		//System.out.println(age);
		// 변수에 값 대입
		//age = 20; 변수명 = 값
		System.out.println(age); // age변수가 가진 값 출력
		int age2=100;
		System.out.println(age2);
		age = ran(age2);
		System.out.println(age);
		
		//String - 문자열 타입, 값은 ""감싼다.
		
		String name ="김철수";
		System.out.println(name);
		name = "가나다";
		System.out.println(name);
		
		//같은 타입의 변수들은 동시 선언 가능
		String id,password,address;
		
	}
	
	public static int ran(int a){
		Random random = new Random();
		int b = random.nextInt(a);
		return b;
}
	
}