public class Department{
	String name,deTeacher,tel;
	int stuNo,depNo;
	
	public Department(){
	}
	
	public Department(String n,String dT,String t,int stN,int dN){
		name=n;
		deTeacher=dT;
		tel=t;
		stuNo=stN;
		depNo=dN;
		
		}

	public String getContents(){
	String str = "�а��� : "+name"\n�а����� : "+boss+"\n��� : "+location+"\n�л��� : "+sutN+"\n";
	return str;
	}
}
