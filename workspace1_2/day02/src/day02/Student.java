package day02;

public class Student {
/*
 * 몇명의 학생을 등록할까요 ? 3 --> scanner
 * 1번째 학생의 번호를 입력하세요 1 --> setter
 * 1번쨰 학생의 이름을 입력하세요 : 홍길동
 * 1번째 학생의 국어점수를 입력하세요 100
 * 1번째 학생의 자바점수를 입력하세요 100
 * 1번째 학생의 수학점수를 입력하세요 100
 * 
 * 학생리스트
 * 번호1 : 홍길동, 국어점수 : 100, 자바점수 : 100, 수학점수 : 100 , 총점 : 300, 평균: 100
 * 
 * (단 출력은 toString()을 오버라이딩해서 작성
 * 
 */
	private int num;
	private String name;
	private int kor;
	private int java;
	private int math;
	private int total;
	private double avg;
	
	public Student() {
	}
	
	public Student(int num, String name, int kor, int java, int math, int total, double avg) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.java = java;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		

		return "[번호 : "+num+", 이름 :"+name+", 국어 :"+kor+", 자바 : "+java+", 수학 : "+math+","+" 총점 : "+total+", 평균"+avg;
	}
	
	
	
	
	
	
}
