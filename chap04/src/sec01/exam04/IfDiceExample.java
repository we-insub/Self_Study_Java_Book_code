package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) +1 ; 
		// 파이썬과 많이 다르다,메소드 Math를 입력해야하고, 1 * 6 이니까 6개 중에서 
		// +1 한개를 뽑는다라.. 어렵다 확실히 적응되겠지요 :)
		if(num==1) {
			System.err.println("1");
		} else if(num==2) {
			System.err.println("2");
		} else if(num==3) {
			System.err.println("3");
		} else if(num==4) {
			System.err.println("4");
		} else if(num==5) {
			System.err.println("5");
		} else {
			System.err.println("6");
		}
	}

}
