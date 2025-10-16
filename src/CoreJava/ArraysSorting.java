package CoreJava;

public class ArraysSorting {
	
	public static void main (String[] args)
	{
	    int[] array = {3,1,2,6,9,5,4,7,8};
	    

	    for(int i = 0 ; i < array.length;i++)
	    {
	        for(int j = i+1 ; j< array.length;j++)
	        {
	            if(array[i] > array[j])
	            {
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	    
	    for (int k : array) {
	    	System.out.print(k+"\t");
	    }

}
	
}
