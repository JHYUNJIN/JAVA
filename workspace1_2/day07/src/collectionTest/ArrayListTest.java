package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
//		<> : 제네릭
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 저장할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운캐스팅을 할 필요가 없다. 그렇기에 제네릭에 Object는 사용하지 않는다.
//		저장할 타입에 제한을 줄 수 있다.
//		꺽새까지가 하나의 타입이다.
		
//		ArrayList<Integer> datas = new ArrayList<>();
//		
//		System.out.println(datas.add(100));
//		datas.add(300);
//		datas.add(200);
//		datas.add(500);
//		datas.add(400);
//		datas.add(700);
//		datas.add(600);
//		System.out.println(datas);
//		Collections.sort(datas); // 내림차순 정렬
//		System.out.println(datas);
//		Collections.reverse(datas); // 역정렬
//		System.out.println(datas);

		
//		System.out.println();
		ArrayList<Object> data = new ArrayList<>();
		data.add("정현진");
		data.add("최고!!");
		data.add(100);
		data.add(true);
		System.out.println(data);
		System.out.println(data.size());
//		참고) datas[0]; 인덱스 번호로 값을 불러오는것은 배열의 방식이다.
//				리스트는 datas.get(0); 이런식으로 불러올 수 있다.
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}
		System.out.println(data.get(0));
		data.add(0,1000);
		data.add(0,1000);
		data.add(0,1000);
		System.out.println(data);
		
		System.out.println(data.contains(1000));
		System.out.println(data.indexOf("정현진"));
//		if문 사용하여 정현진 뒤에 참 잘했어요 데이터 삽입하기
		if(data.contains("정현진")) {
			data.add(data.indexOf("정현진")+1,"참 잘했어요!");
		}
		System.out.println(data);
		
//		수정해보자, 참 잘했어요를 정말 잘했어요로 수정
		data.set(data.indexOf("참 잘했어요!"), "정말 잘했어요!");
		System.out.println(data);
		
//		삭제, 인덱스 번호를 사용하여 삭제하기 
		data.remove(0);
		System.out.println(data);
		
//		값을 활용하여 삭제하기
//		data.remove(1000); // 이렇게는 사용못한다.
		data.remove(Integer.valueOf(1000)); // 1000이라는 int 데이터를 인티져클래스로 박싱하여 삭제시켜줌 
		data.remove((Integer)(1000)); // 강제형변환
		System.out.println(data);
		
		
		
		
	}
}
