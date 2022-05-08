/**
 * Создайте метод static int incrementIfPositive, который будет принимать
 * целочисленный параметр и возвращать это же число, увеличенное на единицу,
 * если оно больше 0, в противном случае метод должен возвращать число без изменений.
 */
public class number_05 {
    // метод main чисто для меня
    public static void main(String[] args) {
       int result = incrementIfPositive(1);
        System.out.println(result);
    }
    public static int incrementIfPositive(int a) {
        if(a < 0 || a == 0){
            return a;
        }else if(a > 0) {
            a++;
        }
        return a;
    }
}
