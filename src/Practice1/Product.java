public class Product{
	String productName,maker,info;
	int productNo,price,stock;
	
	public Product(){
	}
	//�ʼ���� �Է�
	public Product(int productNo,String productName,int price, String maker){
		this.productNo=productNo;
		this.productName=productName;
		this.price=price;
		this.maker=maker;

		}
	//�� ��� �Է�
	public Product(int productNo,String productName,int price, String maker, int stock, String info){
		this(productNo,productName,price,maker);
		this.stock=stock;
		this.info=info;
		}

	public String getDetails(){
		String str;
		if(productNo==0){
			str = "�̵�� ��ǰ\n";

		}else if(stock==0){
			str = "��ǰ��ȣ : "+productNo+"\n�� ǰ �� : "+productName+"\n��    �� : "+price+"\n�� �� �� : "+maker+"\n��    �� : �̵��\n��ǰ���� : �̵�� \n";

		}else{
			str = "��ǰ��ȣ : "+productNo+"\n�� ǰ �� : "+productName+"\n��    �� : "+price+"\n�� �� �� : "+maker+"\n��    �� : "+stock+"\n��ǰ���� : "+info+"\n";
		}
		return str;
	}

}