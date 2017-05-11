import java.util.Arrays;
import java.util.Scanner;
public class array2{
public static void main (String[] args){


	double[] array = {1,2,3,4,5,6,7,8,9,10};


		for (int i=0; i<array.length; i++){
			array[i]=array[i];
			shiftRight(array);

				Scanner a= new Scanner(System.in);
				int rows=a.nextInt();


				for (i=0; i<rows; i++){


					shiftRight(array);

		}

		}


}
public static void shiftRight( double [] array2 )
    {

        double last = array2[array2.length-1];

        //right shift
        for( int index =array2.length-2; index >= 0 ; index-- )
            array2[index+1] = array2[index];

        //  last element into first slot
        array2[0] = last;
        System.out.println(Arrays.toString(array2) );

    }
}

