import java.util.ArrayList;
import java.util.List;

public class Arrays1 {

     public static int[] after4(int[] arr){
        List<Integer> arrListAfter = new ArrayList<Integer>();
        boolean isFour = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4) {
                arrListAfter.clear();
                isFour = true;
            }
            else arrListAfter.add(arr[i]);
        }

        if(!isFour)
            throw new RuntimeException("В массиве нет цифры 4");

        int[] arrAfter = new int[arrListAfter.size()];

        for (int i = 0; i < arrListAfter.size(); i++) {
            arrAfter[i] = arrListAfter.get(i);
        }
        return arrAfter;
    }
}
