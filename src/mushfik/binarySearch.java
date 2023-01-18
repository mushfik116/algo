package mushfik;

public class binarySearch {
    public static void main(String[] args) {
        //ascending array
        int[] arr={1,3,5,6,8,12,16,19,49,96,116};

        int res= bin(arr,16);
        System.out.println(res);
    }

    static int bin(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
        int m=s+(e-s)/2;

        if(arr[m]<target){
            s=m+1;

        }

       else if(arr[m]>target){
            e=m-1;

        }else {return m;}
        }
        return -1;
    }
}
//there is issue in last.solved ..it was while(s<e).. where it should be s<=e