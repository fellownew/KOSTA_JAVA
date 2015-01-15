import kr.or.kosta.*;

public class Caller{
	public static void main(String[] args) 
	{
		kr.or.kosta.Worker w = new kr.or.kosta.Worker();
		w.go();
		Worker w2 = new Worker(); //import로 인하여 바로 생성됨
		w2.go();
		TempWorker tw = new TempWorker();
		tw.come();
	}
}
