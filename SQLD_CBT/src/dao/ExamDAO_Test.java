package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vo.ExamVO;

public class ExamDAO_Test {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		List<ExamVO> list = dao.selectAll();
		for (ExamVO mvo : list ) {
		System.out.println("===========================");
		System.out.println(mvo.getQwestion());//����
		
		System.out.println("---------------------------");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");	
		
		String str1 = scan.nextLine();
		
		if(str1.equals(mvo.getAnswer())) {
			System.out.println("�����̴�");
		}else {
			System.out.println("��!!!!");
		}
		System.out.println("������ : " + mvo.getAnswer());
		System.out.println("---------------------------");
		
		}

	}

}