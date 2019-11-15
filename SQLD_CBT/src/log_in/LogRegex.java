package log_in;

import java.util.regex.Pattern;

public class LogRegex {
	
	
	public static void main(String[] args) {
		String pw = "hh23231i@@";
//		String email = "asdfasdf@a.a";
//		isKor(id);
//		if (isEmail(email)) {
//			System.out.println("email 형식이다");
//		} else {
//			System.out.println("아니다");
//		}
		
		//영문(대소문자 구분), 숫자, 특수문자 조합, 9~12자리
		isPW(pw);		
	}
	
	//한글 아닌 정규식
	public static void isKor(String txt) {
		if(txt.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
			System.out.println("한글");
		// 한글이 포함된 문자열
		} else {
		// 한글이 포함되지 않은 문자열
			System.out.println("한글 아님");
		}
	}
	
	public static boolean isEmail(String email) {
        if (email==null) return false;
        boolean b = Pattern.matches(
            "[\\w\\~\\-\\.]+@[\\w\\~\\-]+(\\.[\\w\\~\\-]+)+", 
            email.trim());
        return b;
	}
	
	
	//아이디 정규식 영문,숫자만 가능 5 ~ 15자이하
	public static void isId(String txt) {
		if(txt.matches("^[a-z]{1}[a-z0-9]{4,16}$")) {
			System.out.println("아이디");
		// 한글이 포함된 문자열
		} else {
		// 한글이 포함되지 않은 문자열
			System.out.println("아이디형식 아님");
		}
	}
	
	//영문(대소문자 구분), 숫자, 특수문자 조합, 9~12자리isPW
	//비밀번호
	//   "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{9,12}$"
	public static void isPW(String txt) {
		
		if(txt.matches("^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{9,12}$"));
			System.out.println("비밀번호");
		// 한글이 포함된 문자열
	}
//	String regex = "^[a-zA-Z]{1}[a-zA-Z0-9]{4,16}$";
//	String regex = "^[a-z]{1}[a-z0-9]{4,16}$";

}
