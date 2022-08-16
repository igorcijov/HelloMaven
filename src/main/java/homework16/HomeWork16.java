package homework16;

import java.util.ArrayList;
import java.util.List;

public class HomeWork16 {

    public static Integer[] arrayPullOut(int[] array, int value) {
        List<Integer> indexList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                indexList.add(i);
            }

        }
        try {
            for (int i = indexList.get(0) + 1; i < array.length; i++) {
                newList.add(array[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        Integer[] newArray = new Integer[newList.size()];
        newArray = newList.toArray(newArray);
          /*  for (Integer i :newArray) {
                System.out.println(i);
            }*/
        System.out.println(newList);
        return newArray;

    }
}
