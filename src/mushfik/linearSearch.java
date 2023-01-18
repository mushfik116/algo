package mushfik;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,16,19,6};
        int res=linear(arr,6);
        System.out.println(res);
    }

    static int linear(int[] arr,int a){

        for (int jen=0;jen<arr.length;jen++){

            if(arr[jen]==a){
                return jen;
            }


        }
        return -1;
    }
}
