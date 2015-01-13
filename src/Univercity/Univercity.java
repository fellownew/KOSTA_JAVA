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
		
		Teacher t2=new Teacher("나교수","좋은과","자바",40,500);
		Student stu2=new Student("나학생","좋은과","자바",21,141414,40,3);
		Club c2 = new Club("라라","나학생","저기",1);
		Department d2=new Department("좋은과","나교수","1234567",25,1);
		Employee e2=new Employee("나매점",26,8,80);
		Employee e3=new Employee("나팀장","팀장","행정",35,10,200);
		Employee e4=new Employee("나식당","요리",38,8,120);
		Grade g2=new Grade("자바",1,1,4);
		Lecture l2=new Lecture("자바","나교수",1,1,1);	
		StudentGroup sg2=new StudentGroup("자바회","나학생",1);
	}
}