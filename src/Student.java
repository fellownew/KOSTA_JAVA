//�޼ҵ忡 ���� ���� �ҽ�

public class Student{ // public class�� Ŭ�������� �ݵ�� ���ϸ�� �����ؾ� �Ѵ�.
	//�Ӽ� -> ����
	//�Ӽ� - instance(member)���� : [������]DataType ������	[=��]
	String name, telNo, email;
	int studentNo;

	//instance (member) method - [������] ����Ÿ�� �ĺ���([�Ű�����,...]){����}
	public void study(String subject){ //void���̹Ƿ� ���ϰ��� ����.
		System.out.println(subject+"��(��) �����Ѵ�.");
		return; //void���϶� ���� ����
	}
	
	public String rest(int hour){
		System.out.println(hour+"�ð� ����");//String + �ٸ� Ÿ�԰� = String
		
		return "ǫ ������.";
	}
	
	public void eat(String food, int hour){//�Ű������� ������ ������.
		System.out.println(food+"��"+hour+"�ð����� �Ծ���.");
		
	}

	
}
