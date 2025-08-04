package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> user = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				user.put("name", name);
				System.out.print("나이 : ");
				int age = s.nextInt();
				user.put("age", age);
				System.out.print("주소 : ");
				String addr = s.next();
				user.put("addr", addr);
				list.add(user);
				
			} else if(menu == 2) {
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					System.out.print((i+1) + ". ");
					System.out.print("이름 : " + user.get("name") + ", ");
					System.out.print("나이 : " + user.get("age") + ", ");
					System.out.println("주소 : " + user.get("addr"));
				}
			} else if(menu == 3) {
				System.out.print("삭제할 사용자의 이름을 출력해주세요 : ");
				String name = s.next();
				boolean searchFlg = false; // 이름 찾으면 true로 변경
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
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
