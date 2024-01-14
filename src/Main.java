import model.Person;
import model.Season;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  для обращения к полям пречисления обрщаемся через имя класса
        //  Season.FALL
        ////Season.FALL = null;  нелзя изменять
        ////Season season = new Season(); невозможно создовать новые объекты перечисления

        Season season1 = Season.WINTER;
        Season season2 = Season.WINTER;

        ///сылки на одит и тотже обект true
        System.out.println(season1 == season2);

        //обекты по 2м ссыклкам идентичны(один и тот же объект) true

        System.out.println(season1.equals(season2));
        Season season3 = Season.SUMMER;
        ////разные сыклик false
        System.out.println(season1 == season3);
        //ссыклки на неравные    неодинаковые объекты
        System.out.println(season1.equals(season3));


        System.out.println(season3);  ///toString
        System.out.println(season3.name());
        System.out.println(season3.ordinal());

        String str1 = "FAlL";  //// можно использовать большие буквы и маленькие
        ///приводим к верхнему регистру
        str1 = str1.toUpperCase();
        ///из строки получить элемент перечисления
        Season season4 = Season.valueOf(str1);


        ///  Season season4 - switch (str1){
        /////  case "WINTER", "SPRING",


        System.out.println(season4);

        System.out.println("---------------------");

        switch (season2) {
            case WINTER:
                System.out.println("холодно");
                break;
            case SPRING:
                System.out.println("тепло");
                break;
            case SUMMER:
                System.out.println("жарко");
                break;
            case FALL:
                System.out.println("сыро");
                break;
        }



        System.out.println("--------///////------------");

        ///масив всех элементов перечисления



        for (Season value : Season.values()){
            System.out.println(value);
        }


      ///// обращение к конкретному элементу перечисление через моссив по индексу
        System.out.println(Season.values()[0]);


        System.out.println("--------/////////-------------");




        Person person1 = new Person("Igor", Season.FALL);
        System.out.println(person1);

        Scanner scanner = new Scanner(System.in);
        String strName = null;
        String strSeason = null;
        System.out.println("введите имя");
        strName = scanner.nextLine();
        System.out.println("введите пору года");
        strSeason =scanner.nextLine();

        strSeason = strSeason.toUpperCase();
        Season season5 = switch (strSeason){
            case "WINTER", "SPRING", "SUMMER", "FALL" -> Season.valueOf(strSeason);
            default -> null;

        };
        Person person2 = new Person(strName, season5);
        System.out.println(person2);
    }

}



