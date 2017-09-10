import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		do{
		System.out.println("Enter a number:");
		
		int n = input.nextInt();
		if(n==0) {
		System.out.println("---END---");
		return;
		}
		
		char[][] arr = new char[n*2-1][n*2-1];
		fillArray(arr,n*2-1);
		fillArrowInArray(arr,n);
		System.out.println("Enter position(up,down,left,right):");
		String pos = input.next();
		
		switch(pos) {
		case "up":printArrayUp(arr,n*2-1);break;
		case "down":printArrayDown(arr,n*2-1);break;
		case "left":printArrayLeft(arr,n*2-1);break;
		case "right":printArrayRight(arr,n*2-1);break;
		}
		}while(true);
		//Arrays.fill(arr, '$');
		//System.out.println(Arrays.deepToString(arr.toString()));
		/*
		printArrayDown(arr,n*2-1);
		printArrayUp(arr,n*2-1);
		printArrayLeft(arr,n*2-1);
		printArrayRight(arr,n*2-1);
		*/
		
	}
	static void printSymbol(int n,char s) {
		for(int i=0;i<n;i++) {
			System.out.print(s);
		}
	}
	static void printArrayDown(char arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int k=0;k<n;k++) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
	}
	static void printArrayRight(char arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int k=0;k<n;k++) {
				System.out.print(arr[k][i]);
			}
			System.out.println();
		}
	}
	static void printArrayUp(char arr[][],int n) {
		for(int i=n-1;i>=0;i--) {
			for(int k=n-1;k>=0;k--) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
	}
	static void printArrayLeft(char arr[][],int n) {
		for(int i=n-1;i>=0;i--) {
			for(int k=n-1;k>=0;k--) {
				System.out.print(arr[k][i]);
			}
			System.out.println();
		}
	}
	static void fillArray(char arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int k=0;k<n;k++) {
				arr[i][k]='.';
			}
		}
	}
	static void fillArrowInArray(char arr[][],int n) {
		for(int i=1;i<=n;i++) {
			arr[0][n/2-1+i]='#';
		}
		for(int i=1;i<=n-2;i++) {
			arr[i][n/2]='#';
			arr[i][n+n/2-1]='#';
		}
		for(int i=0;i<(n+1)/2;i++) {
			arr[n-1][i]='#';
			arr[n-1][n+n/2-1+i]='#';
		}
		for(int i=0;i<n-2;i++) {
			arr[n+i][i+1]='#';
			arr[n+i][n*2-3-i]='#';
		}
		arr[n*2-2][n-1]='#';
	}

}
/*
//sector 1
printSymbol(n/2,'.');
printSymbol(n,'#');
printSymbol(n/2,'.');
System.out.println("");
//sector 2
for(int i=0;i<n-2;i++) {
	printSymbol(n/2,'.');
	printSymbol(1,'#');
	printSymbol(n-2,'.');
	printSymbol(1,'#');
	printSymbol(n/2,'.');
	System.out.println("");
}
//sector 3
printSymbol(n/2+1,'#');
printSymbol(n-2,'.');
printSymbol(n/2+1,'#');
System.out.println("");
//sector 4
for(int i=1;i<n-2;i++) {
	printSymbol(i,'.');
	printSymbol(1,'#');
	printSymbol(n*2-3-i*2,'.');
	printSymbol(1,'#');
	printSymbol(i,'.');
	System.out.println("");
}
//sector 5
printSymbol(n-1,'.');
printSymbol(1,'#');
printSymbol(n-1,'.');
System.out.println("");
*/
