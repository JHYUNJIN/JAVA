package words;

public class Voca {
	private String eng;
	private String kor;
	private int level;
	private String reg_date;
	public Voca(String eng, String kor, int level, String reg_date) {
		this.eng = eng;
		this.kor = kor;
		this.level = level;
		this.reg_date = reg_date;
	}
	public String getEng() {
		return eng;
	}
	public String getKor() {
		return kor;
	}
	public int getLevel() {
		return level;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// apple : 사과(레벨:1, 날짜 : 2023-07-01)
		return eng+" : "+kor+"(레벨 : "+level+", 날짜 : "+reg_date+")";
	}
	

	
	
	
}
