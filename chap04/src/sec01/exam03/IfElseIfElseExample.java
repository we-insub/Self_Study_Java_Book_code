package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75 ; // int형 변수score에 75인트형으로 저장/
		if(score >= 90) { //score 가 90보다 크거나 같으면 아래 출력
			System.out.println("점수가 100 - 90 점 입니다");
			System.out.println("등급은 A입니다");
		} else if(score >= 80) { // 점수가 80 - 89 일 경우
			System.out.println("점수가 80 - 89 점 입니다");
			System.out.println("등급은 B입니다.");
		
		} else if(score >= 70) { // 점수가 70 - 79 점일 경우
			System.out.println("점수가 70 - 79 점 입니다.");
			System.out.println("등급은 C입니다.");
		
		} else {
			System.err.println("점수가 70 점 미만입니");
			System.err.println("등급은 D입니다.");
		}
	}
}
