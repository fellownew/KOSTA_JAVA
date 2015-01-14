public class TestBirthDate{
	public static void main(String[] args) 
	{
		BirthDate b1 = new BirthDate(2000,10,10);
		System.out.println(b1.getBirthDate());
		b1.setBirthDate(2005,6,6);
		System.out.println(b1.getBirthDate());
		b1.setYear(1999);
		b1.setMonth(3);
		b1.setDay(20);
		System.out.println(b1.getBirthDate());


	}
}
