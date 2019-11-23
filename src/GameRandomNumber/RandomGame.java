package GameRandomNumber;

public class RandomGame {
    Player p1;           //Тут описаны три переменных которые содержит наш оъект RandomGame
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); //Тут создаются три объекта Player и присваеваем им трем переменным экземпляра.
        p2 = new Player();
        p3 = new Player();

        int randomp1 = 0; //Тут создаю три переменных для хранения варианта ответа от каждого игрока
        int randomp2 = 0;
        int randomp3 = 0;

        boolean p1win = false;  //Тут задаются логические значения для ответов игроков тру/фалс
        boolean p2win = false;
        boolean p3win = false;

        int targetNumber = (int) (Math.random() * 10); //Тут генерится число которое нужно угадать, число от 0 до 1(не включая 1), например 0.3, и умножается на 10, чтобы было 3)
        System.out.println("Я загадываю число от 0 до 9");

        while (true) {  //Бесконечный цикл пока его не прервет break. А break прервет по моим условиям (47-59)
            System.out.println("Число которое нужно угадать - " + targetNumber);

            p1.guess(); //Вызываю метод guess из объекта Player(из этого объекта, потому что раньше я создавал p1,p2,p3 как переменные из Playera, стррока 9-11)
            p2.guess();
            p3.guess();

            randomp1 = p1.number;
            System.out.println("Первый думает это - " + randomp1);    //Извлекаем варианты ответов игроков(Результат работы их методов guess()).
            randomp2 = p2.number;                                     //Получая доступ к их переменным number.
            System.out.println("Второй думает это - " + randomp2);
            randomp3 = p3.number;
            System.out.println("Третий думает это - " + randomp3);

            if (randomp1 == targetNumber) {
                p1win = true;
            }                                   //Сравниваем загаданное число с вариантами ответов от игроков и присваиваем им значение тру, если они угадали
            if (randomp2 == targetNumber) {     //Если в скобках истина, тогда игроку присваивается значение тру.
                p2win = true;
            }
            if (randomp3 == targetNumber) {
                p3win = true;
            }
            if (p1win || p2win || p3win) {
                System.out.println("Есть победитель");
                if (p1win) {
                    System.out.println("Первый игрок победил");
                }
                if (p2win) {
                    System.out.println("Второй игрок победил");
                }
                if (p3win) {
                    System.out.println("Третий игрок победил");
                }
                System.out.println("Конец игры!");
                break;
            } else {
                System.out.println("Пробуем загадать еще раз");
            }
        }
    }
}