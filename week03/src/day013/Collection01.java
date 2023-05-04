package day013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {
	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 과리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * 
		 * List : 배열과 동일
		 * - 값을 하나씨 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 배열 대신 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장X (index) 번지가 없음
		 * - 중복을 허용하지 않음
		 * 
		 * Map
		 * - 값을 두개 저장, key/value 쌍으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - key가 중복되면 덮어쓰기됨
		 * - 아이디 패스워드처럼 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * int[] arr : 기본 자료형 사용 가능
		 * collection에서는 어떤 클래스로 데이터를 관리할지 지정해야 함.
		 * 
		 * int -> Integer, String, 나머지 자료형들은 첫글자만 대문자로 변환 Byte, Boolean ...
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.
		 * 
		 * size()
		 * add()
		 * get()
		 * set()
		 * remove(index) : index 번지값 삭제
		 * remove(object) : object 값 삭제
		 * contains(object) : object 값이 있는지 확인 후 true/false로 반환
		 * clear() : list 삭제 (비움)
		 * isEmpty() : list가 비어있는지 확인 후 true/false로 반환
		 * hasNext()
		 * next()
		 * indexOf()
		 * sort()
		 */
		
		//List list1 = new List();		// error
		List list1 = new ArrayList();		// 클래스를 지정하지 않았기 떄문에 Object로 자동 지정됨
		ArrayList list2 = new ArrayList();		// 클래스를 지정하지 않았기 떄문에 Object로 자동 지정됨
		ArrayList<Integer> list3 = new ArrayList<Integer>();		// int(Integer)형으로만 입력 가능한 ArrayList 생성
		ArrayList<String> list4 = new ArrayList<String>();		// String형으로만 입력 가능한 ArrayList 생성
		
		// add() : 요소를 추가
		list3.add(1);
		list3.add(2);
		list3.add(3);
		
		System.out.println(list3);		// toString() 메소드가 기본적으로 정의되어있음
		System.out.println(list3.size());		// size() 메소드를 통해 list의 길이를 가져올 수 있음
		
		list4.add("A");
		list4.add("B");
		list4.add("C");
		list4.add("D");
		list4.add("E");
		
		System.out.println(list4);
		System.out.println(list4.size());
		
		// 리스트를 생성하고 1~10까지 저장한 후 출력
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
		
		System.out.println(numList);
		System.out.println(numList.size());
		System.out.println(numList.get(0));
		numList.set(0, 5);
		numList.remove(1);
		Integer a = 10;
		numList.remove(a);
		System.out.println(numList);
		
		for (int i = 1; i <= 5; i++) {
			numList.add(i);
		}
		System.out.println(numList);
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.printf("%d ", numList.get(i));
		}
		System.out.println();
		
		for (int tmp : numList) {
			System.out.printf("%d " , tmp);
		}
		System.out.println();
		
		/* 
		 * Iterator : 컬렉션을 출력하기위해 사용
		 * list는 순서를 보장하기 때문에 get()을 이용하여 원하는 번지에 접근 가능
		 * set은 순서를 보장하지 않기 때문에 for문을 이용할 수 없음
		 * - 향상된 for문, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문으로 출력 가능
		 */
		
		Iterator<Integer> it = numList.iterator();
		
		while(it.hasNext()) {
			Integer tmp = it.next();		// next() : 다음 요소 가져오기
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		
		/*
		 * indexOf(값) : 해당 값의 list index 번지를 반환, 없다면 -1리턴
		 */
		
		Integer b = 5;
		System.out.println(numList.indexOf(b));
		
		/*
		 * sort(객체)
		 * - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야함. (익명클래스를 사용)
		 * - 비교(compare) 메서드를 사용하여 객체를 정렬 
		 */
		
		Collections.sort(numList);		// 오름차순 정렬만 가능
		System.out.println(numList);
		
		numList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : 오름차순, o2-o1 : 내림차순
				return o2-o1;
			}
		});
		System.out.println(numList);
	}
}
