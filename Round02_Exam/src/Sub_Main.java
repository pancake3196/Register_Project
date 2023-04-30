import java.util.Scanner;

public class Sub_Main {

	public static void main(String[] args) {

		// 1.로그인 2.회원가입 3.로그아웃 4.회원목록 5.종료 이캐 출력시키는 거 하고
		// 만약 5를 입력했다면 프로그램 종료하시겟습까? (y/n) 뜨게 하고,
		// 여기서 y를 입력햇다면 종료시키고, n을 입력햇다면 계속 진행하게ㅐ 하는 거 까지 해줘
		Scanner sc = new Scanner(System.in);
			
		System.out.println("1.로그인 2.회원가입 3.로그아웃 4.회원목록 5.종료");
		
		int a = 0;
		String b = null;
		a = sc.nextInt();
		
		if(a == 1) {
			System.out.println("아이디와 비밀번호를 입력해 주십시오");
		}else if(a == 2) {
			System.out.println("새로만들 아이디와 비밀번호를 입력해 주십시오");
		}else if(a == 3) {
			System.out.println("로그아웃 되었습니다");	//실제로 로그아웃하기(할줄 모름)
		} 
			
		if(a == 5) { 
			System.out.println("프로그램을 종료하시겠습니까? (y/n)");
			b = sc.next();
			if(b == "y") {
				System.out.println("프로그램을 종료하였습니다");
			
			}
			
		}
		
	}

}
