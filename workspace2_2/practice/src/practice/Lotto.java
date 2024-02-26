package practice;

public class Lotto {
			// 로또번호 추측 (랜덤한 숫자를 가져오는 메소드)
			// 1~45까지의 임의의 숫자 6개 추출 (6개의 숫자를 담을 배열을 만들자)
			// 번호는 중복되지 않아야 함 (로또번호의 숫자가 같다면 추가하지 말고 반복을 한번 더 해주자. 
											// 반복을 한번 더 해주려면 i--를 해주면 된다.
			// 출력시 오름차순 정렬 (로또의 숫자를 비교하여 만약 i번째 숫자가 j번째 숫자보다 더 크다면 i=tmp , j=i tmp=i
			// math.random을 사용해서 만들어보자
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i=0;i<lotto.length-1;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					int tmp=0;
					tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		
		System.out.print("로또번호 : ");
		for(int i=0;i<lotto.length;i++) {
		System.out.print(lotto[i]+" ");
		}
	}
}
