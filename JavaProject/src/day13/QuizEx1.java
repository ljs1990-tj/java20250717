package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();
				Human human = new Human(name, age, addr);
				list.add(human);
				
			} else if(menu == 2) {
				for(int i=0; i<list.size(); i++) {
					Human human = list.get(i);
					System.out.print((i+1) + ". ");
					System.out.print("이름 : " + human.getName() + ", ");
					System.out.print("나이 : " + human.getAge() + ", ");
					System.out.println("주소 : " + human.getAddr());
				}
			} else if(menu == 3) {
				System.out.print("삭제할 사용자의 이름을 출력해주세요 : ");
				String name = s.next();
				boolean searchFlg = false; // 이름 찾으면 true로 변경
				for(int i=0; i<list.size(); i++) {
					Human human = list.get(i);
					if(name.equals(human.getName())) {
						searchFlg = true;
						list.remove(i);
						i--; // 삭제 후 인덱스 하나씩 당겨지기 때문에
					}
				}
				if(!searchFlg) { // searchFlg == false
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				
			} else if(menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4중에 선택해주세요.");
			}
			System.out.println("----------------------------------------");
		}
	}
}
