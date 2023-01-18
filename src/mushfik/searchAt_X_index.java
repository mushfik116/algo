package mushfik;

public class searchAt_X_index {
    public static void main(String[] args) {
        int[] arr={1,2,3,16,19,96};

        int res=valueAT(arr,16);
        System.out.println(res);
    }
    static int valueAT(int[]arr,int a){
       for(int each:arr){
           if(each==a){
               return each;
           }

       }
       return Integer.MAX_VALUE;
    }
}
