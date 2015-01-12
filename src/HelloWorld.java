import java.io.*;
import java.util.Random;

public class HelloWorld{
    public static void main(String args[]){
		int a=(int)(Math.random()*100); // math.random은 0~1의 double형 난수
		Random random = new Random();
		int b = random.nextInt(1000);
		System.out.println("Hello World - 안녕하세요");
		System.out.println(a+","+b+","+(a+b));
    }
 }
 