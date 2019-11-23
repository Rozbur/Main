package FirstTest;

// Создаем проверочный класс
public class DogTest {
    public static void main(String[] args){
        //Проверочный код
        Dog d=new Dog(); //Создаем объект класса FirstTest.Dog
        d.size=40; // Используем оператор доступа. Устанавливаю значение поля size
        d.bark(); // Вызываю метод bark из класса FirstTest.Dog

    }
}
