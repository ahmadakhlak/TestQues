package test;

//answer of ques 2

import java.util.Scanner;

public class UnitDigit {
	public void Display(int num) {
		int temp, sum = 0, digit;
		digit = num % 10;
		while (num > 0) {
			temp = num % 10;
			sum = temp - sum;
			num /= 10;
		}
		if (sum < 0) {
			System.out.println(-sum + "" + digit);
		} else {
			System.out.println(sum + "" + digit);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		UnitDigit unit = new UnitDigit();
		unit.Display(num);
	}
}
