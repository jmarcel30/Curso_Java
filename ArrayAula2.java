import java.util.Arrays;

public class ArrayAula2 {
    public static void main(String[] args) {
            
        int[] num={3,5,8,4,6,1,5,7,2,9,0,10};

        // Arrays.sort(num);
        // Arrays.fill(num,11);
           System.arraycopy(args, 0, num, 0, 0);
        // for nomral
        /*for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }*/
        // for simplificado

         // Arrays.sort(num); 
        for(int n:num){
            System.out.printf("%d - ",n);
        }
    }
}
