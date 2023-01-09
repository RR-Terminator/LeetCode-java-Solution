import java.util.Arrays;

public class LeetCode_Problem_888 {
    public static void main(String[] args) {

        int [] a = {1,2};
        int [] b = {2,3};

        System.out.println(Arrays.toString(fairCandySwap(a,b)));

    }

//    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//        int AliceTotal = 0;
//        int bobTotal = 0;
//
//        for (int i = 0; i < (aliceSizes.length ); i++) {
//            AliceTotal +=aliceSizes[i];
//        }
//        for (int j = 0; j < bobSizes.length; j++) {
//            bobTotal += bobSizes[j];
//
//        }
//        int diff = AliceTotal - (bobTotal+AliceTotal)/2;
//        for (int i = 0; i < aliceSizes.length; i++) {
//            for (int j = 0; j < bobSizes.length; j++) {
//                if (aliceSizes[i]-bobSizes[j] == diff) {
//                    return new int[] {aliceSizes[i], bobSizes[j]};
//                }
//            }
//        }
//
//
//
//        return null;
//    }

    public static int[] fairCandySwap(int[] a, int[] b) {
        int AT = 0;
        int BT = 0;
        for(int i : a){
            AT+=i;
        }
        for(int i : b){
            BT+=i;
        }
        int diff = AT + (BT-AT) /2;
        for(int i =0 ; i<a.length ; i++){
            for(int j =0 ; j<b.length ; j++){
                if(a[i]-b[j]==diff){
                    return new int[]{ a[i],b[j]};
                }
            }
        }
        return null;
    }

}
