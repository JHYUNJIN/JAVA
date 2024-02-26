package wrapper;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class WrapperTask {
	public static void main(String[] args) {
//		아래의 값들을 하나의 배열에 담기, 단 String[] 사용금지
//		1,3.14,'a','dog',true
		
		 Object[] ar = {1,3.14,'a',"dog",true};
		 
		 System.out.println(Arrays.toString(ar));
		 System.out.println(ar[0].getClass().getTypeName());
		
		
	}
}
