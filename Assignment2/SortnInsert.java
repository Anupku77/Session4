import java.util.Arrays;

public class SortnInsert {

	public static void main(String[] args) {
		 int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		 Arrays.sort(array);
		 
		 int index = Arrays.binarySearch(array, 1);
		 System.out.println("Sorted array is ");
		 for(int i =0 ; i< array.length ; i++)
			 System.out.print(array[i] + " ");
		 System.out.println("\nkey can be inserted at index "+ (-index - 1));
		 
		 int newarray[] =  Arrays.copyOf(array, array.length+1);
		 newarray[-index-1] = 1;
		 for(int i =-index-1; i< newarray.length-1 ; i++ )
		 {
			 
			 newarray[i+1] = array[i];
			 
		 }
		 System.out.println("Sorted array after insertion is ");
		 for(int i =0 ; i< newarray.length ; i++)
			 System.out.print(newarray[i] + " ");
	}

}
