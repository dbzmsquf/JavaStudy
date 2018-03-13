package kh.list.vo;

import java.util.Comparator;

public class MemberNoDesc implements Comparator<MemberVo>{
	@Override
	public int compare(MemberVo o1, MemberVo o2){
	
//		int result = -1;
//		if(o1.getMemberNo() < o2.getMemberNo()){
//			result = 1;
//		}
//		return result;
		return o2.getMemberNo() - o1.getMemberNo(); 
		// 0, 음수 - 변경하지 않습니다.
		// 양수(1) - 변경합니다.
		
	}
}
