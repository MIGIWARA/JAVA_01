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
