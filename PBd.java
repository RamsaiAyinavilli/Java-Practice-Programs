import java.util.Arrays;
import java.util.Scanner;

//array sort
public class PBd {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("array size");
	int size=scan.nextInt();
	int arr[]=new int[size];
	System.out.print("enter"+size+"numbers:");
	for(int i=0;i<size;i++) {
		arr[i]=scan.nextInt();
	}System.out.println("array orginal"+Arrays.toString(arr));
	//Arrays.sort(arr);
	//System.out.println("array orginal"+Arrays.toString(arr));
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]>arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}System.out.println("array orginal"+Arrays.toString(arr));
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]<arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}System.out.println("array orginal"+Arrays.toString(arr));
	
	
}
}
