public class Club{
	String groupName,boss,location;
	int stuN;
	
	public Club(){
	}
	
	public Club(String n,String b,String l,int sN){
		groupName=n;
		boss=b;
		location=l;
		stuN=sN;
		
		}

	public String getContents(){
	String str = "GroupName : "+GruopName+"\nboss : "+boss+"\n장소 : "+location+"\n학생수 : "+sutN+"\n";
	return str;
	}
}
