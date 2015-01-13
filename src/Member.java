public class Member{
	//instance 변수
	String id,password,name;
	int mileage;

	public Member(String i,String pwd,String n, int m){
		id = i;
		password = pwd;
		name=n;
		mileage = m;
	}
	public Member(){

	}

	//instance method 
	public String getMemberDetails(){ //회원정보를 하나의 문자열로 만들어 return 
		String str = "id : "+id+"\npassword : "+password+"\n이름 : "+name+"\n마일리지 : "+mileage+"\n";
		return str;
	}
}
