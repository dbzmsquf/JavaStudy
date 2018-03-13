package kh.list.vo;


import java.util.Comparator;

public class JoinDateDesc implements Comparator<MemberVo>{
	@Override
	public int compare(MemberVo o1, MemberVo o2){
	
	
	//return o2.getJoinDate().compareTo(o1.getJoinDate());
	
	int result = -1;
	if(o2.getJoinDate().getTime() - o1.getJoinDate().getTime() >0){
		result = 1;
	}
		
	return result;
	}
}
