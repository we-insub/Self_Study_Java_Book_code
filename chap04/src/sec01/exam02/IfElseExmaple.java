package sec01.exam02;

public class IfElseExmaple {

	public static void main(String[] args) {
		int score = 85 ; // int형 변수 score에 85 저
		
		if(score >= 90) { // 만약 변수 score가 90보다 높을경우 아래 출
			System.out.println("점수가 90점보다 높습니다.");
			System.out.println("등급은 A입니다.");
		} else { // 만약 변수 score가 90보다 낮을경우 아래 출력 
			System.out.println("점수가 90점보다 낮습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
