//Саруман и Ланнистеры
// Объявить целочисленную переменную, в которой количество
// пехотинцев у Ланнистеров. Объявить целочисленную переменную,
// в которой количество орков в войске Сарумана.
// Объявить целочисленную переменную, в которой общее
// количество пехоты в союзе Ланнистеров и Сармана.

package Saruman;

public class Saruman {
    public static void main(String[] args) {
        int infantrymens_lannisters = 10;
        int orks_saruman = 16;
        int allied_army = infantrymens_lannisters + orks_saruman;
        System.out.println("пехотинцев у Ланнистеров "
                + infantrymens_lannisters);
        System.out.println("войска Сарумана "
                + orks_saruman);
        System.out.println("Армия союзников "
                + allied_army);
            }
}

