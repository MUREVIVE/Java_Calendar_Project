package java_Calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 두 수의 합을 출력.
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = sc.next();
		s2 = sc.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + ", " + b);
	}

}
