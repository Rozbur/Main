package SeaBattle;

public class CheckShot {
    int[] locationShip;                                         //Массив адрессов для хранения ячеек
    int numOfHits=0;                                            //Кол-во попаданий

    public void setLocationShip(int[] locs){
        locationShip=locs;
    }
    public String checkShot(String stringGuess){                //Получаю ход игрока(stringGuess) в виде строкового параметра
        int guess=Integer.parseInt(stringGuess);                //Преобразование значения в скобках типа Стринг в Интеджер
        String result="Мимо";                                   //Создана переменная для результата, который буду возвращать. Для начала присвою ему значение "Мимо"
        for (int Ship : locationShip) {                         //Повторять для каждой ячейки из массива locationShip(В нём хранятся адресса трёх ячеек в виде переменных типа int - 2,3,4 и т.д.)
            if (guess == Ship){                                 //Сравнивается ход игрока с этим элементм(ячейкой) массива. Если равны, значит попал
                result="Попал";
                numOfHits++;                                    //numOfHits - это количесвто попаданий.
                break;                                          //Выход из цикла
            }
        }
        if (numOfHits==locationShip.length){                     //Вышли из цикла, но проверка если количество попаданий равно кол-ву ячеек в массиве, то значит попал я во все ячейки корабля, а значит корабль потоплен
            result="Потопил";
        }
        System.out.println(result);
        return result;                                          //Возвращаем результат в вызывающий метод
    }
}
