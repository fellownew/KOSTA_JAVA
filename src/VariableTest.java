import java.util.Random;

public class VariableTest{


	public static void main(String[] args){ //�ڹ� ���α׷��� ������ - main �޼ҵ�
		//���� ���� - DataType �ĺ���(�̸�);
		int age = 20;

		//System.out.println(age);
		// ������ �� ����
		//age = 20; ������ = ��
		System.out.println(age); // age������ ���� �� ���
		int age2=100;
		System.out.println(age2);
		age = ran(age2);
		System.out.println(age);
		
		//String - ���ڿ� Ÿ��, ���� ""���Ѵ�.
		
		String name ="��ö��";
		System.out.println(name);
		name = "������";
		System.out.println(name);
		
		//���� Ÿ���� �������� ���� ���� ����
		String id,password,address;
		
	}
	
	public static int ran(int a){
		Random random = new Random();
		int b = random.nextInt(a);
		return b;
}
	
}