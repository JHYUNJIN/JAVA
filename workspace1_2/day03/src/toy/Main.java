package toy;

public class Main {
	public static void main(String[] args) {
		
		Company seoul = new Company("서울");
		Company busan = new Company("부산");
		seoul.register(new Dog());
		busan.register(new Toy() {
			
			@Override
			public String[] speakList() {
				String[] list = {
						"착한 어린이는 울지 않아",
						"냐옹",
						"멍멍"
				};
				return list;
			}
			
			@Override
			public void pushBtn(String speak) {
				System.out.println(speak);
			}
		});
		
		ToyAdapter toy = new ToyAdapter() {
			
			@Override
			public String[] speakList() {
				String[] list = {
						"테스트용",
						"어흥",
						"밥"
				};
				return list;
			}
		};
		busan.register(toy);;
	}
}
