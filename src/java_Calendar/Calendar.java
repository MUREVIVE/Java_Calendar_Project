package java_Calendar;

import java.util.Scanner;

public class Calendar {

	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("-----------------------");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

	public static void main(String[] args) {

		int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		cal.printSampleCalendar();
		
		System.out.println("테스트 케이스를 정해주세요.");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.println("달을 입력하세요.");
			int month = sc.nextInt();
			System.out.printf("%d월의 최대 일수는 %d일 입니다.\n", month, MAX_DAYS[month - 1]);
		}
		System.out.println("종료");
		sc.close();
	}

}
