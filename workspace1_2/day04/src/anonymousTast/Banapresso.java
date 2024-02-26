package anonymousTast;

public class Banapresso { // 본사
	
	public void register(Form form) /*업캐스팅*/ {

		String[] menus = form.getMenu();
		System.out.println("=====메뉴=====");
		for(int i=0;i<menus.length;i++) {
			System.out.println(i+1+". "+menus[i]);
		}
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔행사중");
			return; // 메소드 탈출하는 코드 return
		}
		form.sell("다방 커피");
		form.sell("아메리카노");
	}
}
