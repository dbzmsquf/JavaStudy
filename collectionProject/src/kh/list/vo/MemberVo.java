package kh.list.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemberVo {
	
	private int memberNo;
	private String memberName;
	private Date joinDate;
	
	public MemberVo(){
		
	}
	public MemberVo( int memberNo, String memberName, Date joinDate){
		
		this.memberNo= memberNo;
		this.memberName= memberName;
		this.joinDate= joinDate;
	}
	
	//alt+shift+s +r  자동 완성
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return memberNo + ", "+memberName+", "+ sdf.format(joinDate);
		
		
	}
	
}
