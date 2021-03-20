package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1="+ result1);
		System.out.println("result2="+ result2);
		
		byte b = 100;
		// byte result = -b; 바이트 타입값을 부호 연산하면 인트타입으로 바뀌어서 오류발생컴파일
		int result3 = -b;
		System.out.println("result3="+ result3);

	}

}
