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
	String str = "GroupName : "+GruopName+"\nboss : "+boss+"\n��� : "+location+"\n�л��� : "+sutN+"\n";
	return str;
	}
}
