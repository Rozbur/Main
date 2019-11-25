package SeaBattle;

public class GameLauncher {
    public static void main(String[] args){
        CheckShot dot=new CheckShot();                  //Создаю экземпляр класса CheckShot
        int[] locations={2,3,4};                    //Создаю массив для местоположения коробля

        dot.setLocationShip(locations);             //Вызываю сеттер CheckShot'а. т.е отправляю координаты корабля из массива locations в объект CheckShot(там их принимает тоже массив)
        String userGuess="2";                       //Делаем ход от имени юзера
        String result=dot.checkShot(userGuess);     //Вызываю метод checkShot() объекта CheckShot
    }
}
