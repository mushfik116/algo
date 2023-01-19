package mushfik;

public class findFloor {
    public static void main(String[] args) {

        int[] arr={1,3,6,8,9,16,20,116};

        int res=floor(arr,112);
        System.out.println(res);
    }
    static int floor(int[] arr,int floor){

        int start=0;
        int end=arr.length-1;


        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>floor){
                end=mid-1;

            }
            else if(arr[mid]<floor){
                start=mid+1;
            }else return mid;

        }
        return start;
    }
}
