import java.io.*;
import java.util.Random;

public class HelloWorld{
    public static void main(String args[]){
		int a=(int)(Math.random()*100); // math.random�� 0~1�� double�� ����
		Random random = new Random();
		int b = random.nextInt(1000);
		System.out.println("Hello World - �ȳ��ϼ���");
		System.out.println(a+","+b+","+(a+b));
    }
 }
 