/**
 * Урок с кодом
 * Cоздайте метод static int[] fillArray(int x), который принимает целое
 * число и возвращает массив целых чисел, размером равный этому числу и
 * заполненный числами от 0 до числа, меньшего на единицу, чем принятое.
 *
 * Пример ввода параметра: 3
 * Пример возвращаемого массива: [0,1,2]
 */
public class number_11 {
    public static void main(String[] args) {
        fillArray(9);
    }
    static int[] fillArray(int x){
        int[] values = new int [x];
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
            System.out.print(values[i]+" ");

        }
        return values;
    }

}
