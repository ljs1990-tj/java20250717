package review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		// 100번동안 랜덤한 숫자를 갱신해가면서
		// 50이라는 숫자가 몇번째에 나오는지
		// 만약 100번안에 나오면 'oo번째에 50을 찾았습니다.'
		// 그렇지 않으면 '100번안에 50이 나오지 않았습니다.'
		boolean flg = false;
		for(int i=1; i<=100; i++) {
			int ranNum = ran.nextInt(100)+1;
			if(ranNum == 50) {
				System.out.println(i + "번째에 50을 찾았습니다.");
				flg = true;
				break;
			} 
		}
		if(!flg) { // flg == false
			System.out.println("100번안에 50이 나오지 않았습니다.");
		}
		
	}
}
