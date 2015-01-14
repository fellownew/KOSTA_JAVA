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
		if(1800<year&&year<=2020)this.year=year;
		}

	//month get,set
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		if(0<month&&month<=12)this.month=month;
	}

	//day get,set
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		if(0<day&&day<=31)this.day=day;
	}

}