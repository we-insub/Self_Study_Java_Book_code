package sec01.exam02;

public class VariableInitializationExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "Time" + minute  + "minute");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("Total" + totalMinute + "minute");		
	}

}
