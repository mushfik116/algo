package mushfik;

public class searchString {
    public static void main(String[] args) {
        String a="jilysm";

        String[] arr={"jen","jennie","jilysm","m"};

       int res= findIndex(arr,a);
        System.out.println(res);


    }
    static int findIndex(String[] arr,String a){

        for (int i=0;i< arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return Integer.MIN_VALUE;

    }
}
