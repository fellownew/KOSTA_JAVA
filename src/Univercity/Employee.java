public class Employee{
	String name,position,work;
	int age,time,pay;
	
	public Employee(){
	}
	//�������� s i i i
	public Employee(String n,int a,int t,int p){
		name=n;
		age=a;
		time=t;
		pay=p;

		}
	//�Ĵ����� s s i i i
	public Employee(String n,String w,int a,int t,int p){
		name=n;
		age=a;
		work=w;
		time=t;
		pay=p;
		}
	//������ s s s i i i
	public Employee(String n,String po,String w,int a,int t,int p){
		name=n;
		position=po;
		work=w;
		age=a;
		time=t;
		pay=p;

		}


}
