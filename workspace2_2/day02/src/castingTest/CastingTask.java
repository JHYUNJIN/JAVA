package castingTest;




public class CastingTask extends OTT{

//	OTT 넷플릭스
//	애니메이션, 영화, 드라마 클래스 선언
//	사용자가 선택한 영상이 애니메이션이라면 자막지원 기능 사용
//	영화라면 4D 기능 사용
//	드라마라면 굿즈 기능 사용
	
	public void check(OTT ott) {
		if(ott instanceof Animation) {
			Animation ani = (Animation)ott;
			ani.printSubTitle();
		}
		else if(ott instanceof Drama) {
			Drama drama = (Drama)ott;
			drama.buyGoods();
		}
		else {
			Movie movie = (Movie)ott;
			movie.print4D();
		}
	}
	
	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		
		OTT ott = new Animation();
		ct.check(ott);

		
		
		
	}
	


}
