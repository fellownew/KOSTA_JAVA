public class TestMember2{
	public static void main(String[] args) 
	{
		Member2 m1 = new Member2("hong","gil","È«±æµ¿",3500);
		Member2 m2 = new Member2("lim","jung","ÀÓ²©Á¤",2000);
		Member2 m3 = new Member2();
		
		System.out.println(m1.getMemberDetails());
		System.out.println(m2.getMemberDetails());
		m1.setId("ABCD");
		m2.setMileage(m2.getMileage()+8000);
		System.out.println(m1.getMemberDetails());
		System.out.println(m2.getMemberDetails());
		System.out.println(m3.getMemberDetails());
		m3.setMember2("Java","1234","³ªÇĞ»ı",1);
		System.out.println(m3.getMemberDetails());


	}
}
