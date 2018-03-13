package kh.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import kh.list.vo.MemberVo;

public class HashSetTest {

	public static void main(String[] args) {
		//다형성을 적용하여 객체 생성 -> 구현클래스를 통해 객체 생성
		Set set = new HashSet();
//		HashSet set1 = new HashSet();
		set.add(15);
		set.add(new Date());
		set.add(2.55);
		set.add(new Character('c'));
		set.add(new MemberVo(50, "유큰별", new Date()));
		
		System.out.println(set.toString());
		
		set.add(15);
		set.add(new Character('c'));
		set.add(2.55);
		set.add(2.55);
		set.add(15);

		set.add(15);
		System.out.println(set.toString());
		System.out.println();
		System.out.println("포함된 값의 갯수 : "+set.size());
		System.out.println("비어있음 여부 확인 : "+set.isEmpty());
		System.out.println("해당 객체 존재 여부 확인 : "+set.contains(15));
		System.out.println("배열로 변환 : "+set.toArray());
		System.out.println("값 삭제 : "+set.remove(2.55));
		System.out.println(set.toString());

	}

}
