package kh.list.vo;

import java.util.Comparator;

public class NameAsc implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		MemberVo member1 = (MemberVo)o1;
		MemberVo member2 = (MemberVo)o2;
		
		//양수 리턴시 순서를 바꿈
		//앞이 더 크면 순서를 바꿈
		
		return member2.getMemberName().compareTo(member1.getMemberName());
	}

}
