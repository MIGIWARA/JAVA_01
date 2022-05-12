public class number_13 {
    public static void main(String[] args) {
        double a = 2.5;
        double b = 5.0;
        double c = 8.0;
        boolean b1 = doubleExpression(a, b, c);
        System.out.println(b1);

    }
    public static boolean doubleExpression(double a, double b, double c){
        return Math.abs(a + b - c)<=0.0001;
    }

}
