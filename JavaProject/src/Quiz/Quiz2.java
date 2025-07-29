package Quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

//		2. 배열 회전 프로그램
//		사용자로부터 정수 배열(예: 5개)을 입력받고, 오른쪽으로 한 칸씩 회전시킨 결과를 출력하세요.
//		예: 1 2 3 4 5 → 5 1 2 3 4

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];

		// 입력
		System.out.println("정수 5개를 입력하세요:");
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
		}

		// 오른쪽으로 한 칸 회전
		int last = arr[4];
		for (int i = 4; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;

		// 출력
		System.out.println("회전 결과:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
