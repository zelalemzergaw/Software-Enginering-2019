import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HasOnlyOneMaximum {
    public static void main(String [] args){
        Integer [] array1={-6,2,5,6,-6,5,6,};
        Integer [] array2={1,2,3,4,5,6,6};
        Integer [] array3={1,1,2,2,3,8,5,9};
        System.out.println(hasMaximumValue(array1));
        System.out.println(hasMaximumValue(array2));
        System.out.println(hasMaximumValue(array3));
    }
    public static boolean hasMaximumValue(Integer [] arr){

       int max= Collections.max(Arrays.asList(arr));
       int count=1;
       for (int i=0;i<arr.length;i++){
       if(max==arr[i]) {
           count++;
       }
       if (count>=2){
           return  false;
       }
       break;
       }
        return true;
    }
}
