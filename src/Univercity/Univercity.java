public class Univercity{
	public static void main(String[] args) 
	{
		Teacher t1=new Teacher();
		Student stu1=new Student();
		Club c1 = new Club();
		Department d1=new Department();
		Employee e1=new Employee();
		Grade g1=new Grade();
		Lecture l1=new Lecture();
		StudentGroup sg1=new StudentGroup();
		
		Teacher t2=new Teacher("������","������","�ڹ�",40,500);
		Student stu2=new Student("���л�","������","�ڹ�",21,141414,40,3);
		Club c2 = new Club("���","���л�","����",1);
		Department d2=new Department("������","������","1234567",25,1);
		Employee e2=new Employee("������",26,8,80);
		Employee e3=new Employee("������","����","����",35,10,200);
		Employee e4=new Employee("���Ĵ�","�丮",38,8,120);
		Grade g2=new Grade("�ڹ�",1,1,4);
		Lecture l2=new Lecture("�ڹ�","������",1,1,1);	
		StudentGroup sg2=new StudentGroup("�ڹ�ȸ","���л�",1);
	}
}