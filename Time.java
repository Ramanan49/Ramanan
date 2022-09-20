package day15;

public class Time {
	
	public static void printtime(int hour,int minute ) {
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
	}	
	
	public static void main(String[] args) {
		int hour= 12;
		int minute= 15;
		printtime(hour,minute);	
	}
	}
