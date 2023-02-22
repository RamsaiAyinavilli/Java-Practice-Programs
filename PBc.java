import java.util.Scanner;

//fibonacci
public class PBc {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int x=scan.nextInt();
	int num1 = 0,num2 = 1;
	System.out.print(num1+" "+num2);
	for(int i=2;i<x;i++) {
	int num3=num1+num2;
	System.out.print(" "+num3);
	num1=num2;
	num2=num3;
	}
}}
