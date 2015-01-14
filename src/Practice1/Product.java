public class Product{
	String productName,maker,info;
	int productNo,price,stock;
	
	public Product(){
	}
	//필수요소 입력
	public Product(int productNo,String productName,int price, String maker){
		this.productNo=productNo;
		this.productName=productName;
		this.price=price;
		this.maker=maker;

		}
	//전 요소 입력
	public Product(int productNo,String productName,int price, String maker, int stock, String info){
		this(productNo,productName,price,maker);
		this.stock=stock;
		this.info=info;
		}

	public String getDetails(){
		String str;
		if(productNo==0){
			str = "미등록 상품\n";

		}else if(stock==0){
			str = "제품번호 : "+productNo+"\n제 품 명 : "+productName+"\n가    격 : "+price+"\n제 조 사 : "+maker+"\n재    고 : 미등록\n제품정보 : 미등록 \n";

		}else{
			str = "제품번호 : "+productNo+"\n제 품 명 : "+productName+"\n가    격 : "+price+"\n제 조 사 : "+maker+"\n재    고 : "+stock+"\n제품정보 : "+info+"\n";
		}
		return str;
	}

}