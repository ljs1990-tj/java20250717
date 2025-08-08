package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestPointManager {

    // 사용자 정보를 담을 HashMap 반환
    public static HashMap<String, Object> searchUser(ArrayList<HashMap<String, Object>> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            HashMap<String, Object> getUser = list.get(i);
            if (getUser.get("name").equals(userName)) {
                return getUser;
            }
        }
        return null;
    }

    // 숫자 입력 체크 함수 (0 이하의 값 입력 방지)
    public static int checkNumber(String msg) {
        Scanner s = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print(msg + " : ");
            input = s.nextInt();

            if (input <= 0) {
                System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
            } else {
                break;
            }
        }

        return input;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> userList = new ArrayList<>();

        System.out.println("======= 포인트 관리 프로그램 =======");

        while (true) {
            System.out.print("[ (1)사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5)종료 ] : ");
            int menu = s.nextInt();

            if (menu == 1) {
                // 사용자 등록
                System.out.print("이름 : ");
                String name = s.next();

                // 사용자 존재 여부 확인
                HashMap<String, Object> user = searchUser(userList, name);
                if (user != null) {
                    System.out.println("이미 등록된 사용자입니다.");
                } else {
                    int age = checkNumber("나이");
                    user = new HashMap<>();
                    user.put("name", name);
                    user.put("age", age);
                    user.put("point", 0); // 초기 포인트 0
                    userList.add(user);
                    System.out.println(name + "님이 등록되었습니다.");
                }

            } else if (menu == 2) {
                // 포인트 적립
                System.out.print("포인트 적립할 사용자 이름 : ");
                String userName = s.next();
                HashMap<String, Object> user = searchUser(userList, userName);
                if (user == null) {
                    System.out.println("해당 사용자가 존재하지 않습니다.");
                } else {
                    int points = checkNumber("적립할 포인트");
                    user.put("point", (int) user.get("point") + points);
                    System.out.println(userName + "님의 포인트가 " + points + "만큼 적립되었습니다.");
                }

            } else if (menu == 3) {
                // 포인트 차감
                System.out.print("포인트 차감할 사용자 이름 : ");
                String userName = s.next();
                HashMap<String, Object> user = searchUser(userList, userName);
                if (user == null) {
                    System.out.println("해당 사용자가 존재하지 않습니다.");
                } else {
                    int points = checkNumber("차감할 포인트");
                    int currentPoints = (int) user.get("point");
                    if (currentPoints < points) {
                        System.out.println("차감할 수 있는 포인트는 " + currentPoints + "포인트 입니다.");
                    } else {
                        user.put("point", currentPoints - points);
                        System.out.println(userName + "님의 포인트가 " + points + "만큼 차감되었습니다.");
                    }
                }

            } else if (menu == 4) {
                // 포인트 확인
                System.out.print("포인트 확인할 사용자 이름 : ");
                String userName = s.next();
                HashMap<String, Object> user = searchUser(userList, userName);
                if (user == null) {
                    System.out.println("해당 사용자가 존재하지 않습니다.");
                } else {
                    int points = (int) user.get("point");
                    System.out.println(userName + "님의 현재 포인트는 " + points + "포인트 입니다.");
                }

            } else if (menu == 5) {
                // 종료
                System.out.println("종료되었습니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.");
            }
        }

        s.close();
    }
}
