public class TestMember{
	public static void main(String[] args) 
	{
		Member m1 = new Member("hong","gil","ȫ�浿",3500);
		Member m2 = new Member("lim","jung","�Ӳ���",2000);
		String m1I = m1.getMemberDetails();
		String m2I = m2.getMemberDetails();

		System.out.println(m1I);
		System.out.println(m2I);
		m1.mileage = 10000;
		m1I = m1.getMemberDetails();
		System.out.println("m1 ���ϸ��� ���� ��\n"+m1I);
		m2.mileage += 10000;
		m2I = m2.getMemberDetails();
		System.out.println("m2 ���ϸ��� ������Ʈ ��\n"+m2I);
		


	}
}
