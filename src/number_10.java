/**
 * Создайте метод public static int getMinFromTwo(int x, int y),
 * который принимает два целочисленных параметра и возвращает
 * наименьший из них.
 *
 * Создайте метод public static int getMinFromFour(int x, int y, int m, int n),
 * который принимает четыре целочисленных параметра и возвращает
 * наименьший из них.
 *
 * При том второй метод должен использовать первый.
 */
public class number_10 {
    public static void main(String[] args) {
        int result = getMinFromTwo(5,3);
        System.out.println(result);
        int result1 = getMinFromFour(5,3,4, 1);
        System.out.println(result1);
    }
    public static int getMinFromTwo(int x, int y){
        return Math.min(x, y);
    }

    public static int getMinFromFour(int x, int y, int m, int n){
        return getMinFromTwo(Math.min(x, y),Math.min(m, n));

    }
}
