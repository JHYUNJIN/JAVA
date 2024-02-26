package collectionTest;

public class ForEachTask {
	public static void main(String[] args) {

		//		실습
		//		각 학생의 총점과 평균을 출력해보세요!
				
		int[][] scores = {{100,80,65},{40,77,30}};
		int total=0;
		double avg=0.0;
		for (int[] stu : scores) { // 이중 포문의 0번째 1번째 반복 해주는 코드
			total=0;
			for (int score : stu) { // 0번째 인덱스의 0,1,2번째 반복 // 1번째 인덱스의 0,1,2,번째 반복 해주는 코드
				total+=score; // total=total
			}
			avg=(double)total/stu.length;
			avg = Double.parseDouble(String.format("%.2f",avg)); // 소수점 2번째까지 출력해주는 코드
			System.out.println(total);
			System.out.println(avg);
		}
	}
}
