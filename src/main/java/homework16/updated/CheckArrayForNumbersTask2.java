package homework16.updated;

/**
 * Java Pro. Homework #12
 * @author Igor Cijov
 * @version 17 Aug 2022
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckArrayForNumbersTask2 {
    /*
     * 2. Massiv doljen soderjati:
     * - toliko znacenie numberOne i numberTwo, inace false
     * - hotea bi odno numberOne i numberTwo, inace false
     */
    public boolean checkArrayForNumbersClassic(int[] array, int numberOne, int numberTwo) {
        int countOne = 0;
        int countTwo = 0;
        for (int i : array) {
            if (i == numberOne) {
                countOne++;
            } else if (i == numberTwo) {
                countTwo++;
            } else {
                return false;
            }
        }
        return countOne > 0 && countTwo > 0;
    }

    /*
     * Reshenie zadaci #2 s ispolizovaniem Collections
     */
    public boolean checkArrayForNumbersCollections(int[] array, int numberOne, int numberTwo) {
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        Set<Integer> arraySet = new HashSet<>(arrayList);
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(numberOne, numberTwo));
        return arraySet.equals(numberSet);
    }

    /*
     * Reshenie zadaci #2 s ispolizovaniem Stream
     */

    public boolean checkArrayForNumbersStream(int[] array, int numberOne, int numberTwo) {
        boolean containsNotAllowNumbers = Arrays.stream(array)
                .filter(i -> i != numberOne && i != numberTwo)
                .count() != 0;
        boolean containsNumberOne = Arrays.stream(array)
                .anyMatch(i -> i == numberOne);
        boolean containsNumberTwo = Arrays.stream(array)
                .anyMatch(i -> i == numberTwo);
        return !containsNumberOne && containsNumberOne && containsNumberTwo;
    }
}
