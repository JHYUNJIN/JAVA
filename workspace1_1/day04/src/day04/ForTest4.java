package day04;

public class ForTest4 {
public static void main(String[] args) {
/*
	for(int i=0;i<10;i++) {
		break;
	if(i==5) {
		continue;
		System.out.print(i);
	}
	
}
*/
	
	
	int total=0;
	for(int i=0;i<100;i++) {
		total+=i+1;
	}
	System.out.print(total);

	
	int total2=0;
	for(int i=0;i<100;i++) {
		if(i%2==0) {
		continue;
	}
		total2 += i+1;
	System.out.print(total2);
	}
		
	}
	
}	

