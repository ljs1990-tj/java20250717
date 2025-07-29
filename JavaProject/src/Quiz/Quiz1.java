package Quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 성적 통계 프로그램
//		5명의 학생 이름과 점수를 입력받고, 전체 평균과 최고점 학생 이름
//		60점 미만 명단을 출력하세요.
		Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        int[] scores = new int[5];

        // 입력
        for (int i = 0; i < 5; i++) {
            System.out.print("학생 이름 입력: ");
            names[i] = scanner.next();
            System.out.print("학생 점수 입력: ");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); // 개행 처리
        }

        // 평균 계산
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / 5.0;

        // 최고점 찾기
        int max = scores[0];
        String topStudent = names[0];
        for (int i = 1; i < 5; i++) {
            if (scores[i] > max) {
                max = scores[i];
                topStudent = names[i];
            }
        }

        // 낙제자 찾기
        System.out.println("\n--- 결과 ---");
        System.out.printf("전체 평균: %.2f\n", average);
        System.out.println("최고점 학생: " + topStudent + " (" + max + "점)");
        System.out.println("낙제자(60점 미만): ");
        for (int i = 0; i < 5; i++) {
            if (scores[i] < 60) {
                System.out.println("- " + names[i] + " (" + scores[i] + "점)");
            }
        }

		
	}

}
