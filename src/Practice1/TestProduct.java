public class TestProduct{
	public static void main(String[] args) 
	{
		Product p1=new Product();
		Product p2=new Product(1,"과자1",3000,"a제과",99,"맛있음");
		Product p3=new Product(2,"과자2",5000,"a제과");

		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p3.getDetails());

	}
}