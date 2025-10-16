package CoreJava;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays
		
		int[] arr= new int [5];
		arr[0]=9;
		arr[1]=8;
		arr[2]=7;
		arr[3]=6;
		arr[4]=5;
		
		int arr1[] = {1,2,3,4,5};
		
		//normal for loop
		for (int i=0; i < arr.length ; i++)
		{
			System.out.print(arr[i] );
			
			if (i <arr.length -1) {
				System.out.print(",");
			}
			
		}
		
		System.out.println();
		
		//enhanced for loop
		for (int j : arr1)
		{
			System.out.println(j);
		}
		
		//Reverse an array
		for (int i =arr.length -1 ; i>=0; i--)
		{
			System.out.print(arr[i]);
			
			if (i > 0) {
				System.out.print(",");
				
			}
			
		}

	}

}
