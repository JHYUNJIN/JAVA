package bath;

class Cleanser {
	  private String s = "Cleanser\n";
	  public void append(String a) { s += a; }
	  public void dilute() { append(" dilute()\n"); }
	  public void apply() { append(" apply()\n"); }
	  public void scrub() { append(" scrub()\n"); }
	  public String toString() { return s; }
	  
	  public static void main(String[] args) {
	    Cleanser x = new Cleanser();
	    x.dilute(); x.apply(); x.scrub();
	     System.out.print(x);
	  }
	}	

	public class Detergent extends Cleanser {
	  public void scrub() {
	    append(" Detergent.scrub()\n");
	    super.scrub(); 
	  }
	 
	  public void foam() { append(" foam()\n"); }

	  public static void main(String[] args) {
	    Detergent x = new Detergent();
	    x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	     System.out.print(x);
	     System.out.print("Testing base class:\n");
	    Cleanser.main(args);
	  }	

	}

