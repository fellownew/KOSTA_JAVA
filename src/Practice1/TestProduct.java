public class TestProduct{
	public static void main(String[] args) 
	{
		Product p1=new Product();
		Product p2=new Product(1,"����1",3000,"a����",99,"������");
		Product p3=new Product(2,"����2",5000,"a����");

		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p3.getDetails());

	}
}