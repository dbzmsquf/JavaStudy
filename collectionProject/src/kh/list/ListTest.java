package kh.list;

import java.lang.reflect.Member;
import java.util.*;

import kh.list.vo.JoinDateDesc;
import kh.list.vo.MemberNoDesc;
import kh.list.vo.MemberVo;
import kh.list.vo.NameAsc;

public class ListTest {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add(5);
//		list.add(7);
//		list.add(20);
//		
		
//		for(int i = 0 ; i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
		MemberVo mv1 = new MemberVo(10, "유큰별", new Date());
		MemberVo mv2 = new MemberVo(20, "yoo", new Date(0));
		MemberVo mv3 = new MemberVo(30, "park", new Date(907219283829L));
		MemberVo mv4 = new MemberVo(40, "kim", new Date(967219283829L));
		MemberVo mv5 = new MemberVo(50, "choi", new Date(957212519283829L));
		MemberVo mv6 = new MemberVo(60, "moon", new Date(997219283829L));
		MemberVo mv7 = new MemberVo(70, "chang", new Date(937219283829L));

		
//		List list = new ArrayList();
//		
//		list.add(mv1);
//		list.add(mv2);
//		list.add(mv3);
//
//		for(Object obj : list){
//			System.out.println((MemberVo)obj);
//		}
//		System.out.println("------");
//		list.remove(mv3);
//		list.remove(mv1);
//		list.add(mv4);
//		list.add(mv5);
//		list.add(mv6);
//		list.add(mv7);
//		
//		for(Object obj : list){
//			System.out.println((MemberVo)obj);
//		}
//		
//		System.out.println(list.size());
//		list.sort(new NameAsc());
//		// sort(comparator)
//
//		for(Object obj : list){
//			System.out.println((MemberVo)obj);
//		}
//	}

		List<MemberVo> list = new ArrayList<MemberVo>();
		
		list.add(mv1);
		list.add(mv2);
		list.add(mv3);

		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
		System.out.println("------");
		list.remove(mv3);
		list.remove(mv1);
		list.add(mv4);
		list.add(mv5);
		list.add(mv6);
		list.add(mv7);
		
		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
		
		System.out.println(list.size());
		list.sort(new NameAsc());
		// sort(comparator)
		
		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
		
		System.out.println();
		Iterator<MemberVo>iter =list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println();
		ListIterator<MemberVo>listIter =list.listIterator();
		while(listIter.hasNext()){
			System.out.println(listIter.next());
			if(listIter.hasPrevious()){
				System.out.println(listIter.previous());
				System.out.println(listIter.next());
			}
		}
		
		//현재 list에 저장되어있는 객체 값중
		//memberNo 값을 가지고 정렬하여 출력하시오. 단 no의 내림차순 정렬
		
		System.out.println();
		
		
		list.sort(new MemberNoDesc());

		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
		
		
		System.out.println();

		list.sort(new JoinDateDesc());

		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
	}
	
	
}
