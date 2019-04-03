package member.view;

import java.util.ArrayList;
import java.util.Scanner;

import member.controller.MemberController;
import member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);

	public void main() {
		MemberController mc = new MemberController();
		while (true) {
			System.out.println("\n===회원관리 프로그램===\n");
			System.out.println("1.회원 전부 출력");
			System.out.println("2.회원 아이디로 조회");
			System.out.println("3.회원 이름으로 조회");
			System.out.println("4.회원 정보 입력");
			System.out.println("5.회원 정보 변경");
			System.out.println("6.회원 삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("선택> ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				mc.printAll(this.printAllKeyword());
				break;
			case 2:
				mc.printById(this.printByIdKeyword());
				break;
			case 3:
				mc.printByName(this.printByNameKeyword());
				break;
			case 4:
				mc.insertInfo(this.isertInfoKeyword());
				break;
			case 5:
				mc.updateInfo(this.updateInfoKeyword());
				break;
			case 6:
				mc.deleteInfo(this.deleteInfoKeyword());
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			}
		} // while ends

	}

	// 한 명 조회용
	public void printOne(Member m) {
		System.out.println(m);
	}

	// 여러명 조회용
	public void printByArray(ArrayList<Member> list) {
		for (Member m : list) {
			System.out.println(m);
		}
	}

	// 기타 메시지 수신
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	// 아래부터 스위치문 대응

	public ArrayList<Member> printAllKeyword() {
		ArrayList<Member> list = new ArrayList<Member>();
		System.out.println("\n===회원 전체 정보===\n");
		return list;
	}

	public String printByIdKeyword() {
		System.out.println("\n===아이디로 검색===\n");
		System.out.print("검색할 이이디 입력 : ");
		String id = sc.next();
		return id;
	}

	public String printByNameKeyword() {
		System.out.println("\n===이름으로 검색===\n");
		System.out.print("검색할 이름(일부분 포함) 입력 : ");
		String name = sc.next();
		return name;
	}

	public Member isertInfoKeyword() {
		System.out.println("\n===회원정보입력===\n");
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("성별 입력 : ");
		String gender = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		System.out.print("휴대폰번호 입력(-빼고) : ");
		String phone = sc.next();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("취미 입력 : ");
		String hobby = sc.next();
		Member m = new Member(id, pwd, name, gender, age, email, phone, address, hobby, null);
		return m;

	}

	public Member updateInfoKeyword() {
//		Member m = new Member();
		System.out.println("\n===회원정보수정===\n");
		System.out.print("수정할 아이디 조회 : ");
		String id = sc.next();
//		m.setMemberId(id);
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
//		m.setMemberPwd(pwd);
		System.out.print("이메일 입력 : ");
		String email = sc.next();
//		m.setEmail(email);
		System.out.print("휴대폰번호 입력(-빼고) : ");
		String phone = sc.next();
//		m.setPhone(phone);
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String address = sc.nextLine();
//		m.setAddress(address);
		System.out.print("취미 입력 : ");
		String hobby = sc.next();
//		m.setHobby(hobby);
		Member m = new Member(id, pwd, null, null, 0, email, phone, address, hobby, null);
		return m;
		//생성자로 한꺼번에 객체 생성할때, 1.입력받지 않은 부분은 null 또는 기본값으로 입력해야한다. 또는 2.입력받은 인자로 구성된 새로운 생성자를 vo에 만든다.
	}

	public String deleteInfoKeyword() {
		System.out.println("\n===회원 삭제===\n");
		System.out.print("삭제할 회원 아이디 입력 : ");
		String id = sc.next();
		return id;
	}

}
