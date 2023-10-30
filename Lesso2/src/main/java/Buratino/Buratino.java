//Буратино и яблоки
//Объявить целочисленную переменную, в которой количество
// яблок у Буратино Объявить целочисленную переменную,
// в которой записано, сколько яблок отобрал у него Карабас Барабас.
// Объявить целочисленную переменную, в которой записано,
// сколько яблок осталось у Буратино , после того, как
// Карабас Барабас отобрал у него яблоки.

        package Buratino;

public class Buratino {
    public static void main(String[] args) {

        int buratinas_apples = 6;
        int selected_carabas = 4;
        int remains_apples = buratinas_apples - selected_carabas;
        System.out.println("У Буратино было "
                + buratinas_apples + " яблок");
        System.out.println("Карабас отобрал "
                + selected_carabas + " яблока");
        System.out.println("Осталось у Буратино "
                + remains_apples + " яблока");
            }
}
