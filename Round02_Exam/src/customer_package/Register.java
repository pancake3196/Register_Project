package customer_package;

public class Register {

	// ID, PW 배열 선언
	String[] ID = new String[3];
	String[] PW = new String[3];
	String[] Check;
	// 변수 선언
	int id_num = 0;
	int pw_num = 0;
	boolean alpha = false;
	
	// id 메소드 선언
	void id(String s) { // s = cat
		ID[id_num] = s;
		++id_num;
	}
	
	// pw 메소드 선언
	void pw(String s) { // abc1234
		Check = s.split("");
		for(int i = 0;i < Check.length;i++) {
			int index = s.charAt(i);
			if(index >= 65 && index <= 122) {
				alpha = true;
			}
		}
		if(Check.length < 4) {
			System.out.println("비밀번호는 4자리 이상"
					   +"알파벳이 포함되어 있어야 합니다.");
			return;
		}
		if(alpha == false) {
			System.out.println("비밀번호는 4자리 이상"
					  +"알파벳이 포함되어 있어야 합니다.");
		return;
		}
		PW[pw_num] = s;
		++pw_num; // 1 + pw_num
	}
	
}
