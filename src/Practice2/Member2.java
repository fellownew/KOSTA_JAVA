public class Member2{
	//instance ����
	private String id,password,name;
	private int mileage;

	public Member2(String id,String password,String name, int mileage){
		this.id = id;
		this.password = password;
		this.name=name;
		this.mileage = mileage;
	}
	public Member2(){
	}
	
	//id setter,getter
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}

	//name setter,getter
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	//password setter,getter
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}

	//mileage setter,getter
	public void setMileage(int mileage){
		this.mileage=mileage;
	}
	public int getMileage(){
		return mileage;
	}
	//��ü�� setter
	public void setMember2(String id,String password,String name, int mileage){
		this.id = id;
		this.password = password;
		this.name=name;
		this.mileage = mileage;
	}

	//instance method ��ü�� ��ȸ
	public String getMemberDetails(){  
		String str = "I      D : "+id+
				   "\npassword : "+password+
			   	   "\n��    �� : "+name+
				   "\n���ϸ��� : "+mileage+"\n";
		return str;
	}
}
