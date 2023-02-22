import java.util.Scanner;

//pallindrome
public class PBf {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int p=scan.nextInt();
int sum=0,temp=p;
	while(p>0) {
		int r=p%10;//get remainder
		sum=(sum*10)+r;
		p=p/10;
	}if(temp==sum) {
		System.out.println("pallindrome number");
	}else {
		System.out.println("not pallindrome");
	}
}
}
