package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93; // int 형 변수 score 에 93 저 
		
		if(score >= 90);{ //만약 변수 score가 90 보다 높다면 출
			System.out.println("점수가 90보다 높습니다");
			System.out.println("등급은 A 입니다");
			}
		if(score < 90) 
			System.out.println("점수가 90보다 낮습니다"); // 그래서 아래문장은 그냥 출
			System.out.println("등급은 B 입니다"); // 등급부분은 출력 

	}

}
