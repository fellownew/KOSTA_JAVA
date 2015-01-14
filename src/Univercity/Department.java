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
	String str = "학과명 : "+name"\n학과교수 : "+boss+"\n장소 : "+location+"\n학생수 : "+sutN+"\n";
	return str;
	}
}
