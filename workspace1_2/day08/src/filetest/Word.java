package filetest;

public class Word {
	private String eng;
	private String kor;
	private int level;
	private String reg_date;
	
	
	
	public Word(String eng, String kor, int level, String reg_date) {
		super();
		this.eng = eng;
		this.kor = kor;
		this.level = level;
		this.reg_date = reg_date;
	}

	public Word() {
		// TODO Auto-generated constructor stub
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLeg_date() {
		return reg_date;
	}

	public void setLeg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(eng).append(", ").append(kor).append(", ").append(level).append(", ").append(reg_date);
		return sb.toString();
	}
	
}
