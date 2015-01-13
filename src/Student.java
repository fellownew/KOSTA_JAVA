//메소드에 대한 설명 소스

public class Student{ // public class의 클래스명은 반드시 파일명과 동일해야 한다.
	//속성 -> 동작
	//속성 - instance(member)변수 : [제한자]DataType 변수명	[=값]
	String name, telNo, email;
	int studentNo;

	//instance (member) method - [제한자] 리턴타입 식별자([매개변수,...]){구현}
	public void study(String subject){ //void형이므로 리턴값이 없음.
		System.out.println(subject+"를(을) 공부한다.");
		return; //void형일때 생략 가능
	}
	
	public String rest(int hour){
		System.out.println(hour+"시간 쉬다");//String + 다른 타입값 = String
		
		return "푹 쉬었다.";
	}
	
	public void eat(String food, int hour){//매개변수는 여러개 가능함.
		System.out.println(food+"를"+hour+"시간동안 먹었다.");
		
	}

	
}
