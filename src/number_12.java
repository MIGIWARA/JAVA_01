/**
 * Cоздайте public static (мы делаем класс статическим исключительно
 * для корректной работы проверяющей системы) класс Human, содержащий
 * поля String name и int age.
 *
 * У класса Human должен быть метод public void sayHello(), который
 * выводит в консоль, “Привет, меня зовут {name}, мне {age} лет.”.
 *
 * В методе main создайте объект класса Human, заполните его поля и
 * вызовите метод sayHello().
 */
public class number_12 {
    public static class Human{
        private String name;
        private int age;
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void sayHello(){
            System.out.println("Привет, меня зовут " + name +", мне" + age +" лет.");
        }
    }

    public static void main(String[] args) {
        Human hello = new Human("Misak", 21);
        hello.sayHello();
    }
}
