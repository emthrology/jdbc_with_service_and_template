package member.controller;

import java.util.ArrayList;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import member.service.MemberService;
import member.view.MemberMenu;

public class MemberController {

	public void printAll(ArrayList<Member> list) {
		MemberMenu mm = new MemberMenu();
		list = new MemberService().printAll();
		if(!list.isEmpty()) {
			mm.printByArray(list);
		}else {
			mm.printMsg("조회결과 없음");
		}
	}
	
	public void printById(String id) {
		MemberMenu mm = new MemberMenu();
		Member m = new MemberService().printById(id);
		if(!m.equals(null)) {
			mm.printOne(m);
		}else {
			mm.printMsg("조회결과 없음");
		}
	}
	
	public void printByName(String name) {
		MemberMenu mm = new MemberMenu();
		ArrayList<Member> list = new MemberService().printByName(name);
		if(!list.isEmpty()) {
			mm.printByArray(list);
		}else {
			mm.printMsg("조회결과 없음");
		}
	}
	
	public void insertInfo(Member m) {
		MemberMenu mm = new MemberMenu();
		int result = new MemberService().insertInfo(m);
		if(result>0) {
			mm.printMsg("입력 성공");
		}else {
			mm.printMsg("입력 실패");
		}
	}
	
	public void updateInfo(Member m) {
		MemberMenu mm = new MemberMenu();
		int result = new MemberService().updateInfo(m);
		if(result>0) {
			mm.printMsg("수정 성공");
		}else {
			mm.printMsg("수정 실패");
		}
	}
	
	public void deleteInfo(String id) {
		MemberMenu mm = new MemberMenu();
		int result = new MemberService().deleteInfo(id);
		if(result>0) {
			mm.printMsg("삭제 성공");
		}else {
			mm.printMsg("삭제 실패");
		}
	}
}
