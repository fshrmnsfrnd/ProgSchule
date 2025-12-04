package sortieralgorithmen;

import java.util.LinkedList;
import java.util.List;

public class BTIN2sort
{

    public static void selectionsort(int[] numbers)
    {
        for (int i = 0; i < numbers.length - 1; i++)
        {
            int indexMin = i;
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[j] < numbers[indexMin])
                {
                    indexMin = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
    }

    public static void mergesort(List<Integer> numbers) {
        LinkedList<List<Integer>> groupOfLists = new LinkedList<>();
        // split
        while (!numbers.isEmpty()) {
            Integer number = numbers.remove(0);
            LinkedList<Integer> newList = new LinkedList<>();
            newList.add(number);
            groupOfLists.add(newList);
        }

        // merge
        while (groupOfLists.size() > 1) {
            List<Integer> list1 = groupOfLists.removeFirst();
            List<Integer> list2 = groupOfLists.removeFirst();

            groupOfLists.addLast(merge(list1, list2));
        }

        numbers.addAll(groupOfLists.getFirst());
    }

    //Hilfsmethode für mergesort: Zusammenmischen
    private static LinkedList<Integer> merge(List<Integer> list1, List<Integer> list2) {
        LinkedList<Integer> merged = new LinkedList<>();

        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.get(0) < list2.get(0)) {
                merged.add(list1.remove(0));
            } else {
                merged.add(list2.remove(0));
            }
        }
        merged.addAll(list1);
        merged.addAll(list2);
        return merged;
    }

    //Nach außen sichtbare Quicksort-Methode zum bequemen Aufrufen
    public static void quicksort(int[] numbers){
        quicksort(numbers, 0, numbers.length - 1);    // Hinweis: Bei Arrays greift die Referenzautomatik.
    }

    private static void quicksort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int pivot = split(numbers, begin, end);
            quicksort(numbers, begin, pivot - 1);
            quicksort(numbers, pivot + 1, end);
        }
    }

    //Hilfsmethode für Quicksort: Teilen (eigentlich der Kern des Algorithmus
    private static int split(int[] numbers, int begin, int end) {
        int left = begin + 1;
        int right = end;

        while (left < right) {
            while (numbers[left] < numbers[begin] && left < end) {
                left++;
            }

            while (numbers[right] >= numbers[begin] && right > begin) {
                right--;
            }

            if (left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        }

        if (numbers[begin] > numbers[right]) {
            int temp = numbers[begin];
            numbers[begin] = numbers[right];
            numbers[right] = temp;
        }
        return right;
    }
}
