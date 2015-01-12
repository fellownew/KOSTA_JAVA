

public class VariableNaming{
	public static void main(String[] args){ 
		//1. 사용 가능 문자 : 알파벳, $, _, 숫자(2번째글자부터);
		/* 잘못된 예
		int 2age;
		int a*b;
		String my Name;
		*/
		// 괜찮은 예
		int a$b;
		String my_Name;
		//2. 글자수 제한 없음. - 이름을 줄때 역할을 확인 살 수 있도록 함.
		int lkjdlfkjwoeijfoaksdjlfkansldkjfalsekfhalkjshdflakwuehlfsjkfkjzxlkjnflksdjfliej;
		
		/* 예약어(키워드) 사용 불가 예
		int int;
		int if;
		*/
		
		//변수명, 메소드 이름 관례 - 카멜 표기법 : 기본은 소문자, 단어+단어+.... 일때 두번째단어의 첫 글자는 대문자.
		// 좋은 예
		String studentName, customerAccount;
		//한글 변수도 가능은 하다.
		int 나이 = 20;
		System.out.println(나이);
		
	}
}