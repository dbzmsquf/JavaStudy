package kh.collection;

public class CustomVectorTest {

	public static void main(String[] args) {
		
		CustomVector myVector = new CustomVector(10);
		System.out.println("capacity 1 : " +myVector.capacity());
		System.out.println("비어있음 : " +myVector.isEmpty());
		System.out.println("값의 갯수 : " +myVector.size());
		
		myVector.add("1");
		myVector.add("2");
		myVector.add("유큰별");
		myVector.add("서울");
		myVector.add("dfdsa");
		myVector.add("773");
		System.out.println("capacity 1 : " +myVector.capacity());
		System.out.println("비어있음 : " +myVector.isEmpty());
		System.out.println("값의 갯수 : " +myVector.size());
		System.out.println(myVector.get(6));
		
		myVector.remove("3");
		System.out.println(myVector.toString());
		
	}

}
