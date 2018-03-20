package javastuff;

public class ArrayStuff {

	public static void main(String[] args) {
	
		// Single Dimensinol Array
		/*	int[] a= new int[5]; // declaration and instantiation
		//int []b;  - declaration
		//int c[];
		a[0] = 10; // initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//System.out.println("..."+ a[6]);
		
		int size = a.length;
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		} */
		
		//multidimentinol Array
		
	/*	int a[][]= new int[3][3];
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3;j++) {
				System.out.print(a[i][j] + " ");			
			}
			System.out.println();
		} */
		
		
		// using For each loop to get the values of an array
		
		//int a[] = {10,20,30,40,50};
		//char x ='a';
		
		char c[] = {'a','b','c','d','e'};
		
		//int size = a.length;
		
		for(char x : c) {
			System.out.println(x);
		}

	}

}
