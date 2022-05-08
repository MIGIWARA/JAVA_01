/**
 * Известно, что 1 мм осадков - это один литр воды, вылитый на квадратный
 * метр за 12 часов.
 * Напишите метод static long determineRainfall(double area, double rainfallAmount),
 * который будет принимать площадь в квадратных километрах и осадки в мм и
 * возвращать количество выпавших осадков за сутки на этой площади.
 */
public class number_08 {
    public static void main(String[] args) {
        System.out.println(determineRainfall(8,12));
    }
    public static long determineRainfall(double area, double rainfallAmount) {
        double result =  ((area * 1000000) * (rainfallAmount * 2));
        return (long) result;
    }
}
