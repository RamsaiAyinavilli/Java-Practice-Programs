import java.util.Scanner;

public class PBa {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a number");
	int x=scan.nextInt();
	System.out.println("factorial of "+x+"are : ");
	int i,fact=1;
	
	for( i=1;i<=x;i++) {
		fact=fact*i;
	}System.out.println(fact+"");

}
}
