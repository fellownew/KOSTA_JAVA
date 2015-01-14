public class BirthDate{
	private int year,month,day;

	public BirthDate(){
	}

	public BirthDate(int year,int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	//ÀüÃ¼ get, set
	public String getBirthDate(){
		String str = year+"-"+month+"-"+day;
		return str;
	}
	public void setBirthDate(int year,int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}

	//yeat get, set
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year=year;
	}

	//month get,set
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month=month;
	}

	//day get,set
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day=day;
	}

}