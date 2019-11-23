package FirstTest;

// Генератор фразы из трех массивов
public class ArrayWord {
    public static void main(String[] args){
        String[] wordListOne={"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный-выйгрыш", "фронтэнд", "на основе веб технологий", "проникающий", "умный", "шесть сигм", "метод крического пути", "динамичный"};
        String[] wordListTwo={"уполномоченный", "трудный", "ориентированный", "центральный", "распределенный", "кластеризированный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "начеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree={"Процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        //Вычисление количества элементов в массиве
        int oneLenght=wordListOne.length;
        int twoLenght=wordListTwo.length;
        int threeLenght=wordListThree.length;

        //Генерируем три рандомных числа
        int rand1=(int) (Math.random()*oneLenght);
        int rand2=(int) (Math.random()*twoLenght);
        int rand3=(int) (Math.random()*threeLenght);

        //Строи фразу
        String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " +phrase);

    }
}
