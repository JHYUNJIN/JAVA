package bath;

class Soap {
	  private String s;
	  Soap() {
	    System.out.print("Soap()");
	    s = "Constructed";
	  }
	  public String toString() { return s; }  // toString메소드를 사용하면 그 결과로 Constructed를 반환시켜라
	}	

	public class Bath {
	  private String 
	    s1 = "Happy",
	    s2 = "Happy",
	    s3, s4;
	  private Soap castille;
	  private int i;
	  private float toy;
	  public Bath() {
	     System.out.print("Inside Bath()");
	    s3 = "Joy";
	    toy = 3.14f;
	    castille = new Soap();
	  }	

	  { i = 47; }
	  public String toString() {
	    if(s4 == null) // s4 참조변수의 주소가 null이라면. 주소가 null이라면이라는것은 초기화가 되지 않았다는 의미이다.
	      s4 = "Joy";
	    return
	      "s1 = " + s1 + "\n" +
	      "s2 = " + s2 + "\n" +
	      "s3 = " + s3 + "\n" +
	      "s4 = " + s4 + "\n" +
	      "i = " + i + "\n" +
	      "toy = " + toy + "\n" +
	      "castille = " + castille;
	  }	
	  public static void main(String[] args) {
	    Bath b = new Bath();
	     System.out.print(b);
	  }
	} 

	/*
	s1 = Happy
	s2 = Happy
	s3 = Joy
	s4 = Joy
	i = 47
	toy = 3.14
	castille = Soap()
	Constructed
	*/

	
