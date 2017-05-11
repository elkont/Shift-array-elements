import java.util.Arrays;
import java.util.Scanner;

public class array1{
	public static void main (String[] args){
		int[] array1= {1,2,3,4,5,6,7,8,9,10};
		int i;

		System.out.println("Enter number: ");
		Scanner a= new Scanner(System.in);
		int rows=a.nextInt();


			for (i=0; i<rows; i++){

				shiftRight(array1);
			}
	}
		public static void shiftRight( int [] array1 )
    	{

       	 int last = array1[array1.length-1];

			//right shift
			for( int index =array1.length-2; index >= 0 ; index-- )
				array1[index+1] = array1[index];

			//  last element into first slot
			array1[0] = last;
			System.out.println(Arrays.toString(array1) );

		}
	}