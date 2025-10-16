package CoreJava;

public class ArraysSmallandBignumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array program to find the smallest number
		int a [] = {43,21,44,31,99,3,2};
		
		int min =a[0]; // Assume the first value in the array to be the smallest
		
		for (int i =0; i<a.length ; i++) {
			 
				if (a[i]<min){
					min=a[i]; //assign the current value to the min variable
				}
			
		
		}
		System.out.println(min);
		
		//2 dimensional array to find the big number
		
		int b[][] = {{34,33,99},{12,45,90},{32,99,1}};
		
		int max =b[0][0]; // Assume the first value in the array to be the largest
		int maxrow=0;
		int maxcolumn = 0;
		
		for (int i =0; i <3 ; i++) {
			
			for (int j=0; j<3 ; j++) {
				
				if (b[i][j]>max) {
					max =b[i][j];
					maxrow=i;
					maxcolumn=j;
				}
			}
			
		}
		
		System.out.println("The max column where the value is "+ maxcolumn);
		System.out.println("The max row where the value is "+ maxrow);
		System.out.println(max);
		
		//Find the smallest value in the column where the largest value is present
		int k=0;
		int mincol=b[k][maxcolumn];
		while(k<3) {
			if (b[k][maxcolumn]<mincol) {
				mincol=b[k][maxcolumn];
			}
			k++;
		}
		
		System.out.println("The smallest value in the column where the largest value is present "+mincol );
	}

}
