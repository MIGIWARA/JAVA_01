public class number_07 {
    public static void main(String[] args) {
        System.out.println(determineAdult(-1));
    }

    public static boolean determineAdult(int age) {
        if (age >= 18) {
            return true;
        } else if (age < 18 && age >=0) {
            return false;
        } else if (age < 0) {
            System.out.println("Ошибка! Введите правильный возраст.");
        }
        return false;
    }
}
