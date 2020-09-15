public class Arrays2 {

    public static boolean isOneAndFour(int[] arr){
        boolean isOne = false;
        boolean isFour = false;
        boolean isNotOtherNum = true;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                isOne = true;
            else if(arr[i] == 4)
                isFour = true;
            else isNotOtherNum = false;
        }
        return (isOne && isFour && isNotOtherNum);
    }
}
