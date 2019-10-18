import java.util.Arrays;

public class ArrayFlattener {
    public static void main(String [] args){
        int [][] flatten= new int[][]{{1,3},{0},{4,5,9}};
        System.out.println(Arrays.toString(flattenArray(flatten)));
    }

    public static int[] flattenArray(int [][] flatten){
        int [] arr =new int[0];
        int len=flatten.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<flatten[i].length;j++){
               if(j<=flatten[i].length)
                arr = flatten[j];
            }

        }
return arr;
    }

}
