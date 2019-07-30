package java_Calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("-----------------------");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		System.out.println("Hello Calendar");
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		int month;
		Scanner sc = new Scanner(System.in);
		String s1;
		s1 = sc.next();
		month = Integer.parseInt(s1);
		
		if(month <= 0 && month >= 13)
			System.out.println("잘못 입력했다 이거야");
		else {
			if(month == 2)
				System.out.println("28일 입니다.");
			else if(month == 4 || month == 6 || month == 9 || month == 11)
				System.out.println("30일 입니다.");
			else
				System.out.println("31일 입니다.");
		}
		
		sc.close();
	}

}
