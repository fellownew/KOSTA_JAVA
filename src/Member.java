public class Member{
	//instance ����
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
	public String getMemberDetails(){ //ȸ�������� �ϳ��� ���ڿ��� ����� return 
		String str = "id : "+id+"\npassword : "+password+"\n�̸� : "+name+"\n���ϸ��� : "+mileage+"\n";
		return str;
	}
}
