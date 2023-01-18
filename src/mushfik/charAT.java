package mushfik;

public class charAT {
    public static void main(String[] args) {
        String string="jilysmk";



        boolean res= findIndex(string,'k');
        System.out.println(res);


    }
    static boolean findIndex(String arr,char a){

        for (int i=0;i< arr.length();i++){
            if(arr.charAt(i)==a){
                return true;
            }
        }
        return false;

    }
}
