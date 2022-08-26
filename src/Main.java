import java.util.Arrays;
import java.util.Scanner;

public class Main
//удаление элемента и его повторений из массива
{
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 5, 1, 11, 93, 5, 12, 8, 9, 5, 8, 12};
        showArray(array);
        System.out.println("Массив после удаления элемента(ов)");
        System.out.println(Arrays.toString(removeElement(array)));
    }

    public static void showArray(int[] array)
    {
        System.out.println("Массив до удаления элемента(ов)");
        System.out.println(Arrays.toString(array));
    }
    public static int[] removeElement(int[] array) {
        int count = 0;
        int elementForDelete = Interactive.dialogBoxForDelete();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementForDelete) {
                count++;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                }
            }
        }
        int[] arrayWitDelete = new int[array.length - count];

        for(int i = 0; i < arrayWitDelete.length; i++)
        {
            arrayWitDelete[i] = array[i];
        }
        return arrayWitDelete;
    }
}