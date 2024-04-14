
import java.util.Arrays;

public class 변수_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr= {30, 20, 40, 50 ,10};
           System.out.println("변경전:");
           System.out.println(Arrays.toString(arr));
           Arrays.sort(arr);
           /*
           for(int i=0;i<arr.length-1;i++)
        	   
	}*/
           System.out.println("변경후:");
           System.out.println(Arrays.toString(arr));

}
}