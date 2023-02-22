import java.util.Scanner;
//negative factorial
public class PBb {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int x= scan.nextInt();
	System.out.println("factorial of "+x+"are : ");
		for(int i=x;i<=-1;i++) {
		
			if(x%i==0) {System.out.println(i+" ");
		}}
		
	
}
}
/*for positive
for(int i=1;i<=x;i++) {
	
	if(x%i==0) {System.out.println(i+" ");
}}*/