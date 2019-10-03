public class DualArray {
    public static void main(String[] args){
        int [] array1={1,2,3,0};
        int [] array2={1,2,3};
        int [] array3={1,1,2,2};
        System.out.println(isDual(array1));
        System.out.println(isDual(array2));
        System.out.println(isDual(array3));
    }
    public static boolean isDual(int [] arr){
        //boolean flag=false;
        int len=arr.length;
        if (len%4!=0){
           return false;
        }
        for (int i=0;i<len;i++){
                if (arr[i]+arr[i+1]!=arr[i+2]+arr[i+3]){
                    return false;
                }
            break;
        }

    return true;
    }
}
