import java.util.Arrays;
import java.util.Scanner;

public class PBe {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("enter size");
int n=scan.nextInt();
int a[]=new int[n];
int i,sum=0,sume=0,sumo=0,sump=0,sumP=0;
System.out.println("enter"+n+"numbers");
for(i=0;i<n;i++) {
	a[i]=scan.nextInt();}
System.out.print("enterd numbers are: ");
for(i=0;i<n;i++) {
	System.out.print(a[i]+" ");
	sum+=a[i];
}System.out.println();
System.out.println("sum of numbers are : "+sum);
//even
System.out.print("even numbers are: ");
for(i=0;i<n;i++) {	if(a[i]%2==0) {
	System.out.print(a[i]+" ");
	sume+=a[i];
}}System.out.println();
System.out.println("sum of even numbers are : "+sume);
//odd
System.out.print("0dd numbers are: ");
for(i=0;i<n;i++) {	if(a[i]%2!=0) {
	System.out.print(a[i]+" ");
	sumo+=a[i];
}}System.out.println();
System.out.println("sum of 0dd numbers are : "+sumo);

//prime and non prime
System.out.print("prime numbers are :");
boolean k=true;
for(i=0;i<n;i++) {
	for(int j=2;j<a[i];j++) {
		if(a[i]%j==0) {
			k=false;
			break;
		}
	}
	if(k==true) {
	System.out.print(a[i]+" ");
		sump+=a[i];
	}else {
		System.out.println();
		System.out.print("Non prime numbers "+a[i]);
		sumP+=a[i];
	}

}System.out.println();
System.out.println("sum of prime numbers are : "+sump);
System.out.println("sum of non-prime numbers are : "+sumP);
}
}
