package anonymousTast;

public class Building {
	public static void main(String[] args) {
		
// 역삼점 오픈
//	역삼점은 무료 나눔 행사중이라서 판매 방식을 구현할 필요없다.
//	본사에서는 전달받은 양식을 검사할 때
//	무료나눔 행사중인 매장이라면 "무료나눔 행사중"출력하기
	Banapresso sf = new Banapresso();
	sf.register(new FormAdapter() {
		@Override
		public String[] getMenu() {
			String[] menus = {"아메리카노","카푸치노","바나리카노"};
			return menus;
		}
	});
//	신림점
//	본사에서 요구하는 방식 그대로 구현
		Banapresso silim = new Banapresso();
		
		silim.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for(int i=0;i<menus.length;i++) {
					if(order.equals(menus[i])) {
						System.out.println("판매완료");
						return;
					}
				}
					System.out.println("메뉴가 없습니다.");
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = { "시그니처 아메리카노", "다방 커피","리얼 복숭아 아이스티"};
				return menus;
			}
		});
		
		
		
	}
}
