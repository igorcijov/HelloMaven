package homework16.updated;

/**
 * Java Pro. Homework #12
 * @author Igor Cijov
 * @version 17 Aug 2022
 */

/*
 * 1. Vernuti fragment massiva posle poslednevo znacenie == number
 */

public class SelectPartArrayFromNumberTask1 {
    public int[] selectPartArrayFromNumber(int[] array, int number) {

        //nahodim index paslednevo elementa == number
        // klassiceskii variant
        int index = -1;                                                    //imperativnii padhod
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        // zadanovo cisla net - brosem iskliucenie
        if (index < 0) {
            throw new RuntimeException("The array doesn't contain a number: " + number);
        }

        // ispolizuem stream
       /* index = IntStream.range(0, array.length)                      //deklarativnii padhod
                .map(i -> array.length - i - 1)
                .filter(i -> array[i] == number)
                .findFirst().orElseThrow(() -> new RuntimeException("The array doesn't contain a number: " + number));*/

        //sozdaiom rezultiruishii masiv
        int[] result = new int[array.length - index - 1];

        // zapolneaem masiv
        System.arraycopy(array, index + 1, result, 0, array.length - index - 1);
        return result;
    }

}
