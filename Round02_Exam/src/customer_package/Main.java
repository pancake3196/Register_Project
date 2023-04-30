package customer_package;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 변수 선언
		int run = 1;
		int num = 0;
		String value = null;
		String id = null;
		String pw = null;
		boolean log_check = false;
		
		// 클래스 선언
		// 클래스 이름 + Enter 클래스의 별명 = new 클래스 이름();
		Register register = new Register();
		
		// scanner 선언
		Scanner sc = new Scanner(System.in);
		
		// while 반복문 돌리기
		while(run == 1) {
			System.out.println("1.로그인 2.회원가입 3.로그아웃 4.회원목록 5.종료");
			num = sc.nextInt();
			
			if(num == 2) { // 회원가입
				if(log_check == true) {
					System.out.println("자동 로그아웃 후 새 회원가입을 "
						             + "시작하시겠습니까? (y/n)");
					value = sc.next();
					if(value.equals("y")) { 
						log_check = false;
						continue;
					} else {
						continue;
					}
				}
				System.out.println("2. 회원가입을 실시합니다.");
				
				System.out.println("ID를 입력해주세요."); // ID 입력
				register.id(value = sc.next()); // cat
				
				System.out.println("PW를 입력해주세요."); // PW 입력
				register.pw(value = sc.next());
				
				// 가입한 ID와 PW 출력
				if(register.id_num > 0 && register.pw_num > 0) {
					System.out.println("가입 ID : "+ register.ID[register.id_num - 1]);
					System.out.println("가입 PW : "+ register.PW[register.pw_num - 1]);
					System.out.println("저장완료");
				}
			}
			
			if(num == 1) { // 로그인 
				if(log_check == true) {
					System.out.println("이미 로그인된 상태입니다.");					
					continue;
				}
				System.out.println("1. 로그인을 실시합니다.");
				
				System.out.println("ID를 입력해주세요."); // ID 입력
				id = sc.next();
				
				System.out.println("PW를 입력해주세요."); // PW 입력
				pw = sc.next();
				
				// 로그인 여부 확인
				if(id.equals(register.ID[register.id_num - 1]) && pw.equals(register.PW[register.pw_num - 1])) {
					System.out.println("로그인 성공!");
					log_check = true;
				} else {
					System.out.println("존재하지 않는 아이디입니다. "
							         + "다시 로그인하시겠습니까? (y/n)");			
					value = sc.next();
					if(value.equals("y")) { 
						continue;
					} else {
						break;
					}
				}
			}
			
			if(num == 3) { // 로그아웃
				log_check = false;
			}
			
			if(num == 4) {// 회원목록
				System.out.println("회원목록을 보여드리겠습니다.");
				System.out.print("ID 목록(" + register.id_num + ") : ");
				for(int i = 0;i < register.id_num;i++) {
					System.out.print(register.ID[i] + " ");
				}
				System.out.println();
			}
			
			if(num == 5) { // 종료
				System.out.println("프로그램을 종료하시겠습니까? (y/n)");
				value = sc.next();
				if(value.equals("y")) { 
					run = 0;
				} else {
					continue;
				}
			}
			
			
		}
		
		sc.close();

	}

}