
import java.nio.file.Files;
import java.io.*;
import java.io.IOException;

public class Task1L2 {// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации (после перемещения числа) запишите в лог-файл.
//public static int[] Bubble(int[] array) {
//    int temp = 0;
//    int size = array.length;
//    for (int i = 0; i < size - 1; i++) {
//        if (array[i] >= array[i + 1]) {
//            temp = array[i + 1];
//            array[i + 1] = array[i];
//            array[i] = temp;


    //        }
//    }
//    return array;
//}
    public static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] array = new int[]{1, 4, 2, 6, 4, 8, 9, 3, 1, 5};
        String file_name = "Test1";
//
        File file = new File(file_name);
        try{
            FileWriter fileW = new FileWriter(file, true);
            fileW.write(listSort(array));
        }catch (Exception e){
            System.out.println("Bad");

        }


        try {
            FileReader reader = new FileReader(file);
            char[] a = new char[(int) file.length()];
            reader.read(a);
            for (char c : a) {
                System.out.print(c);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Что- то пошло не так");
        }


    }
}


